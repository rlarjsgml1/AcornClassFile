-- 테이블 생성
CREATE TABLE PEOPLE (   
    people_id      VARCHAR2(10) PRIMARY KEY,        
    people_name    VARCHAR2(50) NOT NULL, 
    birthday       DATE DEFAULT SYSDATE,
    phone          VARCHAR2(20) UNIQUE,
    gender         CHAR(1) CHECK (gender IN ('M','F')),
    address        VARCHAR2(100)
);

CREATE TABLE MEDICINE ( 
    medicine_id      VARCHAR2(10) PRIMARY KEY,       
    medicine_name    VARCHAR2(100) NOT NULL,
    maker            VARCHAR2(30),
    category         VARCHAR2(30),
    price            NUMBER(10,2) CHECK (price >= 0)
);

CREATE TABLE MEDICINE_STORE (    
    store_id        VARCHAR2(10) PRIMARY KEY,
    store_name      VARCHAR2(15),   
    store_addr      VARCHAR2(100),
    store_phone     VARCHAR2(20) UNIQUE
);

CREATE TABLE RECIPE (   
    recipe_id        VARCHAR2(10) PRIMARY KEY,         
    issue_date       DATE NOT NULL,
    people_id        VARCHAR2(10) NOT NULL,
    store_id         VARCHAR2(10) NOT NULL,
    note             VARCHAR2(50),
    CONSTRAINT fk_rec_people
        FOREIGN KEY (people_id) REFERENCES PEOPLE(people_id),
    CONSTRAINT fk_rec_store
        FOREIGN KEY (store_id) REFERENCES MEDICINE_STORE(store_id)
);

CREATE TABLE RECIPE_MED (    
    recipe_id         VARCHAR2(10) NOT NULL,
    medicine_id       VARCHAR2(10) NOT NULL,
    dosage            NUMBER CHECK (dosage > 0),      
    times_per_day     NUMBER CHECK (times_per_day > 0),  
    total_days        NUMBER CHECK (total_days > 0),   
    CONSTRAINT pk_rec_med PRIMARY KEY (recipe_id, medicine_id),
    CONSTRAINT fk_pd_rec FOREIGN KEY (recipe_id)
																       REFERENCES RECIPE(recipe_id),
    CONSTRAINT fk_pd_med FOREIGN KEY (medicine_id)
															         REFERENCES MEDICINE(medicine_id)
);

-- 데이터 추가
INSERT INTO PEOPLE VALUES ('P001', '홍길동', TO_DATE('1990-05-15','YYYY-MM-DD'), '010-1234-5678', 'M', '서울시 강남구');
INSERT INTO PEOPLE VALUES ('P002', '김영희', TO_DATE('1985-11-23','YYYY-MM-DD'), '010-2345-6789', 'F', '서울시 송파구');
INSERT INTO PEOPLE VALUES ('P003', '이철수', TO_DATE('1992-07-02','YYYY-MM-DD'), '010-3456-7890', 'M', '경기도 성남시');
INSERT INTO PEOPLE VALUES ('P004', '박민정', TO_DATE('1988-03-14','YYYY-MM-DD'), '010-4567-8901', 'F', '경기도 고양시');
INSERT INTO PEOPLE VALUES ('P005', '최재훈', TO_DATE('1995-12-30','YYYY-MM-DD'), '010-5678-9012', 'M', '부산시 해운대구');
INSERT INTO PEOPLE VALUES ('P006', '정수민', TO_DATE('1991-01-09','YYYY-MM-DD'), '010-6789-0123', 'F', '서울시 마포구');
INSERT INTO PEOPLE VALUES ('P007', '오세훈', TO_DATE('1987-09-28','YYYY-MM-DD'), '010-7890-1234', 'M', '서울시 용산구');
INSERT INTO PEOPLE VALUES ('P008', '한지민', TO_DATE('1993-02-17','YYYY-MM-DD'), '010-8901-2345', 'F', '경기도 고양시');
INSERT INTO PEOPLE VALUES ('P009', '배준호', TO_DATE('1984-12-05','YYYY-MM-DD'), '010-9012-3456', 'M', '경기도 수원시');
INSERT INTO PEOPLE VALUES ('P010', '서유진', TO_DATE('1996-04-21','YYYY-MM-DD'), '010-0123-4568', 'F', '부산시 남구');
INSERT INTO PEOPLE VALUES ('P011', '문지호', TO_DATE('1990-06-11','YYYY-MM-DD'), '010-1122-3344', 'M', '대구시 수성구');
INSERT INTO PEOPLE VALUES ('P012', '김다은', TO_DATE('1998-08-08','YYYY-MM-DD'), '010-2233-4455', 'F', '인천시 남동구');
INSERT INTO PEOPLE VALUES ('P013', '이도현', TO_DATE('1982-10-02','YYYY-MM-DD'), '010-3344-5566', 'M', '광주시 서구');
INSERT INTO PEOPLE VALUES ('P014', '장미래', TO_DATE('1997-03-30','YYYY-MM-DD'), '010-4455-6677', 'F', '대전시 유성구');
INSERT INTO PEOPLE VALUES ('P015', '장도연', TO_DATE('1993-02-28','YYYY-MM-DD'), '010-5566-6897', 'F', '대전시 동구');


