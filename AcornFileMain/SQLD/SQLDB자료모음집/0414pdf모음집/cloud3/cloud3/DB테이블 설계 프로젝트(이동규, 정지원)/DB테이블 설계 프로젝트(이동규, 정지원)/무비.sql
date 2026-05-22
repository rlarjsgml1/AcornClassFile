-- 영화 테이블 생성 --
CREATE TABLE movie(
        MOVIE_ID NUMBER(15) PRIMARY KEY,
        TITLE VARCHAR2(30) NOT NULL,
        RELEASE_YEAR NUMBER(13) NOT NULL,
        GENRE VARCHAR2(10) NOT NULL,
        RUNTIME NUMBER(4) NOT NULL 
);

-- 배우 테이블 생성 --
CREATE TABLE actor (
    actor_id NUMBER PRIMARY KEY,
    name VARCHAR2(50) NOT NULL,
    birth_date DATE,
    gender char(6) NOT NULL
);

-- 감독 테이블 생성 
CREATE TABLE director (
    director_id NUMBER PRIMARY KEY,
    name VARCHAR2(50) NOT NULL,
    birth_date DATE,
    gender char(6) NOT NULL
);

--고객 테이블 생성 --
create table reviewer(
    user_id number primary key,
    name varchar2(20) not null,
    movie_id number not null,
    rating number DEFAULT 0 not null,
    review_text varchar(200),
    review_date date
);

-- 영화 & 배우 테이블 생성 --
CREATE TABLE casting(
        MOVIE_ID NUMBER,
        DIRECTOR_ID NUMBER,
        ACTOR_ID NUMBER,
        ROLE_NAME VARCHAR2(100),
        CONSTRAINT PK_MOVIE_INFO PRIMARY KEY (MOVIE_ID, ACTOR_ID, DIRECTOR_ID),
        CONSTRAINT FK_MOVIE FOREIGN KEY (MOVIE_ID) REFERENCES MOVIE(MOVIE_ID),
        CONSTRAINT FK_DIRECTOR FOREIGN KEY (DIRECTOR_ID) REFERENCES DIRECTOR(DIRECTOR_ID),
        CONSTRAINT FK_ACTOR FOREIGN KEY (ACTOR_ID) REFERENCES ACTOR(ACTOR_ID)
);


-- 영화 정보 --
INSERT INTO MOVIE(MOVIE_ID, TITLE, RELEASE_YEAR, GENRE, RUNTIME)VALUES (1, '인셉션', '2010', 'SF', 148);
INSERT INTO MOVIE(MOVIE_ID, TITLE, RELEASE_YEAR, GENRE, RUNTIME)VALUES (2, '기생충', '2019', '드라마', 132);
INSERT INTO MOVIE(MOVIE_ID, TITLE, RELEASE_YEAR, GENRE, RUNTIME)VALUES (3, '라라랜드', '2016', '뮤지컬', 128);
INSERT INTO MOVIE(MOVIE_ID, TITLE, RELEASE_YEAR, GENRE, RUNTIME)VALUES (4, '어벤져스: 엔드게임', '2019', '액션', 181);
INSERT INTO MOVIE(MOVIE_ID, TITLE, RELEASE_YEAR, GENRE, RUNTIME)VALUES (5, '조커', '2019', '스릴러', 122);

--관객수,평점 컬럼 추가
ALTER TABLE movie ADD viewers number default 0 not null;
ALTER TABLE movie ADD rating number default 0 not null;

update movie set viewers=6010000,rating=9.48  where title='인셉션';
update movie set viewers=10310000,rating=9.08  where title='기생충';
update movie set viewers=3800000,rating=8.92  where title='라라랜드';
update movie set viewers=13970000,rating=9.50  where title='어벤져스: 엔드게임';
update movie set viewers=610000,rating=6.43  where title='조커';

