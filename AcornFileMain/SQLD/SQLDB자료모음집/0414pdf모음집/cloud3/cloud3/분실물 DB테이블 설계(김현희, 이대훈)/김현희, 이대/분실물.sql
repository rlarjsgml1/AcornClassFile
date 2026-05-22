--유실물센터정보
CREATE TABLE CENTER(
C_NAME VARCHAR2(35) PRIMARY KEY,
C_PLACE VARCHAR2(25) NOT NULL,
C_TEL  VARCHAR2(11) NOT NULL,
C_CODE VARCHAR2(10) NOT NULL UNIQUE    -- LINE 테이블에서 참조되므로 UNIQUE 필수
);
-- 센터명(주키) 위치 전화번호 센터코드
INSERT INTO CENTER VALUES('시청역유실물센터','시청역','0261101122','센터1');
INSERT INTO CENTER VALUES('충무로역유실물센터','충무로역','0261103344','센터2');
INSERT INTO CENTER VALUES('왕십리유실물센터','왕십리역','0263116766','센터3');
INSERT INTO CENTER VALUES('태릉유실물센터','태릉입구역','0261101122','센터4');
INSERT INTO CENTER VALUES('종합운동장유실물센터','9호선종합운동장역','0226560787','센터5');
COMMIT;
DROP TABLE FOUND;

--지하철정보
CREATE TABLE LINE(
L_CODE VARCHAR2(1)  PRIMARY KEY,
L_INFO VARCHAR2(25) NOT NULL,  
-- L_PLACE는 CENTER 테이블의 C_CODE를 참조하는 외래키
L_PLACE  VARCHAR2(11) NOT NULL REFERENCES CENTER(C_CODE)
);
-- 코드 호선 센터(외래키)
INSERT INTO LINE VALUES('1','1호선','센터1');
INSERT INTO LINE VALUES('2','2호선','센터1');
INSERT INTO LINE VALUES('3','3호선','센터2');
INSERT INTO LINE VALUES('4','4호선','센터2');
INSERT INTO LINE VALUES('5','5호선','센터3');
INSERT INTO LINE VALUES('6','6호선','센터4');
INSERT INTO LINE VALUES('7','7호선','센터4');
INSERT INTO LINE VALUES('8','8호선','센터3');
INSERT INTO LINE VALUES('9','9호선','센터5');
COMMIT;

--유실물센터 유실물정보
CREATE TABLE FOUND(
F_CODE VARCHAR2(35) PRIMARY KEY,
F_ITEM VARCHAR2(35) NOT NULL,
F_NAME  VARCHAR2(10) ,
F_DATE  DATE NOT NULL,
 -- F_LINE은 LINE 테이블의 L_CODE를 참조하는 외래키
F_LINE VARCHAR2(4) NOT NULL REFERENCES LINE(L_CODE),
F_STATION VARCHAR2(25) NOT NULL
); 

SELECT * FROM LOST; 
-- 관리번호(주키)  분실물 이름(신분증만)  날짜 호선 역
SELECT * FROM FOUND;
SELECT * FROM LINE;
SELECT * FROM CENTER;
--                        관리번호    습득물명               분실자명          주운일자     호선 역
INSERT INTO FOUND VALUES('F00003756','마땡킴 브라운카드지갑','','2025-09-15', '5','강동역'); 
INSERT INTO FOUND VALUES('F00004856','신분증','유지민','2025-09-14', '7','건대입구역');    
INSERT INTO FOUND VALUES('F00005751','빨간색 아디다스바람막이','','2025-09-05', '9','노량진역'); 
INSERT INTO FOUND VALUES('F00004746','스타벅스 분홍색텀블러','','2025-09-21', '6','약수역');
INSERT INTO FOUND VALUES('F00004454','운전면허증2종보통','박민정','2025-09-20', '6','약수역'); 

INSERT INTO FOUND VALUES('F00001706','검정지팡이','','2025-09-05', '1','동묘앞'); 
INSERT INTO FOUND VALUES('F00003750','김치','','2025-09-10', '7','부평구청'); 
INSERT INTO FOUND VALUES('F00005056','네이비 캡모자','','2025-09-20', '9','가양역'); 
INSERT INTO FOUND VALUES('F00002656','귀걸이','','2025-09-20', '4','숙대입구'); 
INSERT INTO FOUND VALUES('F00003700','신한카드 ','한지성','2025-09-10', '8','잠실역'); 

