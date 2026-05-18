$ErrorActionPreference = "Stop"

$TargetDir = "C:\Users\qhdud\OneDrive\바탕 화면\WebPrject\파일모음"
$EdgePath = "C:\Program Files (x86)\Microsoft\Edge\Application\msedge.exe"

if (-not (Test-Path -LiteralPath $TargetDir)) {
    New-Item -ItemType Directory -Path $TargetDir | Out-Null
}

if (-not (Test-Path -LiteralPath $EdgePath)) {
    throw "Microsoft Edge 실행 파일을 찾을 수 없습니다: $EdgePath"
}

$style = @"
<style>
  @page { size: A4; margin: 18mm; }
  * { box-sizing: border-box; }
  body {
    margin: 0;
    font-family: 'Malgun Gothic', '맑은 고딕', Arial, sans-serif;
    color: #202124;
    line-height: 1.55;
    font-size: 13px;
  }
  h1 {
    margin: 0 0 18px;
    padding-bottom: 10px;
    border-bottom: 3px solid #2563eb;
    font-size: 26px;
    color: #1f2937;
  }
  h2 {
    margin: 24px 0 10px;
    font-size: 18px;
    color: #1d4ed8;
  }
  h3 {
    margin: 16px 0 8px;
    font-size: 15px;
    color: #374151;
  }
  p { margin: 6px 0; }
  ul { margin: 8px 0 12px 22px; padding: 0; }
  li { margin: 4px 0; }
  table {
    width: 100%;
    border-collapse: collapse;
    margin: 10px 0 18px;
    page-break-inside: avoid;
  }
  th, td {
    border: 1px solid #d1d5db;
    padding: 8px 9px;
    vertical-align: top;
  }
  th {
    background: #eff6ff;
    color: #1e3a8a;
    font-weight: 700;
  }
  .meta {
    margin-bottom: 18px;
    padding: 12px;
    background: #f8fafc;
    border: 1px solid #e5e7eb;
  }
  .box {
    margin: 10px 0 16px;
    padding: 12px;
    border: 1px solid #dbeafe;
    background: #f8fbff;
  }
  .code {
    white-space: pre-wrap;
    font-family: Consolas, 'Courier New', monospace;
    background: #111827;
    color: #f9fafb;
    padding: 12px;
    border-radius: 4px;
    font-size: 12px;
  }
</style>
"@

function New-DocumentHtml {
    param(
        [string]$Title,
        [string]$Body
    )

    return @"
<!doctype html>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>$Title</title>
$style
</head>
<body>
$Body
</body>
</html>
"@
}

