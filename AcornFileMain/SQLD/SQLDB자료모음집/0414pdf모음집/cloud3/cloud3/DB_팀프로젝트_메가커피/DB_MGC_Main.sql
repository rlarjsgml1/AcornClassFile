DROP TABLE customer_1 CASCADE CONSTRAINTS;

DROP TABLE product_1 CASCADE CONSTRAINTS;

DROP TABLE store_1 CASCADE CONSTRAINTS;

DROP TABLE store_rev_1 CASCADE CONSTRAINTS;

-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE
SET DEFINE OFF;

select * from store_rev_1
order by 6 desc;




CREATE TABLE customer_1 (
    customer_id       INTEGER NOT NULL,
    customer_name     VARCHAR2(100) NOT NULL,
    customer_birthday DATE,
    customer_gender   VARCHAR2(1 CHAR),
    customer_tel      NVARCHAR2(20),
    customer_pcode    VARCHAR2(7),
    customer_addr1    VARCHAR2(150),
    customer_addr2    VARCHAR2(150)
);

ALTER TABLE customer_1
    ADD CONSTRAINT customer_ck_1 CHECK ( customer_gender IN ( 'M', 'F' ) );

ALTER TABLE customer_1 ADD CONSTRAINT customer_pk PRIMARY KEY ( customer_id );

CREATE TABLE product_1 (
    product_id        INTEGER NOT NULL,
    product_type      VARCHAR2(50),
    product_name      VARCHAR2(100),
    product_comment   VARCHAR2(1000),
    product_price     NUMBER(15, 2),
    product_realprice NUMBER(15, 2)
);

ALTER TABLE product_1 ADD CONSTRAINT product_pk PRIMARY KEY ( product_id );

CREATE TABLE store_1 (
    store_id    INTEGER NOT NULL,
    store_name  VARCHAR2(100) NOT NULL,
    store_tel   VARCHAR2(20),
    store_pcode VARCHAR2(7),
    store_addr1 VARCHAR2(150),
    store_addr2 VARCHAR2(150)
);

ALTER TABLE store_1 ADD CONSTRAINT store_pk PRIMARY KEY ( store_id );

CREATE TABLE store_rev_1 (
    receipt_id     INTEGER NOT NULL,
    store_id       INTEGER NOT NULL,
    customer_id    INTEGER NOT NULL,
    product_id     INTEGER NOT NULL,
    qty            NUMBER(11),
    order_datetime TIMESTAMP
);

ALTER TABLE store_rev_1 ADD CONSTRAINT store_rev_pk PRIMARY KEY ( receipt_id );

ALTER TABLE store_rev_1
    ADD CONSTRAINT store_rev_customer_fk FOREIGN KEY ( customer_id )
        REFERENCES customer_1 ( customer_id );

ALTER TABLE store_rev_1
    ADD CONSTRAINT store_rev_product_fk FOREIGN KEY ( product_id )
        REFERENCES product_1 ( product_id );

ALTER TABLE store_rev_1
    ADD CONSTRAINT store_rev_store_fk FOREIGN KEY ( store_id )
        REFERENCES store_1 ( store_id );



-- Oracle SQL Developer Data Modeler 요약 보고서: 
-- 
-- CREATE TABLE                             4
-- CREATE INDEX                             0
-- ALTER TABLE                              8
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0