INSERT INTO FOUND VALUES('F00003116','진주반지','','2025-09-17', '2','성수역'); 
INSERT INTO FOUND VALUES('F00002246','검정양복상의','','2025-09-01', '3','고속터미널'); 
INSERT INTO FOUND VALUES('F00002084','에어팟 ','','2025-09-17', '4','이수역'); 
INSERT INTO FOUND VALUES('F00005084','빨강 잔스포츠백팩','','2025-09-14', '9','노량진역'); 
INSERT INTO FOUND VALUES('F00001111','셔틀버스 티켓','','2025-09-01', '1','서울역'); 

INSERT INTO FOUND VALUES('F00002222','쇼핑백(청첩장)','박영진','2025-09-22', '4','동대문역'); 
INSERT INTO FOUND VALUES('F00001358','롯데카드 ','이대훈','2025-09-13', '1','시청역'); 
INSERT INTO FOUND VALUES('F00002895','김치','','2025-09-15', '4','동대문역'); 
INSERT INTO FOUND VALUES('F00003045','삼성카드','김승민','2025-09-12', '5','강동역'); 
INSERT INTO FOUND VALUES('F00002240','삼성휴대폰','','2025-09-25', '3','교대역'); 

INSERT INTO FOUND VALUES('F00004082','아이폰','','2025-09-03', '7','논현역'); 
INSERT INTO FOUND VALUES('F00004953','아이폰','','2025-09-15', '7','강남구청역'); 
INSERT INTO FOUND VALUES('F00002757','삼성휴대폰','','2025-09-17', '4','이수역'); 
INSERT INTO FOUND VALUES('F00003033','신한카드','김현희','2025-09-01', '5','강동역'); 
INSERT INTO FOUND VALUES('F00005125','에어팟','','2025-09-17', '9','여의도역'); 
INSERT INTO FOUND VALUES('F00002924','전자담배','','2025-09-22', '3','교대역'); 

COMMIT;
-- 유실물 정보
CREATE TABLE LOST ( 
L_CODE VARCHAR2(30) PRIMARY KEY, -- 관리번호
L_NAME VARCHAR2(50 CHAR) , -- 분실물 주인 (NULL 허용 가능) 
L_ITEM VARCHAR2(100 CHAR) NOT NULL, -- 분실물명
-- L_LINE은 LINE 테이블의 L_CODE를 참조하는 외래키 (타입 불일치 주의)
L_LINE VARCHAR2(1) NOT NULL REFERENCES LINE(L_CODE),-- 호선

L_STATION VARCHAR2(50 CHAR) NOT NULL, -- 역명
L_DATE DATE NOT NULL, -- 분실일자
L_TEL VARCHAR2(20) CHECK (LENGTH(L_TEL) = 11 OR L_TEL IS NULL)-- 주인 연락처 (NULL 허용) 
 ); 


SELECT L_CODE AS "관리번호", L_NAME AS "분실물주인", L_ITEM AS "분실물명", L_LINE AS "호선", L_STATION AS "역명", 
TO_CHAR(L_DATE, 'YYYY-MM-DD') AS "분실일자", NVL( CASE WHEN L_TEL IS NOT NULL 
THEN SUBSTR(L_TEL,1,3) || '-' || SUBSTR(L_TEL,4,4) || '-' || SUBSTR(L_TEL,8,4) END, ' ' ) AS "주인연락처" 
FROM LOST ORDER BY L_CODE; 


