
-- 주문 상태 코드
CREATE TABLE order_status_code (
    status_code       NUMBER(1)    PRIMARY KEY,
    status_name       VARCHAR2(50) NOT NULL,
    status_description VARCHAR2(200)
);

-- 회원
CREATE TABLE mss_user (
    user_id     VARCHAR2(20)  PRIMARY KEY,
    user_pw     VARCHAR2(30)  NOT NULL,
    user_name   VARCHAR2(50)  NOT NULL,
    user_nick   VARCHAR2(100),
    user_birth  DATE          NOT NULL,
    user_phone  VARCHAR2(11)  NOT NULL,
    user_addr   VARCHAR2(300) NOT NULL,
    user_email  VARCHAR2(50)
);

-- 주문
CREATE TABLE mss_order (
    order_no    NUMBER(10)   PRIMARY KEY,
    order_date  DATE         NOT NULL,
    status_code NUMBER(1)    REFERENCES order_status_code(status_code),
    user_id     VARCHAR2(20) REFERENCES mss_user(user_id)
);

-- 주문 상세
CREATE TABLE mss_order_detail (
    od_no        NUMBER(10)  PRIMARY KEY,
    p_code   	 VARCHAR2(6) REFERENCES product_tbl(p_code),
    order_no     NUMBER(10)  REFERENCES mss_order(order_no),
    od_quantity  NUMBER(5)   DEFAULT 1,
    od_unit_price NUMBER(10,2) NOT NULL
);

-- 결제
CREATE TABLE mss_payment (
    pay_no       NUMBER(10)  PRIMARY KEY,
    pay_date     DATE        NOT NULL,
    pay_total_amt NUMBER(20,2),
    pay_curr_amt  NUMBER(20,2),
    pay_card     VARCHAR2(30),
    pay_card_no  VARCHAR2(20),
    pay_monthly  NUMBER(5)   DEFAULT 0,
    pay_ok       VARCHAR2(50),
    pay_status   NUMBER(1),            -- 0:승인대기 1:승인완료 등
    order_no     NUMBER(10) REFERENCES mss_order(order_no)
);

COMMIT;



DROP TABLE mss_payment         CASCADE CONSTRAINTS;
DROP TABLE mss_order_detail    CASCADE CONSTRAINTS;
DROP TABLE mss_order           CASCADE CONSTRAINTS;
DROP TABLE mss_product         CASCADE CONSTRAINTS;
DROP TABLE mss_category        CASCADE CONSTRAINTS;
DROP TABLE mss_brand           CASCADE CONSTRAINTS;
DROP TABLE mss_user            CASCADE CONSTRAINTS;
DROP TABLE order_status_code   CASCADE CONSTRAINTS;

-- =========================
-- 1) BRAND
-- =========================
CREATE TABLE brand_tbl (
  b_code VARCHAR2(5)  PRIMARY KEY
    CHECK (b_code LIKE 'B%'),            -- 예: B1, B2 ...
  b_name VARCHAR2(80) NOT NULL
);

-- =========================
-- 2) CATEGORY (계층형: parent_cd 포함)
-- =========================
CREATE TABLE category_tbl (
  c_code    VARCHAR2(5)  PRIMARY KEY,    -- 예: T01/B01/J01, T11 등
  c_name    VARCHAR2(60) NOT NULL,
  parent_cd VARCHAR2(5)                   -- 루트면 NULL
);

ALTER TABLE category_tbl
  ADD CONSTRAINT fk_category_parent
  FOREIGN KEY (parent_cd) REFERENCES category_tbl(c_code);

-- =========================
-- 3) PRODUCT
-- =========================
CREATE TABLE product_tbl (
  p_code  VARCHAR2(6)   PRIMARY KEY
    CHECK (p_code LIKE 'P%'),             -- 예: P00001
  b_code  VARCHAR2(5)   NOT NULL REFERENCES brand_tbl(b_code),
  c_code  VARCHAR2(5)   NOT NULL REFERENCES category_tbl(c_code),
  p_name  VARCHAR2(320) NOT NULL
);

-- =========================
-- 4) PRICE (원가/할인/최종가)
-- =========================
CREATE TABLE price_tbl (
  p_code        VARCHAR2(6)  PRIMARY KEY
                 REFERENCES product_tbl(p_code),
  cost_price    NUMBER(12,2) NOT NULL CHECK (cost_price >= 0),
  discount_pct  NUMBER(5,2)  DEFAULT 0 NOT NULL CHECK (discount_pct BETWEEN 0 AND 100),
  final_price   NUMBER(12,2)
                 GENERATED ALWAYS AS (ROUND(cost_price * (1 - (discount_pct/100)), 2)) VIRTUAL
);