INSERT INTO MEDICINE VALUES ('M001', '타이레놀', '제약A', '진통제', 5000);
INSERT INTO MEDICINE VALUES ('M002', '판콜', '제약B', '감기약', 8000);
INSERT INTO MEDICINE VALUES ('M003', '암로디핀', '제약C', '혈압약', 12000);
INSERT INTO MEDICINE VALUES ('M004', '멀티비타민', '제약D', '영양제', 15000);
INSERT INTO MEDICINE VALUES ('M005', '소화제', '제약E', '소화제', 7000);
INSERT INTO MEDICINE VALUES ('M006', '이부프로펜', '제약A', '진통제', 6000);
INSERT INTO MEDICINE VALUES ('M007', '레보플록사신', '제약B', '항생제', 18000);
INSERT INTO MEDICINE VALUES ('M008', '세티리진', '제약C', '항히스타민', 9000);
INSERT INTO MEDICINE VALUES ('M009', '오메가3', '제약D', '영양제', 20000);
INSERT INTO MEDICINE VALUES ('M010', '라니티딘', '제약E', '소화제', 7500);
INSERT INTO MEDICINE VALUES ('M011', '덱시부프로펜', '제약A', '진통제', 9500);
INSERT INTO MEDICINE VALUES ('M012', '리시노프릴', '제약B', '혈압약', 13000);
INSERT INTO MEDICINE VALUES ('M013', '아젤라스틴', '제약EF', '비염약', 11000);
INSERT INTO MEDICINE VALUES ('M014', '유산균', '제약D', '영양제', 17000);
INSERT INTO MEDICINE VALUES ('M015', '아모디핀-복합', '제약E', '혈압약', 14000);


INSERT INTO MEDICINE_STORE VALUES ('S001', '강남삼성약국', '서울시 강남구 삼성동', '02-123-4567');
INSERT INTO MEDICINE_STORE VALUES ('S002', '잠실건강약국', '서울시 송파구 잠실동', '02-234-5678');
INSERT INTO MEDICINE_STORE VALUES ('S003', '분당메디컬약국', '경기도 성남시 분당구', '031-345-6789');
INSERT INTO MEDICINE_STORE VALUES ('S004', '해운대바다약국', '부산시 해운대구 우동', '051-456-7890');
INSERT INTO MEDICINE_STORE VALUES ('S005', '일산중앙약국', '경기도 고양시 일산동구', '031-567-8901');
INSERT INTO MEDICINE_STORE VALUES ('S006', '합정프라자약국', '서울시 마포구 합정동', '02-678-9012');
INSERT INTO MEDICINE_STORE VALUES ('S007', '이태원글로벌약국', '서울시 용산구 이태원동', '02-789-0123');
INSERT INTO MEDICINE_STORE VALUES ('S008', '수유메디약국', '서울시 강북구 수유동', '02-890-1234');
INSERT INTO MEDICINE_STORE VALUES ('S009', '서초센트럴약국', '서울시 서초구 서초동', '02-901-2345');
INSERT INTO MEDICINE_STORE VALUES ('S010', '불광그린약국', '서울시 은평구 불광동', '02-912-3456');
INSERT INTO MEDICINE_STORE VALUES ('S011', '일산동구중앙약국', '경기도 고양시 일산동구', '031-456-7891');
INSERT INTO MEDICINE_STORE VALUES ('S012', '영통프라임약국', '경기도 수원시 영통구', '031-567-8902');
INSERT INTO MEDICINE_STORE VALUES ('S013', '수정하이약국', '경기도 성남시 수정구', '031-678-9012');
INSERT INTO MEDICINE_STORE VALUES ('S014', '안양스마일약국', '경기도 안양시 동안구', '031-789-0123');
INSERT INTO MEDICINE_STORE VALUES ('S015', '부천원미약국1', '경기도 부천시 원미구', '031-345-5789');
INSERT INTO MEDICINE_STORE VALUES ('S016', '부천원미약국2', '경기도 부천시 원미구', '031-345-6790');
INSERT INTO MEDICINE_STORE VALUES ('S017', '부천원미약국3', '경기도 부천시 원미구', '031-385-6791');


