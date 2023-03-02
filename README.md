# README

## 1. View 생성
- 메인 페이지 mainForm

- user </br>
로그인 페이지 loginForm </br>
회원가입 페이지 joinForm </br>
개인정보 수정 페이지 updateForm </br>
비밀번호 수정 페이지 passwordUpdateForm </br>
비밀번호확인 페이지 passwordCheckForm </br>
이메일체크 페이지 emailCheckForm </br>
회원탈퇴 페이지 leaveCheckForm </br>
프로필 수정 페이지 profileUpdateForm </br>

- post </br>
게시글 작성 페이지 writeForm </br>
게시글 수정 페이지 updateForm </br>
게시글 목록 페이지 listForm </br>
게시글 상세 페이지 detailForm </br>

- layout </br>
게시글 상단 post-header </br>
메인 상단 main-header </br>
메인 하단 footer </br>

- category </br>
카테고리별 게시글 목록 페이지 listForm </br>
카테고리 수정 페이지 updateForm </br>
카테고리 등록 페이지 writeForm </br>

- subscribe </br>
구독 목록 페이지 listForm </br>
</br>
</br>

## 2. 테이블 생성
```sql
create table user(
	user_id INT primary KEY auto_increment,
	user_name VARCHAR(20),
	password VARCHAR(20),
	email VARCHAR(20),
	nick_name VARCHAR(20),
	created_at TIMESTAMP
);
```
</br>
</br>

## 3. 더미데이터
```sql
INSERT INTO user(user_name, PASSWORD, email, nick_name,created_at)
VALUES ('ssar', '1234', 'ssar@nate.com', 'ssar1', NOW());
```