-- =========================
-- 5) 샘플 데이터
-- =========================

-- 5-1) 브랜드
INSERT INTO brand_tbl VALUES ('B1','드로우핏');
INSERT INTO brand_tbl VALUES ('B2','시그니처');
INSERT INTO brand_tbl VALUES ('B3','베이스 클레프');

-- 5-2) 카테고리 (루트)
INSERT INTO category_tbl VALUES ('T01','상의',   NULL);
INSERT INTO category_tbl VALUES ('B01','하의',   NULL);
INSERT INTO category_tbl VALUES ('J01','주얼리', NULL);

-- 5-3) 카테고리 (하위)
-- 상의
INSERT INTO category_tbl VALUES ('T11','셔츠',   'T01');
INSERT INTO category_tbl VALUES ('T12','티셔츠', 'T01');
INSERT INTO category_tbl VALUES ('T13','니트',   'T01');
-- 하의
INSERT INTO category_tbl VALUES ('B11','트레이닝 팬츠', 'B01');
INSERT INTO category_tbl VALUES ('B12','데님 팬츠',     'B01');
INSERT INTO category_tbl VALUES ('B13','슬랙스',        'B01');
-- 주얼리
INSERT INTO category_tbl VALUES ('J11','목걸이', 'J01');
INSERT INTO category_tbl VALUES ('J12','팔찌',   'J01');
INSERT INTO category_tbl VALUES ('J13','링',     'J01');

-- 5-4) 상품
INSERT INTO product_tbl VALUES ('P00001','B1','T11','해밀턴 미니멀 체크 셔츠');
INSERT INTO product_tbl VALUES ('P00002','B2','B13','사이드 딥 원턱 슬랙스');
INSERT INTO product_tbl VALUES ('P00003','B1','T13','올 헤어리 노르딕 크루넥 니트');
INSERT INTO product_tbl VALUES ('P00004','B3','J13','써지컬스틸 체인링 B CLEFF NO.2 RNG');
INSERT INTO product_tbl VALUES ('P00005','B2','B11','커브드 트레이닝 팬츠');
INSERT INTO product_tbl VALUES ('P00006','B3','J11','블랙 짧은 초커 CLEFF BASSWHISPER');
INSERT INTO product_tbl VALUES ('P00007','B1','T12','실켓 코튼 U넥 티셔츠');
INSERT INTO product_tbl VALUES ('P00008','B3','J12','사각 팔찌 써지컬 CLEFF ORBIT BRC');
INSERT INTO product_tbl VALUES ('P00009','B2','B12','커브드 엔진 데님 팬츠');

-- 5-5) 가격
INSERT INTO price_tbl (p_code, cost_price, discount_pct) VALUES ('P00001',  39000, 10);
INSERT INTO price_tbl (p_code, cost_price, discount_pct) VALUES ('P00002',  69000, 15);
INSERT INTO price_tbl (p_code, cost_price, discount_pct) VALUES ('P00003',  59000,  0);
INSERT INTO price_tbl (p_code, cost_price, discount_pct) VALUES ('P00004',  29000,  5);
INSERT INTO price_tbl (p_code, cost_price, discount_pct) VALUES ('P00005',  49000, 20);
INSERT INTO price_tbl (p_code, cost_price, discount_pct) VALUES ('P00006',  35000,  0);
INSERT INTO price_tbl (p_code, cost_price, discount_pct) VALUES ('P00007',  19000, 10);
INSERT INTO price_tbl (p_code, cost_price, discount_pct) VALUES ('P00008',  27000,  0);
INSERT INTO price_tbl (p_code, cost_price, discount_pct) VALUES ('P00009',  79000, 25);

COMMIT;



INSERT INTO ORDER_STATUS_CODE values(1, '주문생성', '주문생성');
INSERT INTO ORDER_STATUS_CODE values(2, '결제완료', '결제완료 및 주문확정');
INSERT INTO ORDER_STATUS_CODE values(3, '배송시작', '배송시작');
INSERT INTO ORDER_STATUS_CODE values(4, '배송완료', '고객 수령 완료');
INSERT INTO ORDER_STATUS_CODE values(5, '주문취소', '주문 취소');

--SELECT * FROM ORDER_STATUS_CODE;


