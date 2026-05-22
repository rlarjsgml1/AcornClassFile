--따릉이 PROJECT
--대여소정보 테이블 station_tbl
CREATE TABLE station_tbl (
    station_id   VARCHAR2(10) PRIMARY KEY,
    station_name VARCHAR2(50) NOT NULL,
    location     VARCHAR2(20) NOT NULL
);

INSERT INTO station_tbl VALUES ( 'S101', '국회의사당 본관', '영등포구' );
INSERT INTO station_tbl VALUES ( 'S102', '국민일보 앞', '영등포구' );
INSERT INTO station_tbl VALUES ( 'S103', '여의도역 2번출구 앞', '영등포구' );
INSERT INTO station_tbl VALUES ( 'S104', '63스퀘어', '영등포구' );
INSERT INTO station_tbl VALUES ( 'S201', '마포구청역', '마포구' );
INSERT INTO station_tbl VALUES ( 'S202', '홍대입구역사거리', '마포구' );
INSERT INTO station_tbl VALUES ( 'S203', '연남동주민센터앞', '마포구' );
INSERT INTO station_tbl VALUES ( 'S301', '롯데월드타워', '송파구' );
INSERT INTO station_tbl VALUES ( 'S302', '방이삼거리', '송파구' );
INSERT INTO station_tbl VALUES ( 'S303', '홈플러스 잠실점', '송파구' );
COMMIT;

SELECT * FROM station_tbl;

--회원정보 테이블 member_tbl
CREATE TABLE member_tbl (
    member_id   VARCHAR2(20) PRIMARY KEY,
    member_name VARCHAR2(20) NOT NULL,
    age  NUMBER(3) NOT NULL,
    gender CHAR(1) NOT NULL CHECK (gender IN ('M', 'F')),
    join_date DATE DEFAULT SYSDATE NOT NULL
);

INSERT INTO member_tbl VALUES ( 'M1001', '진희', '29', 'F', '2020-05-13' );
INSERT INTO member_tbl VALUES ( 'M1002', '도영', '21', 'M', '2020-05-28' );
INSERT INTO member_tbl VALUES ( 'M1003', '이안', '17', 'M', '2021-01-15' );
INSERT INTO member_tbl VALUES ( 'M1004', '홍민', '44', 'M', '2021-09-29' );
INSERT INTO member_tbl VALUES ( 'M1005', '서준', '33', 'M', '2022-06-26' );
INSERT INTO member_tbl VALUES ( 'M1006', '윤서', '35', 'F', '2023-03-19' );
INSERT INTO member_tbl VALUES ( 'M1007', '동원', '38', 'M', '2023-04-03' );
INSERT INTO member_tbl VALUES ( 'M1008', '승민', '31', 'M', '2023-07-10' );
INSERT INTO member_tbl VALUES ( 'M1009', '지민', '42', 'M', '2023-11-16' );
INSERT INTO member_tbl VALUES ( 'M1010', '이서', '19', 'F', '2024-04-18' );
INSERT INTO member_tbl VALUES ( 'M1011', '윤아', '26', 'F', '2024-07-22' );
INSERT INTO member_tbl VALUES ( 'M1012', '소민', '30', 'F', '2024-08-30' );
INSERT INTO member_tbl VALUES ( 'M1013', '지현', '33', 'F', '2025-02-09' );
INSERT INTO member_tbl VALUES ( 'M1014', '현진', '42', 'M', '2025-09-26' );
INSERT INTO member_tbl VALUES ( 'M1015', '우주', '25', 'M', '2025-10-24' );
COMMIT;

SELECT * FROM member_tbl;

--자전거정보 테이블 bike_tbl
CREATE TABLE bike_tbl (
    bike_id   VARCHAR2(10) PRIMARY KEY,
    station_id VARCHAR2(10) NOT NULL REFERENCES station_tbl(station_id),
    type NUMBER(2) NOT NULL CHECK (type IN (10, 20)),
    status VARCHAR2(20)  NOT NULL CHECK (status IN ('이용가능', '수리중', '고장'))
);