-- 배우 정보 --
insert into actor(actor_id,name,birth_date,gender) values (1,'레오나르도 디카프리오',TO_DATE('1974-11-11','YYYY-MM-DD'),'남');
insert into actor(actor_id,name,birth_date,gender) values (2,'조셉 고든 레빗',TO_DATE('1981-02-17','YYYY-MM-DD'),'남');
insert into actor(actor_id,name,birth_date,gender) values (3,'톰 하디',TO_DATE('1977-09-15','YYYY-MM-DD'),'남');
insert into actor(actor_id,name,birth_date,gender) values (4,'송강호',TO_DATE('1967-01-17','YYYY-MM-DD'),'남');
insert into actor(actor_id,name,birth_date,gender) values (5,'이선균',TO_DATE('1975-01-01','YYYY-MM-DD'),'남');
insert into actor(actor_id,name,birth_date,gender) values (6,'최우식',TO_DATE('1990-03-26','YYYY-MM-DD'),'남');
insert into actor(actor_id,name,birth_date,gender) values (7,'라이언 고슬링',TO_DATE('1980-11-12','YYYY-MM-DD'),'남');
insert into actor(actor_id,name,birth_date,gender) values (8,'엠마 스톤',TO_DATE('1988-11-6','YYYY-MM-DD'),'여');
insert into actor(actor_id,name,birth_date,gender) values (9,'로버트 다우니 주니어',TO_DATE('1965-04-04','YYYY-MM-DD'),'남');
insert into actor(actor_id,name,birth_date,gender) values (10,'크리스 에반스',TO_DATE('1981-06-13','YYYY-MM-DD'),'남');
insert into actor(actor_id,name,birth_date,gender) values (11,'스칼렛 요한슨',TO_DATE('1981-11-22','YYYY-MM-DD'),'여');
insert into actor(actor_id,name,birth_date,gender) values (12,'호아킨 피닉스',TO_DATE('1974-10-28','YYYY-MM-DD'),'남');
insert into actor(actor_id,name,birth_date,gender) values (13,'재지 비츠',TO_DATE('1991-06-01','YYYY-MM-DD'),'여');

-- 감독 정보 --
insert into director(director_id,name,birth_date,gender) values (1,'크리스토퍼 놀란',TO_DATE('1970-07-30','YYYY-MM-DD'),'남');
insert into director(director_id,name,birth_date,gender) values (2,'봉준호',TO_DATE('1969-09-14','YYYY-MM-DD'),'남');
insert into director(director_id,name,birth_date,gender) values (3,'데이미언 셔젤',TO_DATE('1985-01-19','YYYY-MM-DD'),'남');
insert into director(director_id,name,birth_date,gender) values (4,'앤서니 루소',TO_DATE('1970-02-03','YYYY-MM-DD'),'남');
insert into director(director_id,name,birth_date,gender) values (5,'조 루소',TO_DATE('1971-07-18','YYYY-MM-DD'),'남');
insert into director(director_id,name,birth_date,gender) values (6,'토드 필립스',TO_DATE('1970-12-20','YYYY-MM-DD'),'남');

