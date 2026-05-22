CREATE OR REPLACE VIEW product_top_selling_ratio AS
SELECT *
FROM (
    SELECT
        p.product_type,
        p.product_id,
        p.product_name,
        SUM(sr.qty) AS total_qty,
        ROUND(SUM(sr.qty) / SUM(SUM(sr.qty)) OVER (PARTITION BY p.product_type) * 100, 2) AS pct_of_type,
        RANK() OVER (
            PARTITION BY p.product_type
            ORDER BY SUM(sr.qty) DESC
        ) AS rnk
    FROM store_rev_1 sr
    JOIN product_1 p
        ON sr.product_id = p.product_id
    GROUP BY p.product_type, p.product_id, p.product_name
) sub
WHERE rnk = 1
ORDER BY product_type;


select * from product_top_selling_ratio;