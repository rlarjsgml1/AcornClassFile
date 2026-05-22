-- 기존 뷰 삭제 (존재하면)
BEGIN
    EXECUTE IMMEDIATE 'DROP VIEW top5_non_dessert_pairs';
EXCEPTION
    WHEN OTHERS THEN
        IF SQLCODE != -942 THEN -- ORA-00942: table or view does not exist 무시
            RAISE;
        END IF;
END;
/

-- 뷰 생성 (동점 순위 반영)
CREATE OR REPLACE VIEW top5_non_dessert_pairs AS
SELECT *
FROM (
    SELECT 
        p.product_id       AS dessert_id,
        p.product_name     AS dessert_name,
        p2.product_id      AS other_id,
        p2.product_name    AS other_name,
        SUM(sr2.qty)       AS total_qty,
        RANK() OVER (
            PARTITION BY p.product_id
            ORDER BY SUM(sr2.qty) DESC
        ) AS rnk
    FROM store_rev_1 sr
    JOIN product_1 p 
        ON sr.product_id = p.product_id
    JOIN store_rev_1 sr2 
        ON sr.customer_id = sr2.customer_id
       AND sr.store_id    = sr2.store_id
       AND sr.ORDER_DATETIME = sr2.ORDER_DATETIME
    JOIN product_1 p2 
        ON sr2.product_id = p2.product_id
    WHERE p.product_type = '디저트'
      AND p2.product_type <> '디저트'
      AND p2.product_type <> '세트메뉴'
      AND p.product_id <> p2.product_id
    GROUP BY p.product_id, p.product_name, p2.product_id, p2.product_name
) sub
WHERE rnk <= 5;

select * from top5_non_dessert_pairs;