INSERT INTO RECIPE VALUES ('R001', TO_DATE('2025-09-01','YYYY-MM-DD'), 'P001', 'S001', '감기', '감기 증상');
INSERT INTO RECIPE VALUES ('R002', TO_DATE('2025-09-02','YYYY-MM-DD'), 'P002', 'S002', '두통', '두통 증상');
INSERT INTO RECIPE VALUES ('R003', TO_DATE('2025-09-03','YYYY-MM-DD'), 'P003', 'S003', '고혈압', '혈압 수치 높음');
INSERT INTO RECIPE VALUES ('R004', TO_DATE('2025-09-04','YYYY-MM-DD'), 'P004', 'S004', '영양결핍', '비타민 D 부족');
INSERT INTO RECIPE VALUES ('R005', TO_DATE('2025-09-05','YYYY-MM-DD'), 'P005', 'S005', '소화불량', '소화 안됨');
INSERT INTO RECIPE VALUES ('R006', TO_DATE('2025-09-06','YYYY-MM-DD'), 'P006', 'S006', '두통', '두통 증상');
INSERT INTO RECIPE VALUES ('R007', TO_DATE('2025-09-06','YYYY-MM-DD'), 'P007', 'S007', '감기', '감기 증상');
INSERT INTO RECIPE VALUES ('R008', TO_DATE('2025-09-07','YYYY-MM-DD'), 'P008', 'S008', '알레르기 비염', '비염 증상');
INSERT INTO RECIPE VALUES ('R009', TO_DATE('2025-09-07','YYYY-MM-DD'), 'P009', 'S009', '소화불량', '소화 안됨');
INSERT INTO RECIPE VALUES ('R010', TO_DATE('2025-09-08','YYYY-MM-DD'), 'P010', 'S010', '영양결핍', '비타민 A 부족');
INSERT INTO RECIPE VALUES ('R011', TO_DATE('2025-09-09','YYYY-MM-DD'), 'P011', 'S011', '고혈압', '혈압 수치 높음');
INSERT INTO RECIPE VALUES ('R012', TO_DATE('2025-09-09','YYYY-MM-DD'), 'P012', 'S012', '영양결핍', '비타민 D 부족');
INSERT INTO RECIPE VALUES ('R013', TO_DATE('2025-09-10','YYYY-MM-DD'), 'P013', 'S013', '두통', '두통 증상');
INSERT INTO RECIPE VALUES ('R014', TO_DATE('2025-09-11','YYYY-MM-DD'), 'P014', 'S014', '소화불량', '소화 안됨');
INSERT INTO RECIPE VALUES ('R015', TO_DATE('2025-09-12','YYYY-MM-DD'), 'P015', 'S015', '알레르기 비염', '비염 증상');