$documents = @(
    @{
        File = "01_캠퍼스플래너_기획서"
        Title = "캠퍼스 플래너 기획서"
        Body = @"
<h1>캠퍼스 플래너 기획서</h1>
<div class="meta">
  <p><b>프로젝트명:</b> 캠퍼스 플래너</p>
  <p><b>개발 기간:</b> 2주</p>
  <p><b>개발 인원:</b> 5명</p>
  <p><b>사용 기술:</b> JSP, Servlet, HTML, CSS, JavaScript, MySQL</p>
</div>

<h2>1. 프로젝트 개요</h2>
<p>캠퍼스 플래너는 학생들이 과목별 과제, 시험, 할 일을 한 곳에서 관리할 수 있도록 돕는 웹 기반 일정 관리 서비스이다. 사용자는 과목을 등록하고, 과제와 시험 일정을 추가하며, 마감일과 D-Day를 확인할 수 있다.</p>

<h2>2. 기획 의도</h2>
<ul>
  <li>여러 과목의 과제와 시험 일정을 한 화면에서 확인할 수 있도록 한다.</li>
  <li>마감일이 가까운 일정을 우선적으로 보여주어 일정 누락을 줄인다.</li>
  <li>완료 체크와 진행률을 통해 학습 상태를 쉽게 파악할 수 있도록 한다.</li>
</ul>

<h2>3. 주요 사용자</h2>
<ul>
  <li>대학생 및 학원 수강생</li>
  <li>과제, 시험, 개인 할 일을 함께 관리해야 하는 학생</li>
  <li>마감 일정과 완료 여부를 체계적으로 관리하고 싶은 사용자</li>
</ul>

<h2>4. 핵심 기능</h2>
<table>
  <tr><th>구분</th><th>기능</th><th>설명</th></tr>
  <tr><td>회원</td><td>회원가입, 로그인, 로그아웃</td><td>사용자 계정을 생성하고 세션 기반으로 로그인 상태를 유지한다.</td></tr>
  <tr><td>과목</td><td>과목 등록, 수정, 삭제</td><td>사용자가 수강 중인 과목을 관리한다.</td></tr>
  <tr><td>일정</td><td>과제, 시험, 할 일 등록</td><td>과목과 연결된 일정을 등록하고 관리한다.</td></tr>
  <tr><td>대시보드</td><td>오늘 할 일, 마감 임박, D-Day</td><td>중요한 일정을 한눈에 볼 수 있도록 표시한다.</td></tr>
  <tr><td>상태 관리</td><td>완료 체크, 진행률</td><td>일정 완료 여부를 저장하고 전체 완료율을 계산한다.</td></tr>
</table>

<h2>5. 기대 효과</h2>
<ul>
  <li>학생의 과제 및 시험 일정 누락을 줄일 수 있다.</li>
  <li>과목별 일정 관리가 가능하여 학업 계획을 세우기 쉽다.</li>
  <li>마감 임박 일정과 D-Day 표시로 우선순위를 빠르게 판단할 수 있다.</li>
</ul>

<h2>6. 팀원 역할 예시</h2>
<table>
  <tr><th>담당</th><th>역할</th></tr>
  <tr><td>팀원 1</td><td>회원가입, 로그인, 세션 처리</td></tr>
  <tr><td>팀원 2</td><td>과목 등록, 과목 목록, 과목 수정/삭제</td></tr>
  <tr><td>팀원 3</td><td>과제/시험/할 일 CRUD</td></tr>
  <tr><td>팀원 4</td><td>대시보드, D-Day, 마감 임박 일정, 완료율</td></tr>
  <tr><td>팀원 5</td><td>마이페이지, CSS, 화면 정리, 발표자료</td></tr>
</table>
"@
    },
    @{
        File = "02_캠퍼스플래너_화면설계서"
        Title = "캠퍼스 플래너 화면설계서"
        Body = @"
<h1>캠퍼스 플래너 화면설계서</h1>
<div class="meta">
  <p><b>목적:</b> 캠퍼스 플래너의 주요 화면 구성과 화면별 기능을 정의한다.</p>
  <p><b>주요 화면:</b> 로그인, 회원가입, 대시보드, 과목 관리, 일정 관리, 마이페이지</p>
</div>

<h2>1. 전체 화면 흐름</h2>
<div class="box">
로그인/회원가입 → 메인 대시보드 → 과목 관리 / 일정 등록 / 일정 목록 / 마이페이지
</div>

<h2>2. 화면 목록</h2>
<table>
  <tr><th>화면명</th><th>주요 구성 요소</th><th>기능 설명</th></tr>
  <tr><td>로그인 화면</td><td>아이디, 비밀번호, 로그인 버튼, 회원가입 이동</td><td>사용자 인증 후 대시보드로 이동한다.</td></tr>
  <tr><td>회원가입 화면</td><td>아이디, 비밀번호, 이름, 이메일</td><td>신규 사용자를 등록한다.</td></tr>
  <tr><td>메인 대시보드</td><td>오늘 할 일, 마감 임박, 시험 D-Day, 완료율</td><td>사용자의 핵심 일정을 요약해서 보여준다.</td></tr>
  <tr><td>과목 관리 화면</td><td>과목 목록, 과목 등록 폼, 수정/삭제 버튼</td><td>수강 과목을 등록하고 관리한다.</td></tr>
  <tr><td>일정 등록 화면</td><td>제목, 과목, 유형, 마감일, 우선순위, 내용</td><td>과제, 시험, 할 일을 등록한다.</td></tr>
  <tr><td>일정 목록 화면</td><td>검색, 필터, 일정 리스트, 완료 체크</td><td>등록된 일정을 조건별로 조회한다.</td></tr>
  <tr><td>일정 상세/수정 화면</td><td>일정 상세 정보, 수정, 삭제, 완료 처리</td><td>일정 내용을 확인하고 수정 또는 삭제한다.</td></tr>
  <tr><td>마이페이지</td><td>회원 정보, 내 일정 통계, 로그아웃</td><td>사용자 정보와 전체 활동 상태를 보여준다.</td></tr>
</table>

<h2>3. 대시보드 구성</h2>
<ul>
  <li>상단: 서비스명, 사용자 이름, 로그아웃 버튼</li>
  <li>요약 영역: 전체 일정 수, 완료 일정 수, 완료율</li>
  <li>오늘 할 일: 오늘 마감인 일정 목록</li>
  <li>마감 임박: 3일 이내 마감 일정 목록</li>
  <li>다가오는 시험: 시험 유형 일정 중 가까운 순서로 표시</li>
</ul>

<h2>4. 일정 목록 필터</h2>
<table>
  <tr><th>필터</th><th>설명</th></tr>
  <tr><td>전체</td><td>모든 일정을 조회한다.</td></tr>
  <tr><td>과제</td><td>task_type이 ASSIGNMENT인 일정만 조회한다.</td></tr>
  <tr><td>시험</td><td>task_type이 EXAM인 일정만 조회한다.</td></tr>
  <tr><td>할 일</td><td>task_type이 TODO인 일정만 조회한다.</td></tr>
  <tr><td>미완료</td><td>status가 WAITING인 일정만 조회한다.</td></tr>
  <tr><td>완료</td><td>status가 DONE인 일정만 조회한다.</td></tr>
</table>

<h2>5. 주요 버튼 동작</h2>
<table>
  <tr><th>버튼</th><th>동작</th></tr>
  <tr><td>로그인</td><td>아이디와 비밀번호 검증 후 세션 생성</td></tr>
  <tr><td>과목 등록</td><td>입력한 과목 정보를 subjects 테이블에 저장</td></tr>
  <tr><td>일정 등록</td><td>입력한 일정 정보를 tasks 테이블에 저장</td></tr>
  <tr><td>완료 체크</td><td>일정 상태를 DONE 또는 WAITING으로 변경</td></tr>
  <tr><td>삭제</td><td>선택한 과목 또는 일정을 삭제</td></tr>
</table>
"@
    },
    @{
        File = "03_캠퍼스플래너_ERD"
        Title = "캠퍼스 플래너 ERD"
        Body = @"
<h1>캠퍼스 플래너 ERD</h1>
<div class="meta">
  <p><b>DBMS:</b> MySQL</p>
  <p><b>설계 기준:</b> 2주 JSP 팀프로젝트에 맞춘 단순하고 구현 가능한 구조</p>
</div>

<h2>1. 테이블 관계</h2>
<div class="code">users 1 : N subjects
users 1 : N tasks
subjects 1 : N tasks</div>

<h2>2. users 테이블</h2>
<table>
  <tr><th>컬럼명</th><th>타입</th><th>키</th><th>설명</th></tr>
  <tr><td>user_id</td><td>INT AUTO_INCREMENT</td><td>PK</td><td>회원 번호</td></tr>
  <tr><td>login_id</td><td>VARCHAR(50)</td><td>UNIQUE</td><td>로그인 아이디</td></tr>
  <tr><td>password</td><td>VARCHAR(255)</td><td></td><td>비밀번호</td></tr>
  <tr><td>name</td><td>VARCHAR(50)</td><td></td><td>회원 이름</td></tr>
  <tr><td>email</td><td>VARCHAR(100)</td><td></td><td>이메일</td></tr>
  <tr><td>created_at</td><td>DATETIME</td><td></td><td>가입일</td></tr>
</table>

<h2>3. subjects 테이블</h2>
<table>
  <tr><th>컬럼명</th><th>타입</th><th>키</th><th>설명</th></tr>
  <tr><td>subject_id</td><td>INT AUTO_INCREMENT</td><td>PK</td><td>과목 번호</td></tr>
  <tr><td>user_id</td><td>INT</td><td>FK</td><td>회원 번호</td></tr>
  <tr><td>subject_name</td><td>VARCHAR(100)</td><td></td><td>과목명</td></tr>
  <tr><td>professor</td><td>VARCHAR(50)</td><td></td><td>교수명 또는 강사명</td></tr>
  <tr><td>color</td><td>VARCHAR(20)</td><td></td><td>과목 표시 색상</td></tr>
  <tr><td>created_at</td><td>DATETIME</td><td></td><td>등록일</td></tr>
</table>

<h2>4. tasks 테이블</h2>
<table>
  <tr><th>컬럼명</th><th>타입</th><th>키</th><th>설명</th></tr>
  <tr><td>task_id</td><td>INT AUTO_INCREMENT</td><td>PK</td><td>일정 번호</td></tr>
  <tr><td>user_id</td><td>INT</td><td>FK</td><td>회원 번호</td></tr>
  <tr><td>subject_id</td><td>INT</td><td>FK</td><td>과목 번호</td></tr>
  <tr><td>title</td><td>VARCHAR(150)</td><td></td><td>일정 제목</td></tr>
  <tr><td>content</td><td>TEXT</td><td></td><td>일정 내용</td></tr>
  <tr><td>task_type</td><td>VARCHAR(20)</td><td></td><td>ASSIGNMENT, EXAM, TODO</td></tr>
  <tr><td>due_date</td><td>DATE</td><td></td><td>마감일 또는 시험일</td></tr>
  <tr><td>priority</td><td>VARCHAR(20)</td><td></td><td>HIGH, NORMAL, LOW</td></tr>
  <tr><td>status</td><td>VARCHAR(20)</td><td></td><td>WAITING, DONE</td></tr>
  <tr><td>created_at</td><td>DATETIME</td><td></td><td>등록일</td></tr>
  <tr><td>updated_at</td><td>DATETIME</td><td></td><td>수정일</td></tr>
</table>

<h2>5. SQL 예시</h2>
<div class="code">CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    login_id VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE subjects (
    subject_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    subject_name VARCHAR(100) NOT NULL,
    professor VARCHAR(50),
    color VARCHAR(20),
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE tasks (
    task_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    subject_id INT,
    title VARCHAR(150) NOT NULL,
    content TEXT,
    task_type VARCHAR(20) NOT NULL,
    due_date DATE NOT NULL,
    priority VARCHAR(20) DEFAULT 'NORMAL',
    status VARCHAR(20) DEFAULT 'WAITING',
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME,
    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (subject_id) REFERENCES subjects(subject_id)
);</div>
"@
    },
    @{
        File = "04_캠퍼스플래너_개발명세서_MVC_REST_API"
        Title = "캠퍼스 플래너 개발명세서"
        Body = @"
<h1>캠퍼스 플래너 개발명세서</h1>
<div class="meta">
  <p><b>아키텍처:</b> MVC 패턴</p>
  <p><b>API 설계:</b> REST 방식 URL 규칙 적용</p>
  <p><b>사용 기술:</b> Java, JSP, Servlet, JDBC, MySQL, HTML, CSS, JavaScript</p>
</div>

<h2>1. MVC 구조</h2>
<table>
  <tr><th>계층</th><th>구성</th><th>역할</th></tr>
  <tr><td>Model</td><td>DTO, DAO</td><td>데이터 객체와 DB 접근 로직을 담당한다.</td></tr>
  <tr><td>View</td><td>JSP</td><td>사용자 화면을 출력하고 입력 폼을 제공한다.</td></tr>
  <tr><td>Controller</td><td>Servlet</td><td>요청을 받아 Model을 호출하고 결과 View로 이동한다.</td></tr>
</table>

<h2>2. 패키지 구조 예시</h2>
<div class="code">com.campusplanner.controller
  - UserController
  - SubjectController
  - TaskController

com.campusplanner.model.dto
  - UserDTO
  - SubjectDTO
  - TaskDTO

com.campusplanner.model.dao
  - UserDAO
  - SubjectDAO
  - TaskDAO

com.campusplanner.util
  - DBUtil
  - DateUtil

/WEB-INF/views
  - login.jsp
  - join.jsp
  - dashboard.jsp
  - subjectList.jsp
  - taskForm.jsp
  - taskList.jsp
  - taskDetail.jsp
  - mypage.jsp</div>

<h2>3. Controller 역할</h2>
<table>
  <tr><th>Controller</th><th>담당 기능</th></tr>
  <tr><td>UserController</td><td>회원가입, 로그인, 로그아웃, 마이페이지</td></tr>
  <tr><td>SubjectController</td><td>과목 목록, 등록, 수정, 삭제</td></tr>
  <tr><td>TaskController</td><td>일정 목록, 등록, 상세, 수정, 삭제, 완료 상태 변경</td></tr>
</table>

<h2>4. REST API 명세</h2>
<h3>회원 API</h3>
<table>
  <tr><th>Method</th><th>URL</th><th>기능</th><th>요청 데이터</th></tr>
  <tr><td>POST</td><td>/users/join</td><td>회원가입</td><td>loginId, password, name, email</td></tr>
  <tr><td>POST</td><td>/users/login</td><td>로그인</td><td>loginId, password</td></tr>
  <tr><td>GET</td><td>/users/logout</td><td>로그아웃</td><td>-</td></tr>
  <tr><td>GET</td><td>/users/mypage</td><td>마이페이지 조회</td><td>-</td></tr>
</table>

<h3>과목 API</h3>
<table>
  <tr><th>Method</th><th>URL</th><th>기능</th><th>요청 데이터</th></tr>
  <tr><td>GET</td><td>/subjects</td><td>과목 목록 조회</td><td>-</td></tr>
  <tr><td>POST</td><td>/subjects</td><td>과목 등록</td><td>subjectName, professor, color</td></tr>
  <tr><td>PUT</td><td>/subjects/{subjectId}</td><td>과목 수정</td><td>subjectName, professor, color</td></tr>
  <tr><td>DELETE</td><td>/subjects/{subjectId}</td><td>과목 삭제</td><td>-</td></tr>
</table>

<h3>일정 API</h3>
<table>
  <tr><th>Method</th><th>URL</th><th>기능</th><th>요청 데이터</th></tr>
  <tr><td>GET</td><td>/tasks</td><td>일정 목록 조회</td><td>type, status, keyword</td></tr>
  <tr><td>GET</td><td>/tasks/{taskId}</td><td>일정 상세 조회</td><td>-</td></tr>
  <tr><td>POST</td><td>/tasks</td><td>일정 등록</td><td>subjectId, title, content, taskType, dueDate, priority</td></tr>
  <tr><td>PUT</td><td>/tasks/{taskId}</td><td>일정 수정</td><td>title, content, taskType, dueDate, priority</td></tr>
  <tr><td>DELETE</td><td>/tasks/{taskId}</td><td>일정 삭제</td><td>-</td></tr>
  <tr><td>PUT</td><td>/tasks/{taskId}/status</td><td>완료 상태 변경</td><td>status</td></tr>
</table>

<h2>5. 요청/응답 예시</h2>
<h3>일정 등록 요청</h3>
<div class="code">POST /tasks
{
  "subjectId": 1,
  "title": "JSP 프로젝트 기획서 제출",
  "content": "기획서, 화면설계서, ERD 제출",
  "taskType": "ASSIGNMENT",
  "dueDate": "2026-05-10",
  "priority": "HIGH"
}</div>

<h3>일정 목록 응답</h3>
<div class="code">{
  "taskId": 3,
  "subjectName": "웹 프로그래밍",
  "title": "JSP 프로젝트 기획서 제출",
  "taskType": "ASSIGNMENT",
  "dueDate": "2026-05-10",
  "dDay": 12,
  "status": "WAITING"
}</div>

<h2>6. 개발 시 주의사항</h2>
<ul>
  <li>로그인이 필요한 페이지는 세션 검사를 먼저 수행한다.</li>
  <li>다른 사용자의 과목과 일정은 조회하거나 수정할 수 없도록 user_id를 조건에 포함한다.</li>
  <li>일정 삭제 시 실제 삭제 방식으로 구현하되, 시간이 남으면 상태값을 이용한 논리 삭제로 확장할 수 있다.</li>
  <li>D-Day는 due_date와 현재 날짜의 차이로 계산한다.</li>
</ul>
"@
    }
)

foreach ($doc in $documents) {
    $htmlPath = Join-Path $TargetDir ($doc.File + ".html")
    $pdfPath = Join-Path $TargetDir ($doc.File + ".pdf")
    $html = New-DocumentHtml -Title $doc.Title -Body $doc.Body

    Set-Content -LiteralPath $htmlPath -Value $html -Encoding UTF8

    if (Test-Path -LiteralPath $pdfPath) {
        Remove-Item -LiteralPath $pdfPath -Force
    }

    $args = @(
        "--headless",
        "--disable-gpu",
        "--no-first-run",
        "--no-sandbox",
        "--user-data-dir=$env:TEMP\campus-planner-pdf-profile",
        "--print-to-pdf=""$pdfPath""",
        """$htmlPath"""
    )

    $process = Start-Process -FilePath $EdgePath -ArgumentList $args -Wait -PassThru -WindowStyle Hidden
    if ($process.ExitCode -ne 0 -or -not (Test-Path -LiteralPath $pdfPath)) {
        throw "PDF 생성 실패: $pdfPath"
    }
}

Get-ChildItem -LiteralPath $TargetDir -Filter "*캠퍼스플래너*.pdf" |
    Select-Object Name, Length, LastWriteTime