INSERT INTO bike_tbl VALUES ( 'B01', 'S101', '10', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B02', 'S101', '20', '고장' );
INSERT INTO bike_tbl VALUES ( 'B03', 'S103', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B04', 'S301', '20', '수리중' );
INSERT INTO bike_tbl VALUES ( 'B05', 'S301', '10', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B06', 'S102', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B07', 'S201', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B08', 'S104', '20', '고장' );
INSERT INTO bike_tbl VALUES ( 'B09', 'S101', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B10', 'S103', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B11', 'S201', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B12', 'S101', '10', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B13', 'S104', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B14', 'S202', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B15', 'S102', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B16', 'S301', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B17', 'S101', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B18', 'S104', '20', '수리중' );
INSERT INTO bike_tbl VALUES ( 'B19', 'S104', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B20', 'S201', '10', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B21', 'S203', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B22', 'S101', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B23', 'S101', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B24', 'S301', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B25', 'S104', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B26', 'S303', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B27', 'S104', '20', '수리중' );
INSERT INTO bike_tbl VALUES ( 'B28', 'S303', '20', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B29', 'S301', '10', '이용가능' );
INSERT INTO bike_tbl VALUES ( 'B30', 'S103', '20', '이용가능' );
COMMIT;

SELECT * FROM bike_tbl;

--이용내역 테이블 service_tbl

CREATE TABLE service_tbl (
    service_id  VARCHAR2(20) PRIMARY KEY,
    member_id   VARCHAR2(20) NOT NULL REFERENCES member_tbl(member_id),
    bike_id  VARCHAR2(4) NOT NULL REFERENCES bike_tbl(bike_id),
    rental_station_id  VARCHAR2(4) NOT NULL REFERENCES station_tbl(station_id),
    return_station_id  VARCHAR2(4) NOT NULL REFERENCES station_tbl(station_id),
    rental_time VARCHAR2(5),
    return_time VARCHAR2(5),
    fee number(5)
);
    
INSERT INTO service_tbl VALUES
( 'SV250929-0001', 'M1004', 'B06' , 'S102', 'S101', '06:38', '07:15', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0002', 'M1014', 'B15' , 'S102', 'S201', '07:02', '07:40', 2000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0003', 'M1006', 'B21' , 'S203', 'S101', '07:11' , '07:32', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0004', 'M1012', 'B26' , 'S303', 'S101', '07:15' , '07:55', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0005', 'M1005', 'B01' , 'S101', 'S103', '07:28' , '07:45', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0006', 'M1011', 'B30' , 'S103', 'S202', '07:29', '08:08', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0007', 'M1010', 'B14' , 'S202', 'S102', '08:32' , '08:58', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0008', 'M1007', 'B28' , 'S303', 'S201', '08:47' , '09:15', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0009', 'M1015', 'B01' , 'S103', 'S303', '10:32' , '12:35', 2000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0010', 'M1009', 'B25' , 'S104', 'S202', '12:04' , '12:30', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0011', 'M1002', 'B29' , 'S301', 'S303', '12:36' , '13:02', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0012', 'M1002', 'B29' , 'S303', 'S302', '13:12' , '13:53', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0013', 'M1008', 'B24' , 'S301', 'S202', '17:49' , '19:05', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0014', 'M1015', 'B19' , 'S104', 'S201', '17:55' , '19:30', 2000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0015', 'M1001', 'B30' , 'S202', 'S303', '17:59' , '18:46', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0016', 'M1003', 'B16' , 'S301', 'S203', '18:03' , '19:53', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0017', 'M1007', 'B05' , 'S301', 'S103', '18:07' , '20:19', 2000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0018', 'M1010', 'B29' , 'S302', 'S202', '18:18' , '19:22', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0019', 'M1005', 'B10' , 'S103', 'S102', '18:19' , '18:34', 1000 );
INSERT INTO service_tbl VALUES
( 'SV250929-0020', 'M1013', 'B07' , 'S201', 'S301', '19:30' , '21:02', 2000 );
COMMIT;

SELECT * FROM service_tbl;


--
--시나리오
--1. 출퇴근 시간에 따릉이를 모두 이용한 사람 조회하기
--출퇴근 시간에 이용하는 회원 정보 조회하기 (이용내역 join 회원정보)
select *
from service_tbl s
join member_tbl m
on s.member_id = m.member_id;

--출근(07시 ~ 09시), 퇴근(18시 ~ 19시) 시간에 이용하는 회원 정보 조회하기
select s.member_id, m.member_name, s.rental_time, s.return_time
from service_tbl s
join member_tbl m
on s.member_id = m.member_id
where s.rental_time between '07:00' and '09:00' or
      s.rental_time between '18:00' and '19:00'
order by rental_time;

--출근(07시 ~ 09시), 퇴근(18시 ~ 19시) 시간 모두 이용하는 회원 정보 조회하기
select s.member_id, m.member_name
from service_tbl s
join member_tbl m
on s.member_id = m.member_id
where s.rental_time between '07:00' and '09:00'

intersect

select s.member_id, m.member_name
from service_tbl s
join member_tbl m
on s.member_id = m.member_id
where s.rental_time between '18:00' and '19:00';

--2. 성별&연령대 별 따릉이 이용자 수 조회하기
--연령대와 성별에 따른 이용자 수 조회하기 (이용내역 join 회원)
select  *
from service_tbl s
join member_tbl m
on s.member_id = m.member_id;

select  trunc(m.age/10)*10 || '대' "Age_group", m.gender "Gender" , count(*)"Count"
from service_tbl s
join member_tbl m
on s.member_id = m.member_id
group by trunc(m.age/10)*10, m.gender
order by 1;

--3. 고객별 따릉이 이용시간 조회하기, 따릉이 이용시간에 따른 최종요금 출력하기
--멤버와 이용내역 테이블 조회하기
select *
from service_tbl se
join member_tbl m
on se.member_id = m.member_id;

--서브쿼리
select member_id, rental_time, return_time, 
round((TO_DATE(return_time, 'HH24:MI') - TO_DATE(rental_time, 'HH24:MI')) * 24 * 60,1) usetime
from service_tbl;

--서브쿼리와 합치기 (멤버별 이용시간 출력하기)
select m.member_name, se.usetime || '분' 
from (select member_id, rental_time, return_time, 
round((TO_DATE(return_time, 'HH24:MI') - TO_DATE(rental_time, 'HH24:MI')) * 24 * 60,1) as usetime
from service_tbl) se
join member_tbl m
on se.member_id = m.member_id;

--이용시간에 따른 최종요금 출력하기 (초과시 +1000원부가)
select m.member_name, se.usetime || '분' , se.fee || '원' as 기본요금,
case when se.fee = 1000 AND se.usetime > 60 then se.fee + 1000
     when se.fee = 2000 AND se.usetime > 120 then se.fee + 1000
     else se.fee
     end || '원' as 최종요금
from (select member_id, rental_time, return_time, fee,
round((TO_DATE(return_time, 'HH24:MI') - TO_DATE(rental_time, 'HH24:MI')) * 24 * 60,1) as usetime
from service_tbl) se
join member_tbl m
on se.member_id = m.member_id;

--4. 대여소별 이용 가능한 따릉이 수 조회하기 (순위출력)
--자전거 테이블에서 이용가능한 자전거만 조회하기
select *
from station_tbl st
join bike_tbl b
on st.station_id = b.station_id and b.status = '이용가능';

--대여소별 이용가능한 자전거의 개수 출력하기
select station_name, count(*)
from station_tbl st
join bike_tbl b
on st.station_id = b.station_id and b.status = '이용가능'
group by station_name;

--대여소별 이용가능한 자전거가 많은 순서대로 순위매기기
select st.station_id, st.station_name, count(*) as bike_count,
 dense_rank() over (order by count(*) desc) as rnk
from bike_tbl b
join station_tbl st
on b.station_id = st.station_id
where b.status = '이용가능'
group by st.station_id, st.station_name;