INSERT INTO RECIPE_MED VALUES ('R001', 'M002', 2, 3, 5);
INSERT INTO RECIPE_MED VALUES ('R001', 'M001', 1, 2, 3);
INSERT INTO RECIPE_MED VALUES ('R002', 'M001', 1, 3, 5);
INSERT INTO RECIPE_MED VALUES ('R002', 'M004', 1, 1, 10);
INSERT INTO RECIPE_MED VALUES ('R003', 'M003', 1, 1, 30);
INSERT INTO RECIPE_MED VALUES ('R004', 'M004', 2, 1, 20);
INSERT INTO RECIPE_MED VALUES ('R005', 'M005', 1, 3, 7);
INSERT INTO RECIPE_MED VALUES ('R006', 'M006', 1, 2, 5);
INSERT INTO RECIPE_MED VALUES ('R006', 'M011', 1, 1, 5);
INSERT INTO RECIPE_MED VALUES ('R007', 'M002', 2, 3, 4);
INSERT INTO RECIPE_MED VALUES ('R007', 'M001', 1, 2, 3);
INSERT INTO RECIPE_MED VALUES ('R008', 'M008', 1, 1, 14);
INSERT INTO RECIPE_MED VALUES ('R008', 'M013', 1, 2, 7);
INSERT INTO RECIPE_MED VALUES ('R009', 'M005', 1, 3, 5);
INSERT INTO RECIPE_MED VALUES ('R009', 'M010', 1, 2, 7);
INSERT INTO RECIPE_MED VALUES ('R010', 'M009', 2, 1, 30);
INSERT INTO RECIPE_MED VALUES ('R010', 'M014', 1, 1, 30);
INSERT INTO RECIPE_MED VALUES ('R011', 'M003', 1, 1, 60);
INSERT INTO RECIPE_MED VALUES ('R011', 'M012', 1, 1, 60);
INSERT INTO RECIPE_MED VALUES ('R011', 'M015', 1, 1, 30);
INSERT INTO RECIPE_MED VALUES ('R012', 'M004', 2, 1, 20);
INSERT INTO RECIPE_MED VALUES ('R012', 'M014', 1, 1, 20);
INSERT INTO RECIPE_MED VALUES ('R013', 'M006', 1, 2, 3);
INSERT INTO RECIPE_MED VALUES ('R013', 'M011', 1, 2, 3);
INSERT INTO RECIPE_MED VALUES ('R014', 'M010', 1, 2, 14);
INSERT INTO RECIPE_MED VALUES ('R014', 'M005', 1, 1, 7);
INSERT INTO RECIPE_MED VALUES ('R015', 'M008', 1, 1, 10);

commit;

--내용 조회
--1. 환자정보 조회
SELECT people_name "환자이름", birthday "생년월일",
			TRUNC(MONTHS_BETWEEN(SYSDATE, birthday)/12) || '세' AS "나이",
			phone "연락처",
			DECODE(gender, 'M', '남', 'F', '여', '-') "성별",
			address "주소"
FROM PEOPLE;



--2. 약국 정보 조회
SELECT 
    store_name AS 약국명,
    store_phone AS 연락처,
    store_addr AS 주소,
    CASE SUBSTR(store_phone, 1, INSTR(store_phone, '-') - 1)
        WHEN '02'  THEN '서울'
        WHEN '031' THEN '경기도'
        WHEN '051' THEN '부산'
        ELSE '기타'
    END AS 지역_분류
FROM MEDICINE_STORE;



--3. 약품별 평균 복용일수와 최대 복용일수 조회
SELECT 
    m.medicine_name 약품명,
    ROUND(AVG(rm.total_days), 2) || '일' AS 평균_복용일수,
    MAX(rm.total_days) || '일' AS 최대_복용일수
FROM MEDICINE m
JOIN RECIPE_MED rm ON m.medicine_id = rm.medicine_id
GROUP BY m.medicine_name
ORDER BY 평균_복용일수 DESC;



--4. 1개의 처방전별 총 금액
SELECT rm.recipe_id 처방전고유번호, 
				TO_CHAR(SUM(m.price), '999,999') || '원' 가격
FROM RECIPE_med  rm
JOIN MEDICINE m
ON rm.medicine_id = m.medicine_id
JOIN RECIPE r
ON rm.recipe_id = r.recipe_id
GROUP BY rm.recipe_id
ORDER BY 1;



--5. 약품별 매출 TOP5 조회
SELECT 약품명, 총합
FROM (
    SELECT medicine_name AS 약품명,
           SUM(price) AS 총합,
           ROW_NUMBER() OVER (ORDER BY SUM(price) DESC) AS rn
    FROM   RECIPE_med rm
    JOIN   MEDICINE m ON rm.medicine_id = m.medicine_id
    JOIN   RECIPE r   ON rm.recipe_id   = r.recipe_id
    GROUP  BY medicine_name
)
WHERE rn <= 5
ORDER BY 총합 DESC;



--6. 지역별 약국 목록 조회
--서울 지역에 위치한 약국명
SELECT 지역, store_name 약국명
FROM (
    SELECT DECODE(
             SUBSTR(store_phone, 1, INSTR(store_phone, '-') - 1),
             '02',  '서울',
             '031', '경기도',
             '051', '부산'
           ) AS 지역,
           store_name
    FROM MEDICINE_STORE
)
WHERE 지역 = '서울';



--7. 특정 약품 처방 받은 환자 조회
SELECT people_name 환자명
FROM PEOPLE p
WHERE people_id IN (
    SELECT r.people_id
    FROM RECIPE r
    JOIN RECIPE_MED rm ON r.recipe_id = rm.recipe_id
    WHERE rm.medicine_id = 'M001'
);