-- 고객 정보 --
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (1,'eorm1111',1,10,'이런게 영화구나...',TO_DATE('2020-01-29','YYYY-MM-DD'));
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (2,'anat2222',1,9,'10년 전 내 인생은 인셉션을 보기 전과 후로 나뉘었다.',TO_DATE('2020-01-31','YYYY-MM-DD'));
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (3,'clai3333',1,10,'인생 영화입니다.4번을 봐도 볼때마다 감탄하게 될 수 밖에 없는 영화!!
                                                                                                                                       재개봉했을때 꼭 영화관에 가서 봐야하는 영화입니다!',TO_DATE('2020-05-06','YYYY-MM-DD'));
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (4,'mkor4444',2,10,'인터폰에 이정은이 등장한 순간부터 장르가 바뀐다',TO_DATE('2019-05-30','YYYY-MM-DD'));
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (5,'cank5555',2,8,'나 또한 누군가의 사람 사는 냄새에 얼굴 찌푸리진 않았었나..',TO_DATE('2019-05-30','YYYY-MM-DD'));
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (6,'gksk6666',2,2,'보고나서 기뷴이 안좋다 꼭 가난을 그렇게. 표현해야 했을까',TO_DATE('2019-06-06','YYYY-MM-DD'));
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (7,'dhff7777',3,10,'연인들을 위한 영화가 아니다. 여성관객들을 위한 영화도 아니다. 
                                                                                                                                        이 영화는 꿈꾸는 모든 이들을 위한 영화. 인생을 논하는 영화.',TO_DATE('2016-12-10','YYYY-MM-DD'));
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (8,'muu08888',3,8,'꿈꾸고 싶어지는 영화 라라랜드',TO_DATE('2016-12-07','YYYY-MM-DD'));
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (9,'kisc9999',3,10,'배경이 너무 아름답고 음악이 너무좋고 재미있습니다',TO_DATE('2016-12-07','YYYY-MM-DD'));
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (10,'ghkj1010',4,10,'I''m Iron Man.',TO_DATE('2019-04-24','YYYY-MM-DD'));
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (11,'xax12929',4,10,'영화 시작하지마자 인생 최대의 급똥이 찾아왔지만 화장실을 가지 않아도 됐다.',TO_DATE('2019-04-24','YYYY-MM-DD'));
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (12,'csw23838',4,10,'아이언맨의 심장이 따뜻했다는 증거..',TO_DATE('2019-04-24','YYYY-MM-DD'));
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (13,'yood4848',5,10,'후반부 완전한 조커가 된 계단씬은내 영화인생 단연 베스트.모순적이게 아름다웠다',TO_DATE('2019-10-02','YYYY-MM-DD'));
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (14,'234d5757',5,10,'그가 웃을때 우리는 울상',TO_DATE('2019-10-02','YYYY-MM-DD'));
insert into reviewer(user_id,name,movie_id,rating,review_text,review_date) values (15,'twos0000',5,8,'응원은 할 수 없지만 이해는 하게 되는... 이 무서운 현실...',TO_DATE('2019-10-13','YYYY-MM-DD'));

-- 영화 & 배우 정보 --
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (1, 1, 1, '도미닉 코브');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (1, 1, 2, '아서');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (1, 1, 1, '임스');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (2, 2, 4, '김기택');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (2, 2, 5, '박동익');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (2, 2, 6, '김기우');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (3, 3, 7, '세바스찬 와일더');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (3, 3, 8, '미아 돌란');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (4, 4, 9, '아이언맨 / 토니 스타크');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (4, 4, 10, '캡틴 아메리카 / 스티브 로저스');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (4, 4, 11, '블랙 위도우 / 나타샤 로마노프');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (4, 5, 9, '아이언맨 / 토니 스타크');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (4, 5, 10, '캡틴 아메리카 / 스티브 로저스');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (4, 5, 11, '블랙 위도우 / 나타샤 로마노프');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (5, 6, 12, '아서 플렉 / 조커');
INSERT INTO CASTING(MOVIE_ID, DIRECTOR_ID, ACTOR_ID, ROLE_NAME) VALUES (5, 6, 13, '소피 두몬드');



-- 테이블 조회 --
select * from movie;
select * from actor;
select * from director;
select * from reviewer;
select * from casting;

--영화상세보기 기능 --
select 
    m.title "영화 제목",
    m.release_year || '년' "개봉 년도", 
    m.runtime || '분' "상영 시간",
    d.name "감독",
    a.name"배우",
    c.role_name "배역"
from casting c
join movie m
on c.movie_id=m.movie_id
join actor a
on c.actor_id=a.actor_id
join director d
on d.director_id=c.director_id;

-- 영화 순위 조회 기능 --
select
    rank() over (order by viewers desc) || '위' "영화 순위",
    title as "영화 제목",
    to_char(viewers, '999,999,999') || '명' "누적 관객 수",
    rating || '점' "영화 평점"
from
    movie
order by
    viewers desc;

--리뷰 조회 기능--
select 
    m.title 영화,
    r.name 작성자,
    to_char(r.review_date,'YYYY-MM-DD') 작성날짜,
    r.rating || '점' 평점,
    r.review_text 관람평
from reviewer r
join movie m
on r.movie_id=m.movie_id;