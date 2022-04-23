# SpringBoot + Thymeleaf + MySQL 게시판 구현

- [개발 환경 세팅](https://github.com/akakss225/SpringBootMVC1/blob/main/README.md#1-%EA%B0%9C%EB%B0%9C-%ED%99%98%EA%B2%BD-%EC%84%B8%ED%8C%85)
- [프로젝트 생성](https://github.com/akakss225/SpringBootMVC1/blob/main/README.md#2-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EC%83%9D%EC%84%B1)
- 게시물 작성
- 게시물 리스팅
- 게시물 삭제
- 게시물 수정
- 게시물 리스트 페이징

<hr>

## 1. 개발 환경 세팅

IntelliJ + WorkBench + JDK 11 version + MySQL 준비


## 2. 프로젝트 생성

SpringBoot Initializr

<img width="800" alt="스크린샷 2022-04-22 14 39 35" src="https://user-images.githubusercontent.com/78843098/164610538-89881cb4-7396-4eef-afcf-8cd0054cda01.png">

<img width="800" alt="스크린샷 2022-04-22 14 40 00" src="https://user-images.githubusercontent.com/78843098/164610602-a4e37b0b-de53-4466-afaa-dd401657cbe7.png">

DB 생성

<img width="1438" alt="스크린샷 2022-04-22 14 38 56" src="https://user-images.githubusercontent.com/78843098/164610657-d868b5bc-bdc5-47d1-8c7f-9c927f46e7a6.png">

DB 연동

<img width="1440" alt="스크린샷 2022-04-22 14 40 29" src="https://user-images.githubusercontent.com/78843098/164610700-5e716d2f-e301-4bba-9df8-0b4872d01c83.png">

서버 실행

<img width="1440" alt="스크린샷 2022-04-22 14 45 47" src="https://user-images.githubusercontent.com/78843098/164611236-64e58bd0-b708-4ca8-a017-0d6f893ec4c3.png">

### Hello World!

controller

<img width="1440" alt="스크린샷 2022-04-22 14 51 21" src="https://user-images.githubusercontent.com/78843098/164611919-9fb62f9c-2b2e-44b6-b807-21f79b057cc6.png">

page

<img width="1440" alt="스크린샷 2022-04-22 14 51 53" src="https://user-images.githubusercontent.com/78843098/164611938-95330bfc-ec5b-42f9-a83d-e88bed739f14.png">


## 3. 게시물 작성

DB Table 생성

<img width="1440" alt="스크린샷 2022-04-23 14 19 13" src="https://user-images.githubusercontent.com/78843098/164878912-e867460c-9c8f-4ac1-8295-6d1995b3bfe3.png">

게시글 작성 폼 생성

<img width="1440" alt="스크린샷 2022-04-23 14 30 08" src="https://user-images.githubusercontent.com/78843098/164879328-06b55b26-fecb-494b-ac86-fcb19aea2acb.png">

<img width="1440" alt="스크린샷 2022-04-23 14 28 41" src="https://user-images.githubusercontent.com/78843098/164879342-e7f0691d-38bc-4693-8c4a-6b5ba58456f8.png">

간단한 데이터 작성 후 데이터 확인

<img width="1440" alt="스크린샷 2022-04-23 14 34 43" src="https://user-images.githubusercontent.com/78843098/164879368-7882c866-da06-45ed-8e68-fd2f36210154.png">

DB접근을 위한 Entity, Repository 생성

<img width="1440" alt="스크린샷 2022-04-23 14 45 58" src="https://user-images.githubusercontent.com/78843098/164879578-83cc89bf-e037-4bee-b290-e5e422c7a09c.png">

<img width="1440" alt="스크린샷 2022-04-23 14 46 03" src="https://user-images.githubusercontent.com/78843098/164879583-fb1aaa0d-6d28-43d2-b6af-e3df9c3ee6b3.png">

<img width="1440" alt="스크린샷 2022-04-23 14 48 03" src="https://user-images.githubusercontent.com/78843098/164879635-cf4528c7-92fc-4137-a791-f51dd8dab942.png">

JpaRepository<> 를 상속받는 BoardRepository 생성

<img width="1440" alt="스크린샷 2022-04-23 14 55 25" src="https://user-images.githubusercontent.com/78843098/164880993-72996a68-c33b-4c11-aeaa-eda94feca1a9.png">

이후 BoardRepository(JPA를 상속받은)의 기능인 save를 사용하기위해 Service를 만들어 생성자 주입후 함수 정의

<img width="1440" alt="스크린샷 2022-04-23 14 56 34" src="https://user-images.githubusercontent.com/78843098/164881222-d0d54d4e-f341-4ef5-b773-60929a8d87f3.png">

Controller 가 BoardService를 주입받고, 실제 데이터를 저장하는 기능을 구현

<img width="1440" alt="스크린샷 2022-04-23 14 58 01" src="https://user-images.githubusercontent.com/78843098/164881638-348ae6a0-1102-4b7c-8bd5-e2cd470353dc.png">

실제 실행시, DB에 Data가 저장됨을 볼 수 있다.

<img width="1440" alt="스크린샷 2022-04-23 14 59 29" src="https://user-images.githubusercontent.com/78843098/164881838-8c57efc6-7a54-49f0-b274-4bbf323e753b.png">

<img width="1440" alt="스크린샷 2022-04-23 14 59 54" src="https://user-images.githubusercontent.com/78843098/164881890-262d5b39-f848-49a2-8c1c-c74ba446603e.png">