-- 고객 데이터 삽입
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (1, '김도윤', TO_DATE('2010-03-15', 'YYYY-MM-DD'), 'M', '010-1000-0001', '1000001', '서울 강남구 도산대로', '101호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (2, '이지우', TO_DATE('2011-07-22', 'YYYY-MM-DD'), 'F', '010-1000-0002', '1000002', '부산 해운대구 우동', '102호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (3, '박하준', TO_DATE('2005-11-09', 'YYYY-MM-DD'), 'M', '010-1000-0003', '1000003', '대구 수성구 범어동', '103호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (4, '최서연', TO_DATE('2006-05-30', 'YYYY-MM-DD'), 'F', '010-1000-0004', '1000004', '인천 연수구 송도동', '104호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (5, '장민준', TO_DATE('2002-02-14', 'YYYY-MM-DD'), 'M', '010-1000-0005', '1000005', '광주 북구 용봉동', '105호');

INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (6, '백지아', TO_DATE('2000-08-19', 'YYYY-MM-DD'), 'F', '010-1000-0006', '1000006', '대전 서구 둔산동', '106호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (7, '윤도현', TO_DATE('1999-01-10', 'YYYY-MM-DD'), 'M', '010-1000-0007', '1000007', '울산 남구 삼산동', '107호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (8, '한예은', TO_DATE('1996-04-18', 'YYYY-MM-DD'), 'F', '010-1000-0008', '1000008', '경기 성남시 분당구', '108호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (9, '정세진', TO_DATE('1995-12-05', 'YYYY-MM-DD'), 'F', '010-1000-0009', '1000009', '충북 청주시 상당구', '109호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (10, '노지훈', TO_DATE('1993-09-03', 'YYYY-MM-DD'), 'M', '010-1000-0010', '1000010', '강원 춘천시 석사동', '110호');

INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (11, '이하린', TO_DATE('1989-06-27', 'YYYY-MM-DD'), 'F', '010-1000-0011', '1000011', '전북 전주시 완산구', '111호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (12, '서건우', TO_DATE('1985-02-01', 'YYYY-MM-DD'), 'M', '010-1000-0012', '1000012', '경북 포항시 북구', '112호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (13, '조민지', TO_DATE('1982-07-09', 'YYYY-MM-DD'), 'F', '010-1000-0013', '1000013', '충남 천안시 서북구', '113호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (14, '신지후', TO_DATE('1979-10-25', 'YYYY-MM-DD'), 'M', '010-1000-0014', '1000014', '제주 제주시 이도이동', '114호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (15, '최예빈', TO_DATE('1975-05-06', 'YYYY-MM-DD'), 'F', '010-1000-0015', '1000015', '서울 마포구 서교동', '115호');

INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (16, '이서준', TO_DATE('1970-08-14', 'YYYY-MM-DD'), 'M', '010-1000-0016', '1000016', '경기 고양시 일산서구', '116호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (17, '강수민', TO_DATE('1968-03-19', 'YYYY-MM-DD'), 'F', '010-1000-0017', '1000017', '서울 노원구 공릉동', '117호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (18, '홍지후', TO_DATE('1965-12-12', 'YYYY-MM-DD'), 'M', '010-1000-0018', '1000018', '부산 사하구 하단동', '118호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (19, '오하나', TO_DATE('1962-04-03', 'YYYY-MM-DD'), 'F', '010-1000-0019', '1000019', '경북 구미시 인동', '119호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (20, '배태현', TO_DATE('1958-11-27', 'YYYY-MM-DD'), 'M', '010-1000-0020', '1000020', '전남 목포시 상동', '120호');

INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (21, '권지민', TO_DATE('1955-01-20', 'YYYY-MM-DD'), 'F', '010-1000-0021', '1000021', '세종특별자치시 도담동', '121호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (22, '임현우', TO_DATE('1952-09-17', 'YYYY-MM-DD'), 'M', '010-1000-0022', '1000022', '서울 송파구 잠실동', '122호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (23, '정하은', TO_DATE('1949-06-11', 'YYYY-MM-DD'), 'F', '010-1000-0023', '1000023', '인천 계양구 작전동', '123호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (24, '류지호', TO_DATE('1947-02-02', 'YYYY-MM-DD'), 'M', '010-1000-0024', '1000024', '경기 수원시 영통구', '124호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (25, '서유진', TO_DATE('1945-08-08', 'YYYY-MM-DD'), 'F', '010-1000-0025', '1000025', '충북 제천시 의림동', '125호');

INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (26, '고민성', TO_DATE('2007-06-15', 'YYYY-MM-DD'), 'M', '010-1000-0026', '1000026', '경남 진주시 가좌동', '126호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (27, '문서현', TO_DATE('2003-10-10', 'YYYY-MM-DD'), 'F', '010-1000-0027', '1000027', '경기 용인시 수지구', '127호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (28, '송지환', TO_DATE('1991-12-30', 'YYYY-MM-DD'), 'M', '010-1000-0028', '1000028', '서울 종로구 명륜동', '128호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (29, '이하영', TO_DATE('1980-03-03', 'YYYY-MM-DD'), 'F', '010-1000-0029', '1000029', '부산 동래구 온천동', '129호');
INSERT INTO customer_1 (customer_id, customer_name, customer_birthday, customer_gender, customer_tel, customer_pcode, customer_addr1, customer_addr2) VALUES (30, '김영수', TO_DATE('1943-01-01', 'YYYY-MM-DD'), 'M', '010-1000-0030', '1000030', '경남 창원시 마산합포구', '130호');

-- 스토어 데이터 삽입
INSERT INTO store_1 (store_id, store_name, store_tel, store_pcode, store_addr1, store_addr2) 
VALUES (1, '서울 강남점', '02-1234-5678', '061234', '서울특별시 강남구 테헤란로 123', '1층');
INSERT INTO store_1 (store_id, store_name, store_tel, store_pcode, store_addr1, store_addr2) 
VALUES (2, '부산 해운대점', '051-234-5678', '480123', '부산광역시 해운대구 해운대로 456', '2층');
INSERT INTO store_1 (store_id, store_name, store_tel, store_pcode, store_addr1, store_addr2) 
VALUES (3, '대구 동성로점', '053-345-6789', '419123', '대구광역시 중구 동성로2가 789', '3층');
INSERT INTO store_1 (store_id, store_name, store_tel, store_pcode, store_addr1, store_addr2) 
VALUES (4, '광주 상무점', '062-456-7890', '614123', '광주광역시 서구 상무대로 321', 'B1');
INSERT INTO store_1 (store_id, store_name, store_tel, store_pcode, store_addr1, store_addr2) 
VALUES (5, '제주 연동점', '064-567-8901', '690123', '제주특별자치도 제주시 연삼로 654', '5층');

-- 제품 데이터 삽입 
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (1, '커피', '(ICE)아메리카노', '(기본 2샷) 메가MGC커피 블렌드 원두로 추출한 에스프레소에 물을 더해, 풍부한 바디감을 느낄 수 있는 스탠다드 커피', 2500, 1500);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (2, '커피', '(ICE)메가리카노', '대용량 1L 아이스 아메리카노~', 3800, 2670);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (3, '커피', '(ICE)큐브라떼', '연유를 섞은 라떼에 에스프레소를 얼린 커피큐브를 올려, 녹을수록 더 진한 커피가 느껴지는 라떼', 4700, 3620);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (4, '커피', '복숭아아이스티', '홍차의 깊은 맛과 풍부한 복숭아 향이 어우러진 달콤한 여름철 인기 음료', 3500, 1930);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (5, '커피', '쿠키프라페', '오레오의 특유의 맛과 부드러운 우유, 그리고 바닐라 향의 조화를 느낄 수 있는 메가MGC커피 베스트 메뉴', 4400, 2370);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (6, '커피', '자몽에이드', '자몽의 쌉싸름한 맛과 상큼함을 동시에 느낄 수 있는 음료', 4000, 2410);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (7, '세트메뉴', '감자빵세트(HOT)', '감자빵+(HOT)아메리카노', 6000, 3710);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (8, '세트메뉴', '감자빵세트(ICE)', '감자빵+(ICE)아메리카노', 6500, 3710);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (9, '세트메뉴', '아침은내가챙겨줄게세트', '디저트 1종 + 커피 1종', 7300, 5660);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (10, '세트메뉴', '달콤한하루세트', '초코무스케이크 + 커피 1잔', 7000, 4520);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (11, '세트메뉴', '달콤한마카롱세트', '마카롱 6개 묶음 세트. 선물용으로 딱.', 19100, 16980);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (12, '신메뉴', '누룽누룽 바삭 프라페', '대왕님표 여주쌀로 만든 누룽지를 넣어 달달 꼬소한 프라페 위로 바삭바삭한 누룽지를 한번 더 올린 가을시즌 한정 프라페', 3900, 1550);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (13, '신메뉴', '피넛버터 초코 프라페', '부드럽고 진한 누가초코 프라페에, 짭조름하고 고소한 피넛버터를 더해 단맛과 풍미가 진하게 어우러진 프라페', 4400, 3020);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (14, '신메뉴', '할메가커피 스무디', '부드럽고 달달한 믹스 커피 맛 그대로를 시원한 스무디로 담아낸 시그니처 커피 음료', 2900, 1900);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (15, '신메뉴', '애플베리 스무디', '잘익은 사과의 진한 단맛과 딸기의 상큼한 맛이 어우러져 새콤달콤 기분까지 상큼해지는 아는 맛이 무섭스무디', 3900, 1240);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (16, '신메뉴', '제로 애사비 젤리에이드', '유기농 애사비를 넣은 에이드에 레몬이 콕콕 박힌 애사비 젤리를 넣어 더욱 가볍고 청량한 제로 에이드 대체당(알룰로스 등)을 과도하게 섭취 시 개인에 따라 복통 및 설사 등을 유발 할 수 있으니 주의하세요.', 3900, 2090);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (17, '신메뉴', '요거젤라또 씨리얼 초코베리믹스', '초코쉘을 입힌 기존 요거트 젤라또에, 팥빙에서 즐기던 바삭한 믹스씨리얼을 베리믹스와 함께 듬뿍 더한 시원바삭 요거볼 (요거젤라또+믹스씨리얼+초코쉘+트리플믹스베리 조합)', 3900, 1390);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (18, '신메뉴', '요거젤라또 초코베리믹스', '초코쉘을 입힌 요거트 젤라또에 세가지 달콤상큼 베리와 초코링, 고소한 그래놀라를 더한, 시원달달 요거볼', 3900, 2300);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (19, '신메뉴', '매콤 비빔주먹빵', '고소한 삼각 빵 속을 대왕님표 여주쌀이 함유된 매콤한 비빔밥으로 가득 채운, 매콤 고소한 비빔주먹빵', 3400, 2250);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (20, '신메뉴', '피넛버터 애플 샌드', '부드러운 피넛버터크림에 사과 과육이 가득 씹히는 사과잼을 넣어 달콤 고소한 매력을 한 번에 느낄 수 있는 디저트', 2400, 1400);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (21, '신메뉴', '초코젤라또 말차라떼', '진하고 꾸덕한 초코 젤라또를 제주산 고품질 말차, 쌉싸름한 블렌딩 커피와 함께 즐기는 말차 에스프레소 라떼', 4400, 1890);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (22, '신메뉴', '제로 체리콜라', '체리의 새콤함과 콜라의 청량감을 동시에 즐길 수 있는 환상적인 제로 칼로리 에이드. 대체당(알룰로스 등)을 과도하게 섭취 시 개인에 따라 복통 및 설사 등을 유발 할 수 있으니 주의하세요.', 3300, 2300);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (23, '신메뉴', '멕시칸 미트칠리 핫도그', '부드러운 빵에 뽀드득 통통한 소시지, 매콤한 미트칠리 소스를 더하고 체다치즈, 사워크림과 함께 즐기는 멕시코식 핫도그', 3800, 2800);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (24, '신메뉴', '에그베이컨 모닝 버거', '부드러운 브리오슈 번에 고소한 풍미가 가득한 프랑스산 프레지덩 버터로 만든 소스와 에그베이컨을 넣은 든든한 모닝 버거', 3800, 2770);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (25, '신메뉴', '메가베리 아사이볼', '상큼달콤 아사이볼 속에 세가지의 달콤한 베리와 건강한 그래놀라가 더해져 시원 달달하게 즐길 수 있는 딸기시즌 한정 디저트', 4900, 3480);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (26, '신메뉴', '왕메가초코', '부드러운 우유에 진한 초코소스가 어우러져 달콤하게 입맛을 깨우는 왕 메가 사이즈 초코음료', 4900, 2570);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (27, '신메뉴', '왕메가아이스티', '깊은 맛의 홍차와 달콤한 복숭아의 은은한 향이 어우러진 왕 메가 사이즈 아이스티', 4400, 3180);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (28, '신메뉴', '제로 복숭아 아이스티', '깊게 우려진 홍차와 은은한 복숭아향의 아이스티를 제로슈가, 제로칼로리로 즐길 수 있는 음료', 3500, 2260);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (29, '신메뉴', '왕메가카페라떼', '진한 에스프레소와 부드러운 우유가 어우러져 고소한 풍미를 완성한 메가MGC커피만의 왕메가사이즈 라떼', 4900, 2900);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (30, '신메뉴', '왕메가사과유자차', '애플티의 향긋함과 유자청의 상큼달콤함을 느낄 수 있는 메가MGC커피만의 왕메가사이즈 과일티', 4900, 3890);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (31, '신메뉴', '치즈 품은 감자빵', '풍미 깊은 치즈와 포슬포슬한 감자를 가득 담아 낸 쌀가루로 만든 건강한 빵', 4900, 2050);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (32, '신메뉴', '와앙메리칸 뽀득 핫도그', '부드러운 빵 속에 뽀득뽀득 통통한 훈연향 소시지를 넣은 와앙 큰 아메리칸식 핫도그', 4600, 2650);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (33, '신메뉴', '버터버터 팥슈크림 페스츄리', '버터의 풍미가 가득 바삭한 페스츄리 사이에 팥앙금과 슈크림을 가득 넣어 두 가지 맛을 반반 즐길 수 있는 페스츄리', 4800, 3660);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (34, '신메뉴', '햄앤치즈샌드위치', '햄과 치즈의 조화로운 한끼를 만끽할 수 있는 샌드위치', 3400, 1470);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (35, '신메뉴', '할메가미숫커피', '곡물의 향이 고소한 미숫가루와 달달한 믹스커피의 황금비율 조합', 3400, 2400);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (36, '커피', '할메가커피', '우리 할머니께서 즐겨드시던 달달한 믹스 커피 스타일로 만든 메가MGC커피만의 시원한 커피 음료', 2700, 1700);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (37, '커피', '왕할메가커피', '우리 할머니께서 즐겨드시던 달달한 믹스 커피 스타일로 만든 메가MGC커피만의 메가사이즈 커피 음료', 3700, 2700);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (38, '커피', '(ICE)메가리카노', '대용량 1L 아이스 아메리카노~', 3800, 2670);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (39, '커피', '(HOT)아메리카노', '(기본 2샷) 메가MGC커피 블렌드 원두로 추출한 에스프레소에 물을 더해, 풍부한 바디감을 느낄 수 있는 스탠다드 커피', 2200, 1500);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (40, '커피', '(ICE)아메리카노', '(기본 2샷) 메가MGC커피 블렌드 원두로 추출한 에스프레소에 물을 더해, 풍부한 바디감을 느낄 수 있는 스탠다드 커피', 2500, 1500);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (41, '커피', '(HOT) 헛개리카노', '국내산 헛개수와 메가MGC커피만의 아메리카노를 더해 고소한 맛이 조화로운 블렌딩 커피', 2900, 1070);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (42, '커피', '(ICE) 헛개리카노', '국내산 헛개수와 메가MGC커피만의 아메리카노를 더해 고소한 맛이 조화로운 블렌딩 커피', 2900, 1070);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (43, '커피', '왕메가 헛개리카노', '국내산 헛개수와 아메리카노를 블렌딩해 고소한 맛이 더욱 커진 왕메가사이즈 커피', 3900, 2270);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (44, '커피', '(HOT)헤이즐넛아메리카노', '아메리카노에 헤이즐넛의 강렬한 향과 달콤함을 담아 향긋하고 부드럽게 즐기는 커피', 3200, 1050);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (45, '커피', '(ICE)헤이즐넛아메리카노', '아메리카노에 헤이즐넛의 강렬한 향과 달콤함을 담아 향긋하고 부드럽게 즐기는 커피', 3200, 1050);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (46, '커피', '(HOT)바닐라아메리카노', '바닐라의 향과 달콤함을 아메리카노에 부드럽게 어우른 커피', 3200, 2200);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (47, '커피', '(ICE)바닐라아메리카노', '바닐라의 향과 달콤함을 아메리카노에 부드럽게 어우른 커피', 3200, 2200);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (48, '커피', '(HOT)꿀아메리카노', '아메리카노의 묵직한 바디감에 달콤한 사양벌꿀이 소프트하게 어우러진 커피', 3200, 1860);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (49, '커피', '(ICE)꿀아메리카노', '아메리카노의 묵직한 바디감에 달콤한 사양벌꿀이 소프트하게 어우러진 커피', 3200, 1860);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (50, '커피', '(HOT)카페라떼', '진한 에스프레소와 부드러운 우유가 어우러져 고소한 풍미를 완성한 라떼', 3400, 2400);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (51, '커피', '(ICE)카페라떼', '진한 에스프레소와 부드러운 우유가 어우러져 고소한 풍미를 완성한 라떼', 3400, 2400);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (52, '커피', '(HOT)카푸치노', '에스프레소 위에 올려진 우유 거품, 그리고 시나몬 파우더로 완성한 조화로운 맛의 커피', 3400, 2400);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (53, '커피', '(ICE)카푸치노', '에스프레소 위에 올려진 우유 거품, 그리고 시나몬 파우더로 완성한 조화로운 맛의 커피', 3400, 2400);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (54, '커피', '(HOT)헤이즐넛라떼', '부드러운 카페라떼에 헤이즐넛의 강렬한 향과 달콤함을 담아 향긋함을 더한 라떼', 3900, 1600);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (55, '커피', '(ICE)헤이즐넛라떼', '부드러운 카페라떼에 헤이즐넛의 강렬한 향과 달콤함을 담아 향긋함을 더한 라떼', 3900, 1600);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (56, '커피', '(HOT)바닐라라떼', '바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 달콤한 라떼', 3900, 2620);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (57, '커피', '(ICE)바닐라라떼', '바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 달콤한 라떼', 3900, 2620);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (58, '커피', '(HOT)카라멜마끼아또', '폼 밀크 속에 진한 에스프레소와 달콤한 카라멜을 가미해 부드럽게 즐기는 커피', 4200, 1340);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (59, '커피', '(ICE)카라멜마끼아또', '폼 밀크 속에 진한 에스프레소와 달콤한 카라멜을 가미해 부드럽게 즐기는 커피', 4200, 1340);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (60, '커피', '(HOT)카페모카', '초코를 만나 풍부해진 에스프레소와 고소한 우유, 부드러운 휘핑크림까지 더해 달콤하게 즐기는 커피', 4400, 1850);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (61, '커피', '(ICE)카페모카', '초코를 만나 풍부해진 에스프레소와 고소한 우유, 부드러운 휘핑크림까지 더해 달콤하게 즐기는 커피', 4400, 1850);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (62, '커피', '(ICE)큐브라떼', '연유를 섞은 라떼에 에스프레소를 얼린 커피큐브를 올려, 녹을수록 더 진한 커피가 느껴지는 라떼', 4700, 3620);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (63, '커피', '라이트 바닐라 아몬드라떼', '비건 음료 아몬드브리즈와 칼로리를 낮춘 라이트 바닐라 시럽이 만나가볍지만 부드~러워진 여름시즌 한정 라떼', 4400, 3020);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (64, '커피', '(ICE)연유라떼', '향기로운 에스프레소 샷, 부드러운 우유 그리고 달콤한 연유가 조화롭게 어우러진 라떼', 4400, 1930);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (65, '커피', '(HOT)연유라떼', '향기로운 에스프레소 샷, 부드러운 우유 그리고 달콤한 연유가 상냥하게 어우러진 라떼', 4400, 1930);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (66, '디카페인', '(ICE)디카페인 메가리카노', '메가MGC커피 디카페인 아메리카노를 960ml 더 크고 가볍게 즐길 수 있는 대용량 커피', 5000, 2100);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (67, '디카페인', '(HOT)디카페인 아메리카노', '향과 풍미 그대로 카페인만을 낮춰 민감한 분들도 안심하고 매일매일 즐길 수 있는 디카페인 커피', 3000, 1780);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (68, '디카페인', '(ICE)디카페인 아메리카노', '향과 풍미 그대로 카페인만을 낮춰 민감한 분들도 안심하고 매일매일 즐길 수 있는 디카페인 커피', 3500, 1780);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (69, '디카페인', '(HOT)디카페인 헛개리카노', '국내산 헛개수와 메가MGC커피만의 디카페인 아메리카노를 더해 고소한 맛이 조화로운 블렌딩 커피', 3900, 2130);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (70, '디카페인', '(ICE)디카페인 헛개리카노', '국내산 헛개수와 메가MGC커피만의 디카페인 아메리카노를 더해 고소한 맛이 조화로운 블렌딩 커피', 3900, 2130);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (71, '디카페인', '디카페인 왕메가헛개리카노', '국내산 헛개수와 디카페인 아메리카노를 블렌딩해 고소한 맛이 더욱 커진 왕메가사이즈 커피', 5400, 2930);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (72, '디카페인', '디카페인 왕메가카페라떼', '디카페인 에스프레소와 부드러운 우유가 어우러져 고소한 풍미를 완성한 메가MGC커피만의 왕메가사이즈 라떼', 6400, 4750);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (73, '디카페인', '디카페인 라이트바닐라아몬드라떼', '비건 음료 아몬드브리즈와 칼로리를 낮춘 라이트 바닐라 시럽이 만나 가볍지만 부드러워진 디카페인 식물성 라떼', 5400, 3930);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (74, '디카페인', '(HOT)디카페인 꿀아메리카노', '디카페인 아메리카노의 묵직한 바디감에 달콤한 사양벌꿀이 소프트하게 어우러진 커피', 4200, 3100);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (75, '디카페인', '(ICE)디카페인 꿀아메리카노', '디카페인 아메리카노의 묵직한 바디감에 달콤한 사양벌꿀이 소프트하게 어우러진 커피', 4200, 3100);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (76, '디카페인', '(HOT)디카페인 헤이즐넛아메리카노', '디카페인 아메리카노에 헤이즐넛의 풍성한 향과 달콤함을 담아 향긋하고 부드럽게 즐기는 커피', 4200, 1300);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (77, '디카페인', '(ICE)디카페인 헤이즐넛아메리카노', '디카페인 아메리카노에 헤이즐넛의 풍성한 향과 달콤함을 담아 향긋하고 부드럽게 즐기는 커피', 4200, 1300);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (78, '디카페인', '(HOT)디카페인 바닐라아메리카노', '디카페인 아메리카노에 바닐라의 부드러운 향과 달콤함을 조화롭게 담아낸 커피', 4200, 2680);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (79, '디카페인', '(ICE)디카페인 바닐라아메리카노', '디카페인 아메리카노에 바닐라의 부드러운 향과 달콤함을 조화롭게 담아낸 커피', 4200, 2680);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (80, '디카페인', '(HOT)디카페인 카페라떼', '디카페인 에스프레소와 부드러운 우유가 어우러져 고소한 풍미를 완성한 라떼', 4400, 2620);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (81, '디카페인', '(ICE)디카페인 카페라떼', '디카페인 에스프레소와 부드러운 우유가 어우러져 고소한 풍미를 완성한 라떼', 4400, 2620);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (82, '디카페인', '(HOT)디카페인 카푸치노', '디카페인 에스프레소 위에 올려진 우유 거품, 그리고 시나몬 파우더로 완성한 조화로운 맛의 커피', 4400, 2580);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (83, '디카페인', '(ICE)디카페인 카푸치노', '디카페인 에스프레소 위에 올려진 우유 거품, 그리고 시나몬 파우더로 완성한 조화로운 맛의 커피', 3900, 2580);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (84, '디카페인', '(HOT)디카페인 바닐라라떼', '디카페인으로 즐기는 바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 달콤한 라떼', 4400, 2280);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (85, '디카페인', '(ICE)디카페인 바닐라라떼', '디카페인으로 즐기는 바닐라의 짙은 향과 풍부한 폼 밀크의 조화가 인상적인 달콤한 라떼', 4400, 2280);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (86, '디카페인', '(HOT)디카페인 헤이즐넛라떼', '부드러운 카페라떼에 헤이즐넛의 풍부한 향과 달콤함을 담아 향긋하게 즐길 수 있는 디카페인 라떼', 4400, 1760);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (87, '디카페인', '(ICE)디카페인 헤이즐넛라떼', '부드러운 카페라떼에 헤이즐넛의 풍부한 향과 달콤함을 담아 향긋하게 즐길 수 있는 디카페인 라떼', 4400, 1760);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (88, '디카페인', '(HOT)디카페인 카라멜마끼아또', '폼 밀크 속에 진한 디카페인 에스프레소와 달콤한 카라멜을 가미해 부드럽게 즐기는 커피', 5200, 3630);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (89, '디카페인', '(ICE)디카페인 카라멜마끼아또', '폼 밀크 속에 진한 디카페인 에스프레소와 달콤한 카라멜을 가미해 부드럽게 즐기는 커피', 5200, 3630);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (90, '디카페인', '(HOT)디카페인 카페모카', '초코를 만나 풍부해진 디카페인 에스프레소와 고소한 우유, 부드러운 휘핑크림까지 더해 달콤하게 즐기는 커피', 5400, 3300);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (91, '디카페인', '(ICE)디카페인 카페모카', '초코를 만나 풍부해진 디카페인 에스프레소와 고소한 우유, 부드러운 휘핑크림까지 더해 달콤하게 즐기는 커피', 5400, 3300);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (92, '디카페인', '(ICE) 디카페인 연유라떼', '디카페인 에스프레소 샷, 부드러운 우유 그리고 달콤한 연유가 조화롭게 어우러진 디카페인 라떼', 5400, 4350);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (93, '디카페인', '(HOT)디카페인 연유라떼', '디카페인 에스프레소 샷, 부드러운 우유 그리고 달콤한 연유가 조화롭게 어우러진 라떼', 5400, 4350);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (94, '콜드브루', '(HOT)콜드브루오리지널', '차가운 물에 장시간 우려내 깔끔한 목넘김을 느낄 수 있는 콜드브루', 4000, 1470);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (95, '콜드브루', '(ICE)콜드브루오리지널', '차가운 물에 장시간 우려내 깔끔한 목넘김을 느낄 수 있는 콜드브루', 4000, 1470);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (96, '콜드브루', '(HOT)콜드브루라떼', '콜드브루에 고소한 우유를 섞어, 깔끔함과 부드러움을 잡은 콜드브루 라떼', 4500, 2180);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (97, '콜드브루', '(ICE)콜드브루라떼', '콜드브루에 고소한 우유를 섞어, 깔끔함과 부드러움을 잡은 콜드브루 라떼', 4500, 2180);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (98, '콜드브루', '콜드브루상품용', '1L 콜드브루 원액입니다.', 20500, 18850);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (99, '콜드브루', '(HOT)콜드브루디카페인', '카페인을 줄였지만, 원두 본연의 향미를 풍부하게 살려 맛을 잡은 콜드브루 디카페인', 4000, 2110);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (100, '콜드브루', '(ICE)콜드브루디카페인', '카페인을 줄였지만, 원두 본연의 향미를 풍부하게 살려 맛을 잡은 콜드브루 디카페인', 4000, 2110);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (101, '콜드브루', '(HOT)콜드브루디카페인라떼', '고소한 우유를 섞어, 커피향에 부드러운 풍미를 가미한 콜드브루 디카페인 라떼', 4500, 3030);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (102, '콜드브루', '(ICE)콜드브루디카페인라떼', '고소한 우유를 섞어, 커피향에 부드러운 풍미를 가미한 콜드브루 디카페인 라떼', 4500, 3030);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (103, '스무디&프라페', '코코넛커피 스무디', '바삭하고 고소한 코코넛 칩을 올리고 쌉싸름한 커피와 달콤한 코코넛이 조화로운 스무디', 5300, 4080);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (104, '스무디&프라페', '초코허니퐁크러쉬', '리얼 벌꿀이 들어가 더 달콤한 허니퐁시리얼과 달콤한 초코가 만나 시원하게 즐기는 달달한 프라페', 4400, 2380);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (105, '스무디&프라페', '플레인퐁크러쉬', '우유와 퐁시리얼, 얼음을 함께 갈아 시원하게 즐기는 달달한 프라페 음료', 4400, 2480);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (106, '스무디&프라페', '딸기퐁크러쉬', '우유와 퐁시리얼, 상큼한 딸기를 믹스하고, 얼음을 함께 갈아 시원하게 즐기는 달달한 프라페 음료', 4400, 2450);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (107, '스무디&프라페', '바나나퐁크러쉬', '우유와 퐁시리얼, 부드러운 바나나를 믹스하고, 얼음을 함께 갈아 시원하게 즐기는 달달한 프라페 음료', 4400, 1760);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (108, '스무디&프라페', '쿠키프라페', '오레오의 특유의 맛과 부드러운 우유, 그리고 바닐라 향의 조화를 느낄 수 있는 메가MGC커피 베스트 메뉴', 4400, 2370);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (109, '스무디&프라페', '딸기쿠키프라페', '달콤하고 부드러운 밀크베이스에 상큼한 딸기시럽과 바삭한 쿠키카 어우러진 프라페 위에 휘핑과 쿠키크런치를 토핑한 음료', 4400, 2180);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (110, '스무디&프라페', '민트프라페', '진한 민트향과 초콜릿 칩이 가득 들어있는 메뉴로, 큰 인기를 얻고 있는 메가커피 베스트 메뉴', 4400, 2580);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (111, '스무디&프라페', '리얼초코프라페', '진한 초코소스와 바닐라향이 더해져 먹는 재미가 있는 달콤한 프라페', 4400, 2100);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (112, '스무디&프라페', '녹차프라페', '녹차의 진한 맛이 우유와 휘핑크림을 만나 달콤하고 부드러운 맛을 내는 메뉴', 4400, 1480);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (113, '스무디&프라페', '커피프라페', '에스프레소 커피 향이 가득한 시원한 프라페', 4400, 3180);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (114, '스무디&프라페', '귤톡톡젤리스무디', '톡톡 터지는 상큼한 귤의 과육과 몽글한 젤리식감이 매력적인 상큼한 스무디', 4400, 1780);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (115, '스무디&프라페', '골드망고스무디', '황금빛 골드망고가 진하게 느껴지는 부드럽고 상큼 달콤한 스무디', 4400, 2900);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (116, '스무디&프라페', '블루베리요거트스무디', '새콤달콤한 블루베리와 산뜻한 요거트가 만나 조화로운 스무디', 4400, 2530);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (117, '스무디&프라페', '플레인요거트스무디', '요거트의 진한 맛을 그대로 살린 메뉴로, 인기가 좋은 스무디', 4400, 2560);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (118, '스무디&프라페', '망고요거트스무디', '열대 과일인 망고의 달콤하고 진한 맛을 극대화 시킨 시원한 메가MGC커피 인기메뉴', 4400, 2520);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (119, '스무디&프라페', '딸기요거트스무디', '남녀노소 누구나 좋아하는 딸기와 상큼한 요커트가 조화롭게 어우려진 메뉴', 4400, 1720);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (120, '에이드', '딸기바나나주스', '상큼한 딸기와 부드러운 바나나가 만나, 새콤달콤한 매력이 살아 있는 과일 음료', 4500, 3090);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (121, '에이드', '딸기주스', '탱글하게 살아 있는 딸기 과육의 상큼함을 만끽할 수 있는 과일 음료', 4500, 2860);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (122, '에이드', '블루베리플럼주스', '새콤달콤한 블루베리와 식이섬유가 풍부한 플럼, 프리바이오틱스를 더해 건강한 블렌딩 주스', 4500, 2090);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (123, '에이드', '골드키위주스', '상큼달콤한 프리미엄 골드키위에 밀크씨슬을 더해 일상의 활력을 선사하는 건강한 블렌딩 주스', 4500, 2760);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (124, '에이드', '체리콜라', '체리의 새콤함에 콜라의 청량함을 더해, 남녀노소 좋아하는 에이드', 3800, 2410);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (125, '에이드', '제로 부스트 에이드', '지친 현대인들에게 필요한 한 잔의 에너지 타우린 1,000mg이 들어가 활력이 충전되는 에너지드링크맛 제로 칼로리 에이드', 3500, 2110);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (126, '에이드', '레몬에이드', '레몬의 상큼함과 달콤함 그리고 탄산의 청량감을 즐길 수 있는 음료', 4000, 2540);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (127, '에이드', '블루레몬에이드', '레몬의 상큼한 맛과 블루큐라소의 진한 향 그리고 탄산의 청량감을 높여주는 음료', 4000, 1760);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (128, '에이드', '자몽에이드', '자몽의 쌉싸름한 맛과 상큼함을 동시에 느낄 수 있는 음료', 4000, 2410);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (129, '에이드', '청포도에이드', '청포도의 상큼함과 달콤함을 느껴보세요', 4000, 1380);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (130, '에이드', '메가에이드', '레몬의 상큼함 라임의 특유한 향 그리고 자몽의 달콤함과 쌉싸름한 맛을 느끼 수 있는 메가MGC커피 베스트 메뉴 메가에이드', 4400, 2120);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (131, '에이드', '라임모히또', '라임의 상큼함과 달콤함 강한 민트향을 동시에 즐길 수 있는 음료 여기에 청량감은 보너스', 4300, 3100);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (132, '음료', '(ICE)오레오초코라떼', '달콤한 초콜릿의 풍미와 아삭한 오레오 살아있는 아이스 초코음료', 4400, 2490);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (133, '음료', '딸기라떼', '딸기과육이 풍부히 느껴지는 스테디 셀러 산뜻하고 달콤한 딸기가 가득해 부드러운 우유와 어우러져 더욱 기분 좋게 즐기는 아이스 라떼', 4200, 3190);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (134, '음료', '핫초코', '부드러운 우유에 진한 초코소스가 어우러져 달콤하게 입맛을 깨우는 초콜릿 음료', 4000, 2560);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (135, '음료', '아이스초코', '부드러운 우유에 진한 초코소스가 어우러져 달콤하게 입맛을 깨우는 초콜릿 음료', 4000, 2350);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (136, '음료', '(HOT)토피넛라떼', '달콤 고소한 토피넛에 부드러운 우유가 더해진 라떼', 4300, 1780);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (137, '음료', '(ICE)토피넛라떼', '달콤 고소한 토피넛에 부드러운 우유가 더해진 라떼', 4300, 1780);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (138, '음료', '(HOT)로얄밀크티라떼', '부드러운 우유에 은은한 홍차를 부어, 보드랍고 향긋한 한 모금을 완성한 라떼', 4200, 3080);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (139, '음료', '(ICE)로얄밀크티라떼', '부드러운 우유에 은은한 홍차를 부어, 보드랍고 향긋한 한 모금을 완성한 라떼', 4200, 3080);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (140, '음료', '(HOT)녹차라떼', '향긋한 녹차에 우유를 더해 입 안에 부드러운 푸릇함을 선물하는 라떼', 4000, 2820);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (141, '음료', '(ICE)녹차라떼', '향긋한 녹차에 우유를 더해 입 안에 부드러운 푸릇함을 선물하는 라떼', 4000, 2820);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (142, '음료', '(HOT)곡물라떼', '곡물에 우유가 더해져 고소하게 즐길 수 있는 음료', 3800, 1820);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (143, '음료', '(ICE)곡물라떼', '곡물에 우유가 더해져 고소하게 즐길 수 있는 음료', 3800, 1820);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (144, '음료', '(HOT)고구마라떼', '달콤한 고구마와 부드러운 우유의 만남. 남녀노소 좋아하는 인기메뉴', 4000, 1310);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (145, '음료', '(ICE)고구마라떼', '달콤한 고구마와 부드러운 우유의 만남. 남녀노소 좋아하는 인기메뉴', 4000, 1310);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (146, '음료', '(ICE)흑당버블라떼', '모리셔스의 진한 흑당이 들어간 라떼에 쫀득한 버블을 넣어 먹는 즐거움을 전하는 라떼', 4200, 1570);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (147, '음료', '(ICE)흑당버블밀크티라떼', '홍차의 깊은 맛과 향긋함을 더한 흑당버블밀크티', 4300, 2020);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (148, '음료', '(ICE)흑당라떼(펄X)', '모리셔스의 진한 흑당과 부드러운 우유가 달콤하게 조화를 이루는 라떼', 3800, 2020);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (149, '음료', '(ICE)흑당밀크티라떼(펄X)', '달콤한 흑당과 타바론 얼그레이 홍차를 넣은 밀크티 라떼', 4000, 2540);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (150, '티', '복숭아아이스티홍차', '복숭아아이스티홍차의 깊은 맛과 풍부한 복숭아 향이 어우러진 달콤한 여름철 인기 음료', 3500, 2060);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (151, '티', '(HOT)사과유자차', '애플 티의 향긋함과 유자청의 상큼함이 어우러진 과일 티', 4000, 1440);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (152, '티', '(ICE)사과유자차', '애플 티의 향긋함과 유자청의 상큼함이 어우러진 과일 티', 4000, 1440);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (153, '티', '(HOT)허니자몽블랙티', '달콤한 꿀청에 재운 자몽에 홍차의 부드러움을 어우른 상큼한 과일티', 4200, 1410);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (154, '티', '(ICE)허니자몽블랙티', '달콤한 꿀청에 재운 자몽에 홍차의 부드러움을 어우른 상큼한 과일티', 4200, 1410);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (155, '티', '(HOT)상큼 리치티', '하얀 눈 속을 달리는 빨간 코 루돌프와 닮은 리치티. 리치, 라임, 망고스틴 베이스에 레드 커런트, 로즈마리를 더한 상큼한 과일티', 4400, 1990);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (156, '티', '(ICE)상큼 리치티', '하얀 눈 속을 달리는 빨간 코 루돌프와 닮은 리치티. 리치, 라임, 망고스틴 베이스에 레드 커런트, 로즈마리를 더한 상큼한 과일티', 4400, 1990);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (157, '티', '(HOT)자몽차', '달콤쌉싸름한 자몽의 조화로운 맛을 한 잔 가득 느낄 수 있는 과일티', 3800, 2340);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (158, '티', '(ICE)자몽차', '달콤쌉싸름한 자몽의 조화로운 맛을 한 잔 가득 느낄 수 있는 과일티', 3800, 2340);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (159, '티', '(HOT)유자차', '비타민이 가득 든 상큼달콤한 유자를 듬뿍 넣어 향긋한 즐거움을 전하는 과일티', 3800, 2290);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (160, '티', '(ICE)유자차', '비타민이 가득 든 상큼달콤한 유자를 듬뿍 넣어 향긋한 즐거움을 전하는 과일티', 3800, 2290);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (161, '티', '(HOT)레몬차', '새콤한 레몬의 맛과 향을 오롯이 살린 과일티', 3800, 2740);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (162, '티', '(ICE)레몬차', '새콤한 레몬의 맛과 향을 오롯이 살린 과일티', 3800, 2740);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (163, '티', '(HOT)녹차', '고소한 감칠맛과 목 넘김이 부드러운 국내산 녹차', 3000, 2000);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (164, '티', '(ICE)녹차', '고소한 감칠맛과 목 넘김이 부드러운 국내산 녹차', 3000, 2000);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (165, '티', '(HOT)캐모마일', '특유의 풀내음을 통해 마음을 진정 시켜주는 마일드한 허브차', 3000, 1510);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (166, '티', '(ICE)캐모마일', '특유의 풀내음을 통해 마음을 진정 시켜주는 마일드한 허브차', 3000, 1510);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (167, '티', '(HOT)페퍼민트', '입 안 가득 깔끔한 청량감으로 기분까지 상쾌한 허브차', 3000, 1570);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (168, '티', '(ICE)페퍼민트', '입 안 가득 깔끔한 청량감으로 기분까지 상쾌한 허브차', 3000, 1570);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (169, '티', '(HOT)얼그레이', '홍차의 진한 향과 본연의 부드러움을 느낄 수 있는 허브차', 3000, 1320);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (170, '티', '(ICE)얼그레이', '홍차의 진한 향과 본연의 부드러움을 느낄 수 있는 허브차', 3000, 1320);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (171, '병 음료', '갈바니나유기농오렌지스파클링', '미네랄이 풍부한 천연 광천수를 사용한 스파클링', 4300, 1640);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (172, '병 음료', '갈바니나유기농자몽스파클링', '미네랄이 풍부한 천연 광천수를 사용한 스파클링', 4300, 1460);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (173, '디저트', '초코젤라또크로플', '따뜻하고 바삭한 크로플 위에 진하고 꾸덕한 초코 젤라또를 올려 만든 매력적인 베이커리 메뉴', 4500, 1730);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (174, '디저트', '바질 치폴레 치킨 치아바타', '산타의 오븐에서 갓 꺼낸 바삭한 치아바타에 향긋한 바질마요를 더하고, 매콤하고 부드러운 치폴레 소스에 베이컨과 닭가슴살을 버무려 따뜻하게 즐기는 치아바타 샌드위치', 5400, 3130);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (175, '디저트', '핫 치킨&딥치즈 치아바타', '쫄깃 바삭한 치아바타에 통살 치킨텐더와 감칠맛 가득 매콤한 MGC 비법소스가 어우러진 따끈한 샌드위치', 5400, 3130);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (176, '디저트', '와앙 바닐라 슈크림빵', '바닐라빈을 넣은 진한 슈크림이 한입가득 와앙 베어물면 촉촉 달콤한 슈크림빵', 3700, 1560);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (177, '디저트', '초코스모어쿠키', '초코칩이 콕콕 박힌 촉촉한 초코 쿠키에 달콤하게 구운 마시멜로우가 만나 더 진한 초코 맛 쿠키', 3900, 1260);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (178, '디저트', '와앙 피자 보름달빵', '한끼로도 든든한 중독적인 추억의 와앙 큰 소시지 피자빵', 4900, 2170);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (179, '디저트', '크로크무슈', '부드러운 빵에 햄과 치즈를 넣어구운 고소한 프랑스식 샌드위치', 4800, 3320);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (180, '디저트', '버터버터소금빵', '고소한 프랑스산 프레지덩 버터를 듬뿍넣어 더욱 부드러워진 버터소금빵과 아메리카노를 함께 즐길 수 있는 브런치 메뉴', 4200, 2960);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (181, '디저트', '버터버터소금빵(쥬에그잼)', '고소한 프랑스산 프레지덩 버터를 듬뿍넣어 더 부드럽고 짭쪼롬하게 즐길 수 있는 버터소금빵과, 도톰한 과육이 느껴지는 이탈리아 전통 쥬에그잼', 4800, 3170);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (182, '디저트', '감자빵', '쌀가루가 들어가 쫀득한 빵에 구운 감자를 으깨 넣어 포슬포슬한 감자 본연의 풍미가 살아있는 진짜 감자빵', 4500, 2510);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (183, '디저트', '메가쿠키(마카다미아)', '고소한 마카다미아를 넣어 만든 메가MGC커피 시그니처 쿠키', 3000, 1150);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (184, '디저트', '메가쿠키(초코칩)', '진한 초콜릿칩을 넣어 만든 메가MGC커피 시그니처 쿠키', 3000, 2000);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (185, '디저트', '엠지씨네 메가칩', '엠지씨 이름을 걸고 만들었다 메밀로 만든 짭짤 고소한 김맛 건강스낵', 1900, 900);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (186, '디저트', '플레인크로플', '버터풍미가 가득한 크루와상의 바삭함과 와플의 부드러움이 합쳐진 겉바속촉의 표본', 3500, 1150);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (187, '디저트', '몽쉘케이크', '진하고 폭신한 초콜릿 스펀지 사이에 부드러운 생크림이 듬뿍 들어간 몽쉘 케이크', 6300, 4150);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (188, '디저트', '치즈케익', '진한 치즈의 맛을 달콤하고 부드럽게 느낄 수 있는 케이크', 4500, 2920);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (189, '디저트', '초코무스케익', '달콤한 초콜릿 본연의 맛을 더 진하게 느낄 수 있는 케이크', 4500, 3170);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (190, '디저트', '티라미수케익', '부드러운 치즈 맛과 코코아의 조화로운 향으로 호불호 없이 즐기는 케이크', 4500, 3150);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (191, '디저트', '저당 우유 생크림 케익', '진하고 고소한 저당 우유 생크림과 부드럽고 촉촉한 화이트 시트가 어우러져 가볍게 즐길 수 있는 부드러운 생크림 케이크', 5000, 2960);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (192, '디저트', '저당 초코 생크림 케익', '달콤쌉싸름한 저당 초코 생크림과 폭신하고 촉촉한 초코 시트가 어우러져 가볍게 즐길 수 있는 달콤한 초코 케이크', 5000, 3310);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (193, '디저트', '유니콘프라페마카롱', '메가MGC커피 인기메뉴인 유니콘 프라페를 디저트화하여 만든 마카롱', 3100, 1790);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (194, '디저트', '메가초코마카롱', '메가MGC커피 시그니처 메가초코를 모티브로 만든 초코 마카롱', 3100, 2100);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (195, '디저트', '딸기요거트마카롱', '딸기요거트 스무디를 연상하게 하는 상큼한 마카롱', 3100, 1100);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (196, '디저트', '허니브레드', '촉촉한 식빵과 달콤한 생크림의 만남 거기에 진한 카라멜 소스까지', 5500, 3050);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (197, '디저트', '아이스허니와앙슈', '바삭한 쿠키슈에 꿀을 넣은 크림이 가득, 건강하고 맛있는 디저트 와앙 슈', 3400, 2390);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (198, '디저트', '와앙 메가초코 크로칸슈', '바삭한 초코 크로칸슈 안에 부드럽고 달콤한 초코 크림을 가득 채운 디저트', 3900, 2780);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (199, '디저트', '초코 멜로우 샌드', '초코칩이 콕콕 박힌 달콤한 초코크림과 쫀득한 마시멜로우가 조화로운 샌드위치', 3400, 1230);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (200, '디저트', '로얄 밀크티 스모어 쿠키', '화이트 초코칩이 콕콕 박힌 로얄 밀크티맛 쿠키에 달콤하게 구운 마시멜로우가 만난 달콤한 쿠키', 3900, 1260);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (201, '디저트', '버터버터 마늘 크로크무슈', '프랑스산 프레지덩 버터로 만든 식빵 사이에 갈릭 소스, 햄, 치즈를 샌드하고 바삭한 마늘 크런치를 토핑한 한 끼 든든 샌드위치', 4900, 2740);
INSERT INTO product_1 (product_id, product_type, product_name, product_comment, product_price, product_realprice)
VALUES (202, '디저트', '버터버터 뜯어먹는 식빵', '고소한 프랑스산 프레지덩 버터를 듬뿍 넣어 만든 뜯어먹는 데니쉬 미니 식빵', 3900, 1080);

--주문 정보
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (1, 3, 3, 54, 1, TO_TIMESTAMP('2025-09-01 07:03:51', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (2, 2, 1, 128, 5, TO_TIMESTAMP('2025-09-01 07:22:33', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (3, 1, 1, 102, 1, TO_TIMESTAMP('2025-09-01 07:56:10', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (4, 5, 5, 39, 3, TO_TIMESTAMP('2025-09-01 07:57:31', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (5, 2, 1, 118, 3, TO_TIMESTAMP('2025-09-01 08:18:13', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (6, 2, 1, 62, 3, TO_TIMESTAMP('2025-09-01 08:40:53', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (7, 4, 2, 182, 1, TO_TIMESTAMP('2025-09-01 09:16:27', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (8, 2, 5, 31, 4, TO_TIMESTAMP('2025-09-01 09:17:41', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (9, 4, 4, 149, 2, TO_TIMESTAMP('2025-09-01 09:28:33', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (10, 1, 2, 132, 4, TO_TIMESTAMP('2025-09-01 09:53:34', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (11, 1, 5, 74, 2, TO_TIMESTAMP('2025-09-01 10:05:36', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (12, 5, 4, 149, 5, TO_TIMESTAMP('2025-09-01 10:24:58', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (13, 4, 1, 186, 2, TO_TIMESTAMP('2025-09-01 10:27:05', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (14, 4, 4, 175, 1, TO_TIMESTAMP('2025-09-01 10:44:11', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (15, 4, 4, 125, 2, TO_TIMESTAMP('2025-09-01 10:44:11', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (16, 5, 5, 61, 2, TO_TIMESTAMP('2025-09-01 11:17:31', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (17, 3, 3, 171, 1, TO_TIMESTAMP('2025-09-01 11:43:55', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (18, 1, 4, 81, 2, TO_TIMESTAMP('2025-09-01 12:01:38', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (19, 5, 3, 89, 2, TO_TIMESTAMP('2025-09-01 12:20:41', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (20, 1, 3, 71, 2, TO_TIMESTAMP('2025-09-01 12:23:03', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (21, 1, 5, 173, 3, TO_TIMESTAMP('2025-09-01 12:29:50', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (22, 2, 1, 26, 5, TO_TIMESTAMP('2025-09-01 12:38:36', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (23, 4, 1, 71, 3, TO_TIMESTAMP('2025-09-01 12:53:37', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (24, 2, 4, 200, 1, TO_TIMESTAMP('2025-09-01 13:06:15', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (25, 2, 4, 75, 3, TO_TIMESTAMP('2025-09-01 13:06:15', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (26, 4, 3, 110, 3, TO_TIMESTAMP('2025-09-01 13:24:36', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (27, 2, 1, 156, 1, TO_TIMESTAMP('2025-09-01 13:31:45', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (28, 3, 1, 151, 1, TO_TIMESTAMP('2025-09-01 13:45:15', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (29, 5, 1, 24, 1, TO_TIMESTAMP('2025-09-01 13:51:17', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (30, 2, 1, 95, 1, TO_TIMESTAMP('2025-09-01 14:06:47', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (31, 5, 1, 174, 4, TO_TIMESTAMP('2025-09-01 17:34:47', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (32, 4, 1, 18, 1, TO_TIMESTAMP('2025-09-01 18:11:56', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (33, 4, 1, 3, 5, TO_TIMESTAMP('2025-09-01 18:13:55', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (34, 1, 5, 185, 1, TO_TIMESTAMP('2025-09-01 18:21:54', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (35, 4, 5, 38, 3, TO_TIMESTAMP('2025-09-01 18:25:21', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (36, 3, 1, 47, 1, TO_TIMESTAMP('2025-09-01 18:58:59', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (37, 5, 4, 188, 5, TO_TIMESTAMP('2025-09-01 19:27:26', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (38, 2, 2, 129, 5, TO_TIMESTAMP('2025-09-01 19:42:53', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (39, 4, 4, 132, 1, TO_TIMESTAMP('2025-09-01 19:48:55', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (40, 1, 2, 7, 6, TO_TIMESTAMP('2025-09-01 20:17:33', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (41, 1, 2, 117, 5, TO_TIMESTAMP('2025-09-01 20:45:13', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (42, 3, 2, 157, 5, TO_TIMESTAMP('2025-09-01 20:51:24', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (43, 5, 4, 99, 5, TO_TIMESTAMP('2025-09-01 21:28:24', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (44, 1, 2, 98, 1, TO_TIMESTAMP('2025-09-01 22:37:43', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (45, 2, 4, 74, 1, TO_TIMESTAMP('2025-09-01 23:02:46', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (46, 3, 4, 47, 2, TO_TIMESTAMP('2025-09-01 23:15:24', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (47, 5, 1, 109, 5, TO_TIMESTAMP('2025-09-01 23:18:38', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (48, 1, 3, 175, 2, TO_TIMESTAMP('2025-09-01 23:30:44', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (49, 5, 5, 155, 5, TO_TIMESTAMP('2025-09-01 23:32:09', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (50, 4, 5, 24, 5, TO_TIMESTAMP('2025-09-01 23:52:20', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (51, 4, 3, 6, 3, TO_TIMESTAMP('2025-09-01 23:57:21', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (52, 5, 4, 122, 2, TO_TIMESTAMP('2025-09-02 07:05:30', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (53, 2, 4, 22, 1, TO_TIMESTAMP('2025-09-02 07:23:57', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (54, 1, 5, 93, 2, TO_TIMESTAMP('2025-09-02 07:23:57', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (55, 4, 2, 19, 2, TO_TIMESTAMP('2025-09-02 07:46:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (56, 5, 5, 86, 1, TO_TIMESTAMP('2025-09-02 07:52:09', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (57, 4, 5, 186, 2, TO_TIMESTAMP('2025-09-02 07:52:09', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (58, 1, 1, 5, 3, TO_TIMESTAMP('2025-09-02 07:52:09', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (59, 2, 2, 78, 4, TO_TIMESTAMP('2025-09-02 08:29:49', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (60, 5, 4, 29, 4, TO_TIMESTAMP('2025-09-02 09:32:55', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (61, 1, 3, 199, 5, TO_TIMESTAMP('2025-09-02 09:42:23', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (62, 1, 2, 47, 5, TO_TIMESTAMP('2025-09-02 09:42:51', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (63, 4, 4, 37, 4, TO_TIMESTAMP('2025-09-02 09:49:03', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (64, 4, 1, 141, 4, TO_TIMESTAMP('2025-09-02 10:04:49', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (65, 4, 1, 158, 2, TO_TIMESTAMP('2025-09-02 10:27:45', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (66, 5, 5, 82, 5, TO_TIMESTAMP('2025-09-02 10:57:55', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (67, 3, 3, 107, 3, TO_TIMESTAMP('2025-09-02 11:08:05', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (68, 4, 2, 122, 4, TO_TIMESTAMP('2025-09-02 11:16:49', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (69, 2, 1, 68, 5, TO_TIMESTAMP('2025-09-02 11:21:05', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (70, 1, 2, 116, 1, TO_TIMESTAMP('2025-09-02 12:44:17', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (71, 2, 5, 8, 4, TO_TIMESTAMP('2025-09-02 13:15:39', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (72, 1, 1, 194, 4, TO_TIMESTAMP('2025-09-02 13:20:26', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (73, 5, 1, 126, 2, TO_TIMESTAMP('2025-09-02 13:32:30', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (74, 2, 4, 197, 2, TO_TIMESTAMP('2025-09-02 13:49:28', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (75, 1, 4, 201, 3, TO_TIMESTAMP('2025-09-02 14:12:36', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (76, 2, 2, 43, 4, TO_TIMESTAMP('2025-09-02 14:36:41', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (77, 4, 1, 5, 2, TO_TIMESTAMP('2025-09-02 18:22:35', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (78, 2, 2, 113, 1, TO_TIMESTAMP('2025-09-02 19:03:14', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (79, 1, 1, 47, 5, TO_TIMESTAMP('2025-09-02 19:58:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (80, 5, 2, 168, 5, TO_TIMESTAMP('2025-09-02 20:07:13', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (81, 1, 4, 20, 5, TO_TIMESTAMP('2025-09-02 21:42:28', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (82, 4, 1, 153, 5, TO_TIMESTAMP('2025-09-02 21:51:42', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (83, 4, 1, 194, 4, TO_TIMESTAMP('2025-09-02 22:26:43', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (84, 5, 4, 109, 1, TO_TIMESTAMP('2025-09-02 22:29:28', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (85, 1, 4, 61, 3, TO_TIMESTAMP('2025-09-02 22:35:35', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (86, 3, 2, 42, 3, TO_TIMESTAMP('2025-09-02 22:38:01', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (87, 4, 4, 49, 3, TO_TIMESTAMP('2025-09-02 22:41:40', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (88, 1, 2, 100, 3, TO_TIMESTAMP('2025-09-02 22:50:40', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (89, 2, 3, 170, 2, TO_TIMESTAMP('2025-09-02 23:00:19', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (90, 4, 4, 77, 1, TO_TIMESTAMP('2025-09-02 23:19:58', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (91, 1, 4, 174, 4, TO_TIMESTAMP('2025-09-02 23:35:34', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (92, 1, 5, 8, 3, TO_TIMESTAMP('2025-09-02 23:51:56', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (93, 3, 2, 56, 4, TO_TIMESTAMP('2025-09-03 07:16:09', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (94, 1, 4, 62, 3, TO_TIMESTAMP('2025-09-03 07:55:48', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (95, 2, 5, 97, 1, TO_TIMESTAMP('2025-09-03 07:55:48', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (96, 5, 2, 174, 2, TO_TIMESTAMP('2025-09-03 08:54:40', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (97, 5, 2, 24, 2, TO_TIMESTAMP('2025-09-03 08:54:40', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (98, 2, 1, 44, 5, TO_TIMESTAMP('2025-09-03 09:43:51', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (99, 4, 2, 198, 2, TO_TIMESTAMP('2025-09-03 10:06:53', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (100, 3, 4, 83, 2, TO_TIMESTAMP('2025-09-03 10:24:53', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (101, 2, 3, 41, 3, TO_TIMESTAMP('2025-09-03 10:33:25', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (102, 3, 3, 172, 2, TO_TIMESTAMP('2025-09-03 10:33:41', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (103, 2, 3, 58, 5, TO_TIMESTAMP('2025-09-03 11:30:24', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (104, 2, 1, 24, 2, TO_TIMESTAMP('2025-09-03 11:30:39', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (105, 3, 5, 159, 5, TO_TIMESTAMP('2025-09-03 12:31:37', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (106, 3, 4, 125, 5, TO_TIMESTAMP('2025-09-03 13:11:30', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (107, 2, 1, 179, 2, TO_TIMESTAMP('2025-09-03 13:37:18', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (108, 2, 1, 9, 3, TO_TIMESTAMP('2025-09-03 13:37:18', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (109, 5, 2, 187, 4, TO_TIMESTAMP('2025-09-03 14:07:41', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (110, 5, 2, 152, 4, TO_TIMESTAMP('2025-09-03 14:07:41', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (111, 1, 2, 183, 4, TO_TIMESTAMP('2025-09-03 17:15:18', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (112, 2, 5, 149, 3, TO_TIMESTAMP('2025-09-03 18:08:09', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (113, 4, 1, 202, 3, TO_TIMESTAMP('2025-09-03 19:04:07', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (114, 5, 4, 45, 5, TO_TIMESTAMP('2025-09-03 19:04:07', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (115, 5, 3, 153, 1, TO_TIMESTAMP('2025-09-03 19:04:07', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (116, 1, 4, 53, 2, TO_TIMESTAMP('2025-09-03 19:44:33', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (117, 5, 5, 125, 9, TO_TIMESTAMP('2025-09-03 20:49:21', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (118, 3, 3, 43, 4, TO_TIMESTAMP('2025-09-03 21:40:18', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (119, 4, 2, 82, 4, TO_TIMESTAMP('2025-09-03 21:54:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (120, 1, 5, 180, 4, TO_TIMESTAMP('2025-09-03 22:01:57', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (121, 1, 1, 137, 5, TO_TIMESTAMP('2025-09-03 22:44:45', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (122, 5, 1, 140, 1, TO_TIMESTAMP('2025-09-03 22:52:42', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (123, 2, 2, 141, 2, TO_TIMESTAMP('2025-09-04 07:10:03', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (124, 2, 1, 8, 1, TO_TIMESTAMP('2025-09-04 07:12:11', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (125, 4, 1, 3, 5, TO_TIMESTAMP('2025-09-04 07:55:23', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (126, 2, 4, 125, 4, TO_TIMESTAMP('2025-09-04 08:51:37', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (127, 3, 3, 139, 3, TO_TIMESTAMP('2025-09-04 08:56:20', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (128, 1, 5, 168, 1, TO_TIMESTAMP('2025-09-04 09:15:31', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (129, 4, 3, 131, 3, TO_TIMESTAMP('2025-09-04 09:56:12', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (130, 2, 4, 124, 5, TO_TIMESTAMP('2025-09-04 10:03:28', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (131, 3, 3, 117, 1, TO_TIMESTAMP('2025-09-04 10:04:56', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (132, 3, 4, 136, 3, TO_TIMESTAMP('2025-09-04 10:15:56', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (133, 3, 3, 138, 3, TO_TIMESTAMP('2025-09-04 10:36:38', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (134, 3, 2, 156, 3, TO_TIMESTAMP('2025-09-04 11:00:23', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (135, 4, 2, 199, 1, TO_TIMESTAMP('2025-09-04 11:06:44', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (136, 1, 1, 82, 4, TO_TIMESTAMP('2025-09-04 11:55:35', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (137, 4, 3, 106, 5, TO_TIMESTAMP('2025-09-04 11:59:23', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (138, 2, 1, 23, 2, TO_TIMESTAMP('2025-09-04 12:07:20', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (139, 3, 3, 149, 2, TO_TIMESTAMP('2025-09-04 12:21:05', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (140, 3, 1, 177, 2, TO_TIMESTAMP('2025-09-04 12:49:10', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (141, 3, 1, 111, 2, TO_TIMESTAMP('2025-09-04 12:49:10', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (142, 2, 3, 174, 2, TO_TIMESTAMP('2025-09-04 13:39:56', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (143, 2, 3, 25, 2, TO_TIMESTAMP('2025-09-04 13:39:56', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (144, 3, 2, 161, 3, TO_TIMESTAMP('2025-09-04 14:24:38', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (145, 2, 1, 37, 5, TO_TIMESTAMP('2025-09-04 14:35:55', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (146, 2, 3, 141, 4, TO_TIMESTAMP('2025-09-04 14:40:26', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (147, 5, 2, 173, 5, TO_TIMESTAMP('2025-09-04 14:41:14', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (148, 1, 4, 57, 5, TO_TIMESTAMP('2025-09-04 17:12:32', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (149, 2, 3, 9, 3, TO_TIMESTAMP('2025-09-04 17:20:06', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (150, 5, 1, 129, 1, TO_TIMESTAMP('2025-09-04 17:31:51', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (151, 2, 3, 69, 4, TO_TIMESTAMP('2025-09-04 17:47:36', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (152, 1, 3, 188, 5, TO_TIMESTAMP('2025-09-04 17:58:08', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (153, 2, 4, 26, 5, TO_TIMESTAMP('2025-09-04 18:04:52', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (154, 4, 4, 148, 5, TO_TIMESTAMP('2025-09-04 18:35:57', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (155, 1, 4, 67, 5, TO_TIMESTAMP('2025-09-04 18:50:25', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (156, 1, 1, 192, 4, TO_TIMESTAMP('2025-09-04 19:01:14', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (157, 1, 2, 22, 1, TO_TIMESTAMP('2025-09-04 19:34:01', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (158, 4, 4, 181, 1, TO_TIMESTAMP('2025-09-04 19:40:45', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (159, 3, 2, 12, 5, TO_TIMESTAMP('2025-09-04 20:01:35', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (160, 5, 4, 133, 5, TO_TIMESTAMP('2025-09-04 20:33:13', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (161, 4, 2, 49, 4, TO_TIMESTAMP('2025-09-04 20:48:34', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (162, 4, 2, 169, 1, TO_TIMESTAMP('2025-09-04 20:50:18', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (163, 2, 5, 191, 5, TO_TIMESTAMP('2025-09-04 21:06:55', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (164, 3, 1, 179, 1, TO_TIMESTAMP('2025-09-04 21:07:49', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (165, 3, 1, 104, 3, TO_TIMESTAMP('2025-09-04 21:07:49', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (166, 1, 4, 139, 5, TO_TIMESTAMP('2025-09-04 22:22:03', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (167, 4, 1, 38, 3, TO_TIMESTAMP('2025-09-04 23:32:50', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (168, 1, 4, 154, 4, TO_TIMESTAMP('2025-09-04 23:55:23', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (169, 5, 5, 100, 5, TO_TIMESTAMP('2025-09-05 07:19:08', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (170, 1, 1, 112, 3, TO_TIMESTAMP('2025-09-05 07:27:04', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (171, 1, 5, 113, 2, TO_TIMESTAMP('2025-09-05 08:04:55', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (172, 5, 1, 49, 4, TO_TIMESTAMP('2025-09-05 08:23:09', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (173, 4, 1, 147, 4, TO_TIMESTAMP('2025-09-05 09:00:04', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (174, 4, 1, 4, 5, TO_TIMESTAMP('2025-09-05 09:01:22', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (175, 3, 5, 21, 1, TO_TIMESTAMP('2025-09-05 09:08:53', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (176, 3, 1, 168, 3, TO_TIMESTAMP('2025-09-05 09:25:14', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (177, 5, 5, 28, 3, TO_TIMESTAMP('2025-09-05 09:47:16', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (178, 1, 2, 131, 4, TO_TIMESTAMP('2025-09-05 09:47:16', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (179, 1, 1, 166, 2, TO_TIMESTAMP('2025-09-05 10:18:17', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (180, 1, 4, 104, 1, TO_TIMESTAMP('2025-09-05 10:22:34', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (181, 5, 4, 49, 3, TO_TIMESTAMP('2025-09-05 11:15:42', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (182, 1, 5, 197, 2, TO_TIMESTAMP('2025-09-05 11:41:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (183, 1, 5, 124, 3, TO_TIMESTAMP('2025-09-05 11:41:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (184, 4, 2, 130, 1, TO_TIMESTAMP('2025-09-05 12:05:47', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (185, 2, 4, 26, 1, TO_TIMESTAMP('2025-09-05 12:52:02', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (186, 1, 3, 52, 5, TO_TIMESTAMP('2025-09-05 13:29:40', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (187, 2, 5, 9, 5, TO_TIMESTAMP('2025-09-05 13:41:35', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (188, 5, 3, 145, 5, TO_TIMESTAMP('2025-09-05 14:13:17', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (189, 3, 1, 156, 5, TO_TIMESTAMP('2025-09-05 14:20:45', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (190, 1, 3, 193, 1, TO_TIMESTAMP('2025-09-05 14:22:38', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (191, 5, 4, 58, 1, TO_TIMESTAMP('2025-09-05 17:17:37', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (192, 4, 2, 183, 5, TO_TIMESTAMP('2025-09-05 17:29:07', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (193, 4, 3, 190, 4, TO_TIMESTAMP('2025-09-05 18:08:06', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (194, 2, 2, 199, 1, TO_TIMESTAMP('2025-09-05 18:17:46', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (195, 3, 3, 109, 5, TO_TIMESTAMP('2025-09-05 19:08:17', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (196, 1, 3, 173, 3, TO_TIMESTAMP('2025-09-05 19:42:06', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (197, 4, 4, 62, 5, TO_TIMESTAMP('2025-09-05 20:07:45', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (198, 5, 1, 131, 4, TO_TIMESTAMP('2025-09-05 20:09:10', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (199, 3, 2, 80, 9, TO_TIMESTAMP('2025-09-05 20:11:03', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (200, 3, 4, 173, 2, TO_TIMESTAMP('2025-09-05 20:36:13', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (201, 3, 4, 9, 2, TO_TIMESTAMP('2025-09-05 20:36:13', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (202, 2, 4, 88, 2, TO_TIMESTAMP('2025-09-05 21:06:43', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (203, 4, 2, 150, 3, TO_TIMESTAMP('2025-09-05 21:13:58', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (204, 3, 5, 106, 4, TO_TIMESTAMP('2025-09-05 21:18:45', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (205, 3, 5, 49, 5, TO_TIMESTAMP('2025-09-05 21:25:27', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (206, 3, 5, 52, 5, TO_TIMESTAMP('2025-09-05 21:33:34', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (207, 1, 2, 33, 1, TO_TIMESTAMP('2025-09-05 21:34:25', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (208, 2, 5, 136, 4, TO_TIMESTAMP('2025-09-05 21:40:46', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (209, 4, 5, 156, 4, TO_TIMESTAMP('2025-09-05 22:09:47', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (210, 5, 5, 96, 2, TO_TIMESTAMP('2025-09-05 22:14:14', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (211, 3, 4, 87, 2, TO_TIMESTAMP('2025-09-05 22:35:48', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (212, 3, 3, 70, 1, TO_TIMESTAMP('2025-09-05 22:57:01', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (213, 5, 5, 41, 4, TO_TIMESTAMP('2025-09-05 23:04:18', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (214, 5, 4, 190, 4, TO_TIMESTAMP('2025-09-06 07:02:52', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (215, 5, 5, 98, 3, TO_TIMESTAMP('2025-09-06 07:06:05', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (216, 4, 3, 127, 3, TO_TIMESTAMP('2025-09-06 07:33:13', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (217, 2, 1, 99, 5, TO_TIMESTAMP('2025-09-06 07:59:12', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (218, 2, 5, 182, 1, TO_TIMESTAMP('2025-09-06 09:06:32', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (219, 1, 1, 80, 2, TO_TIMESTAMP('2025-09-06 09:14:19', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (220, 4, 4, 27, 5, TO_TIMESTAMP('2025-09-06 09:23:28', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (221, 1, 5, 141, 2, TO_TIMESTAMP('2025-09-06 09:33:32', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (222, 3, 2, 32, 2, TO_TIMESTAMP('2025-09-06 10:01:41', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (223, 4, 2, 98, 3, TO_TIMESTAMP('2025-09-06 10:10:32', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (224, 5, 5, 47, 4, TO_TIMESTAMP('2025-09-06 10:44:15', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (225, 4, 4, 123, 2, TO_TIMESTAMP('2025-09-06 10:51:45', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (226, 5, 3, 12, 2, TO_TIMESTAMP('2025-09-06 11:17:15', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (227, 2, 4, 62, 5, TO_TIMESTAMP('2025-09-06 11:25:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (228, 2, 4, 179, 1, TO_TIMESTAMP('2025-09-06 11:25:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (229, 2, 4, 113, 3, TO_TIMESTAMP('2025-09-06 11:25:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (230, 4, 1, 59, 2, TO_TIMESTAMP('2025-09-06 11:25:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (231, 2, 3, 125, 2, TO_TIMESTAMP('2025-09-06 11:25:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (232, 2, 1, 162, 3, TO_TIMESTAMP('2025-09-06 12:43:35', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (233, 3, 2, 117, 3, TO_TIMESTAMP('2025-09-06 13:46:04', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (234, 1, 3, 133, 1, TO_TIMESTAMP('2025-09-06 13:46:04', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (235, 5, 1, 99, 4, TO_TIMESTAMP('2025-09-06 14:11:01', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (236, 3, 1, 15, 1, TO_TIMESTAMP('2025-09-06 14:40:05', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (237, 1, 3, 168, 3, TO_TIMESTAMP('2025-09-06 14:47:43', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (238, 2, 2, 153, 3, TO_TIMESTAMP('2025-09-06 17:03:34', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (239, 1, 2, 193, 3, TO_TIMESTAMP('2025-09-06 17:05:40', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (240, 3, 3, 184, 5, TO_TIMESTAMP('2025-09-06 17:11:13', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (241, 3, 4, 184, 5, TO_TIMESTAMP('2025-09-06 17:25:12', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (242, 3, 1, 85, 1, TO_TIMESTAMP('2025-09-06 17:44:40', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (243, 3, 1, 51, 1, TO_TIMESTAMP('2025-09-06 17:56:21', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (244, 1, 1, 45, 1, TO_TIMESTAMP('2025-09-06 17:56:21', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (245, 4, 1, 75, 1, TO_TIMESTAMP('2025-09-06 17:56:21', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (246, 1, 2, 187, 4, TO_TIMESTAMP('2025-09-06 19:40:04', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (247, 5, 4, 193, 3, TO_TIMESTAMP('2025-09-06 19:49:41', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (248, 3, 2, 12, 5, TO_TIMESTAMP('2025-09-06 20:14:18', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (249, 4, 4, 152, 3, TO_TIMESTAMP('2025-09-06 20:20:57', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (250, 4, 3, 100, 3, TO_TIMESTAMP('2025-09-06 20:29:48', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (251, 1, 5, 30, 2, TO_TIMESTAMP('2025-09-06 20:49:15', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (252, 4, 4, 191, 4, TO_TIMESTAMP('2025-09-06 20:51:27', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (253, 2, 3, 152, 4, TO_TIMESTAMP('2025-09-06 21:28:14', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (254, 3, 4, 38, 5, TO_TIMESTAMP('2025-09-06 22:19:08', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (255, 5, 5, 116, 5, TO_TIMESTAMP('2025-09-06 22:31:41', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (256, 1, 2, 180, 5, TO_TIMESTAMP('2025-09-06 22:37:36', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (257, 5, 2, 154, 1, TO_TIMESTAMP('2025-09-06 22:54:10', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (258, 5, 3, 9, 1, TO_TIMESTAMP('2025-09-06 23:08:19', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (259, 1, 2, 99, 7, TO_TIMESTAMP('2025-09-07 07:21:02', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (260, 3, 5, 171, 1, TO_TIMESTAMP('2025-09-07 08:04:15', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (261, 3, 5, 196, 1, TO_TIMESTAMP('2025-09-07 08:09:13', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (262, 3, 2, 139, 2, TO_TIMESTAMP('2025-09-07 08:29:57', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (263, 4, 4, 120, 1, TO_TIMESTAMP('2025-09-07 08:29:57', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (264, 5, 2, 84, 5, TO_TIMESTAMP('2025-09-07 08:29:57', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (265, 1, 1, 69, 5, TO_TIMESTAMP('2025-09-07 09:46:25', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (266, 3, 2, 192, 5, TO_TIMESTAMP('2025-09-07 09:58:01', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (267, 3, 5, 46, 2, TO_TIMESTAMP('2025-09-07 10:05:25', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (268, 1, 5, 15, 5, TO_TIMESTAMP('2025-09-07 10:46:28', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (269, 3, 1, 122, 5, TO_TIMESTAMP('2025-09-07 10:54:13', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (270, 1, 2, 141, 5, TO_TIMESTAMP('2025-09-07 11:00:39', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (271, 1, 1, 100, 2, TO_TIMESTAMP('2025-09-07 11:13:14', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (272, 4, 3, 155, 3, TO_TIMESTAMP('2025-09-07 11:57:49', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (273, 3, 4, 145, 2, TO_TIMESTAMP('2025-09-07 12:35:21', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (274, 4, 4, 33, 1, TO_TIMESTAMP('2025-09-07 12:56:10', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (275, 1, 5, 187, 2, TO_TIMESTAMP('2025-09-07 13:01:56', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (276, 4, 3, 183, 1, TO_TIMESTAMP('2025-09-07 13:27:17', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (277, 2, 4, 170, 5, TO_TIMESTAMP('2025-09-07 13:37:20', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (278, 1, 2, 174, 4, TO_TIMESTAMP('2025-09-07 13:58:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (279, 3, 3, 5, 3, TO_TIMESTAMP('2025-09-07 14:11:25', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (280, 2, 3, 164, 3, TO_TIMESTAMP('2025-09-07 14:35:36', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (281, 4, 4, 132, 4, TO_TIMESTAMP('2025-09-07 14:38:04', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (282, 1, 1, 31, 1, TO_TIMESTAMP('2025-09-07 14:45:42', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (283, 3, 1, 144, 1, TO_TIMESTAMP('2025-09-07 14:51:05', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (284, 3, 1, 112, 1, TO_TIMESTAMP('2025-09-07 17:31:08', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (285, 5, 1, 202, 1, TO_TIMESTAMP('2025-09-07 17:36:10', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (286, 1, 2, 189, 3, TO_TIMESTAMP('2025-09-07 18:10:46', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (287, 2, 2, 32, 7, TO_TIMESTAMP('2025-09-07 19:03:07', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (288, 4, 2, 93, 3, TO_TIMESTAMP('2025-09-07 19:24:06', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (289, 2, 1, 116, 2, TO_TIMESTAMP('2025-09-07 19:38:12', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (290, 4, 3, 69, 1, TO_TIMESTAMP('2025-09-07 19:44:18', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (291, 5, 5, 126, 1, TO_TIMESTAMP('2025-09-07 19:50:51', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (292, 4, 4, 26, 5, TO_TIMESTAMP('2025-09-07 20:06:57', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (293, 4, 3, 42, 1, TO_TIMESTAMP('2025-09-07 21:00:29', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (294, 5, 4, 119, 2, TO_TIMESTAMP('2025-09-07 21:03:18', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (295, 5, 2, 73, 3, TO_TIMESTAMP('2025-09-07 21:59:29', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (296, 3, 2, 144, 3, TO_TIMESTAMP('2025-09-07 22:24:29', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (297, 1, 5, 169, 4, TO_TIMESTAMP('2025-09-07 22:56:21', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (298, 1, 4, 166, 3, TO_TIMESTAMP('2025-09-07 23:11:48', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (299, 5, 4, 57, 2, TO_TIMESTAMP('2025-09-07 23:23:14', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO store_rev_1 (receipt_id, store_id, customer_id, product_id, qty, order_datetime) VALUES (300, 4, 3, 121, 8, TO_TIMESTAMP('2025-09-07 23:35:20', 'YYYY-MM-DD HH24:MI:SS'));