INSERT INTO LOST (L_CODE, L_NAME, L_ITEM, L_LINE, L_STATION, L_DATE, L_TEL)
VALUES ('MG001','김현희','신한카드',2,'강남역',DATE '2025-09-10','1012345678');
INSERT INTO LOST (L_CODE, L_NAME, L_ITEM, L_LINE, L_STATION, L_DATE, L_TEL) 
VALUES ('MG002','이대훈','롯데카드',1,'시청역',DATE '2025-09-13','1012225678'); 
INSERT INTO LOST (L_CODE, L_NAME, L_ITEM, L_LINE, L_STATION, L_DATE, L_TEL)
VALUES ('MG003','박민정','운전면허증2종보통',6,'약수역',DATE '2025-09-20','1087241234'); 
INSERT INTO LOST (L_CODE, L_NAME, L_ITEM, L_LINE, L_STATION, L_DATE, L_TEL) 
VALUES ('MG004','유지민','마땡킴 브라운카드지갑',5,'강동역',DATE '2025-09-15','1065321234'); 
INSERT INTO LOST (L_CODE, L_NAME, L_ITEM, L_LINE, L_STATION, L_DATE, L_TEL) 
VALUES ('MG005','박민수','다비드 검정양복상의',3,'고속터미널',DATE '2025-09-01',NULL); 
INSERT INTO LOST (L_CODE, L_NAME, L_ITEM, L_LINE, L_STATION, L_DATE, L_TEL)
VALUES ('MG006','최명균','검정 지팡이',1,'동묘앞',DATE '2025-09-05',NULL);
INSERT INTO LOST (L_CODE, L_NAME, L_ITEM, L_LINE, L_STATION, L_DATE, L_TEL) 
VALUES ('MG007','김승민','빨강 잔스포츠 백팩',9,'노량진역',DATE '2025-09-14','1033221234'); 
INSERT INTO LOST (L_CODE, L_NAME, L_ITEM, L_LINE, L_STATION, L_DATE, L_TEL)
VALUES ('MG008','야가다','에어팟',4,'이수역',DATE '2025-09-17',NULL); 
INSERT INTO LOST (L_CODE, L_NAME, L_ITEM, L_LINE, L_STATION, L_DATE, L_TEL) 
VALUES ('MG010','김옥균','김치',7,'부평구청',DATE '2025-09-10',NULL); 
INSERT INTO LOST (L_CODE, L_NAME, L_ITEM, L_LINE, L_STATION, L_DATE, L_TEL)
VALUES ('MG011','김승민','현금',1,'동묘앞',DATE '2025-09-25','1045387324'); 
INSERT INTO LOST (L_CODE, L_NAME, L_ITEM, L_LINE, L_STATION, L_DATE, L_TEL)
VALUES ('MG013',NULL,'아디다스 후드집업',3,'고속터미널',DATE '2025-09-01','1045384524'); 
INSERT INTO LOST (L_CODE, L_NAME, L_ITEM, L_LINE, L_STATION, L_DATE, L_TEL)
VALUES ('MG012',NULL,'맥세이브카드지갑',4,'이수역',DATE '2025-09-15','1045387324'); 
INSERT INTO LOST (L_CODE, L_NAME, L_ITEM, L_LINE, L_STATION, L_DATE, L_TEL) 
VALUES ('MG009',NULL,'진주반지',2,'성수역',DATE '2025-09-17',NULL);

 
 select c.c_name, c.c_place, c.c_tel, l.l_info, l.l_place
 from center c
 join line l
 on c.c_code = l.l_place;
  
select f.f_code, f.f_item, f.f_name, f.f_date, f.f_line, f.f_station,
c.c_name, c.c_place, c.c_tel
from line l
join center c
on c.c_code = l.l_place
join found f
on l.l_code = f.f_line;

select o.l_code, o.l_name, o.l_item,
o.l_line, o.l_station, o.l_date,
c.c_name, c.c_place, c.c_tel
from line l
join center c
on c.c_code = l.l_place
join lost o
on l.l_code = o.l_line;

select * from found;
select * from lost;

select f.f_code, f.f_item, f.f_name, f.f_date, f.f_line, f.f_station,
c.c_name, c.c_place, c.c_tel
from line l
join center c
on c.c_code = l.l_place
join found f
on l.l_code = f.f_line
where f.f_item = '아이폰';

select f.f_code, f.f_item, f.f_name, f.f_date, f.f_line, f.f_station,
c.c_name, c.c_place, c.c_tel
from line l
join center c
on c.c_code = l.l_place
join found f
on l.l_code = f.f_line
where f.f_item = '김치';