INSERT INTO mss_user values('user01', 'pw1234', '김하늘', '하늘이', '1998-03-15', '01012345678', '서울 마포구 양화로 12', 'sky@shop.com');
INSERT INTO mss_user values('user02', 'pw2233', '이도윤', '하늘이', '1998-03-15', '01012345678', '서울 마포구 양화로 12', 'sky@shop.com');
INSERT INTO mss_user values('user03', 'pw9988', '박지현', '하늘이', '1998-03-15', '01012345678', '서울 마포구 양화로 12', 'sky@shop.com');

--SELECT * FROM mss_user;


INSERT INTO mss_order values(1001, '2025-03-01', 2, 'user01');
INSERT INTO mss_order values(1002, '2025-03-02', 3, 'user02');
INSERT INTO mss_order values(1003, '2025-03-03', 1, 'user03');

--SELECT * FROM mss_order;



--SELECT * FROM product_tbl;

INSERT INTO mss_order_detail values(1, 'P00001', 1001, 1, 35100);
INSERT INTO mss_order_detail values(2, 'P00002', 1001, 1, 58650);
INSERT INTO mss_order_detail values(3, 'P00007', 1002, 2, 17100);
INSERT INTO mss_order_detail values(4, 'P00009', 1002, 1, 59250);
INSERT INTO mss_order_detail values(5, 'P00004', 1003, 1, 27550);



INSERT INTO MSS_PAYMENT values(5001, '2025-03-01', 93750, 93750, 'KB CARD', '1234-56**-****-7890', 0, 'APR123456', 1, 1001);
INSERT INTO MSS_PAYMENT values(5002, '2025-03-02', 93450, 93450, 'HYUNDAI', '4333-22**-****-0011', 3, 'APR789012', 1, 1002);
INSERT INTO MSS_PAYMENT values(5003, '2025-03-03', 27550, null, 'BC', null, 0, null, 0, 1003);



-- (A) 브랜드만
SELECT b_code, b_name
FROM brand_tbl
ORDER BY b_code;

-- (B) 카테고리 트리(자식-부모)
SELECT child.c_code, child.c_name,
       child.parent_cd,
       parent.c_name AS parent_name
FROM category_tbl child
LEFT JOIN category_tbl parent ON child.parent_cd = parent.c_code
ORDER BY NVL(child.parent_cd,' '), child.c_code;

-- (C) 상품만
SELECT p_code, p_name, b_code, c_code
FROM product_tbl
ORDER BY p_code;



SELECT * FROM brand_tbl;
SELECT * FROM CATEGORY_TBL;
SELECT * FROM price_tbl;



--특정 회원의 최근 주문 내역 + 결제 상태
SELECT  o.order_no			AS "주문번호",
        o.order_date		AS "주문일자",
        p.pay_total_amt     AS "총 결제금",
        p.pay_status		AS "결제상태",
        od.p_code			AS "상품코드",
        pr.p_name           AS "상품이름",
        od.od_quantity		AS "주문수량",
        od.od_unit_price	AS "상품가격"
FROM        mss_user u
JOIN        mss_order o       ON u.user_id = o.user_id
JOIN        mss_payment p     ON o.order_no = p.order_no
JOIN        mss_order_detail od ON o.order_no = od.order_no
JOIN        product_tbl pr    ON od.p_code = pr.p_code
WHERE       u.user_id = 'user01'
ORDER BY    o.order_date DESC;



-- 카테고리별(대분류) 매출 합계
SELECT  NVL(pc.c_name, '기타') AS "대분류",
        SUM(od.od_quantity * od.od_unit_price) AS "총 매출"
FROM        mss_order_detail od
JOIN        product_tbl     pr ON od.p_code = pr.p_code
JOIN        category_tbl    c  ON pr.c_code = c.c_code
LEFT JOIN   category_tbl    pc ON c.parent_cd = pc.c_code
GROUP BY    NVL(pc.c_name, '기타')
ORDER BY    "총 매출" DESC;



-- 브랜드별 평균 판매가와 최고·최저가
SELECT  b.b_name                	AS "브랜드 이름",
        ROUND(AVG(pz.final_price), 0) AS "평균 판매가",
        MAX(pz.final_price)          AS "최고 판매가",
        MIN(pz.final_price)          AS "최저 판매가"
FROM        product_tbl pr
JOIN        brand_tbl   b  ON pr.b_code = b.b_code
JOIN        price_tbl   pz ON pr.p_code = pz.p_code
GROUP BY    b.b_name
ORDER BY    "평균 판매가" DESC;








