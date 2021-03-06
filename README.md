# SpringBoot + Thymeleaf + MySQL 게시판 구현

- [개발 환경 세팅](https://github.com/akakss225/SpringBootMVC1/blob/main/README.md#1-%EA%B0%9C%EB%B0%9C-%ED%99%98%EA%B2%BD-%EC%84%B8%ED%8C%85)
- [프로젝트 생성](https://github.com/akakss225/SpringBootMVC1/blob/main/README.md#2-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EC%83%9D%EC%84%B1)
- [게시물 작성](https://github.com/akakss225/SpringBootMVC1#3-%EA%B2%8C%EC%8B%9C%EB%AC%BC-%EC%9E%91%EC%84%B1)
- [게시물 리스팅](https://github.com/akakss225/SpringBootMVC1#4-%EA%B2%8C%EC%8B%9C%EB%AC%BC-%EB%A6%AC%EC%8A%A4%ED%8C%85)
- [게시물 상세페이지](https://github.com/akakss225/SpringBootMVC1#5-%EA%B2%8C%EC%8B%9C%EB%AC%BC-%EC%83%81%EC%84%B8%ED%8E%98%EC%9D%B4%EC%A7%80)
- [게시물 삭제](https://github.com/akakss225/SpringBootMVC1#6-%EA%B2%8C%EC%8B%9C%EB%AC%BC-%EC%82%AD%EC%A0%9C)
- [게시물 수정](https://github.com/akakss225/SpringBootMVC1#7-%EA%B2%8C%EC%8B%9C%EB%AC%BC-%EC%82%AD%EC%A0%9C)
- [게시물 리스트 페이징](https://github.com/akakss225/SpringBootMVC1#7-%EA%B2%8C%EC%8B%9C%ED%8C%90-%ED%8E%98%EC%9D%B4%EC%A7%95-%EC%B2%98%EB%A6%AC)
- [마무리 리뷰](https://github.com/akakss225/SpringBootMVC1#%EB%81%9D%EC%9C%BC%EB%A1%9C)

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

## 4. 게시물 리스팅

리스팅을 위한 샘플 데이터를 DB에 저장해준다.

<img width="1440" alt="스크린샷 2022-04-23 15 16 46" src="https://user-images.githubusercontent.com/78843098/164882605-ee88046b-0160-4023-9bdc-6ce83cc1de98.png">

BoardService에서 Repository로부터 상속받은 findAll() 메소드를 활용해 List<Board> 형태로 데이터를 꺼낸다.

<img width="1440" alt="스크린샷 2022-04-23 15 29 10" src="https://user-images.githubusercontent.com/78843098/164882968-b9f07767-3e5f-4a99-a42f-21f52e3f2c56.png">

이후 Controller에서 Service 를 통해 DB로부터 받아온 데이터를 뷰 템플릿에 넘겨주는 API를 작성한다.
이때 Model 데이터를 활용해 뷰 템플릿으로 데이터를 보낼 수 있다.

<img width="1440" alt="스크린샷 2022-04-23 15 29 25" src="https://user-images.githubusercontent.com/78843098/164882974-a72ebeca-f98d-4b59-ac24-c51617fe40f3.png">

뷰 템플릿은 Thymeleaf를 활용한다.

<img width="1440" alt="스크린샷 2022-04-23 15 28 10" src="https://user-images.githubusercontent.com/78843098/164882941-a994165d-b7e4-4c94-beee-b9853bfea5ba.png">

결과 확인

<img width="1440" alt="스크린샷 2022-04-23 15 32 17" src="https://user-images.githubusercontent.com/78843098/164883079-f3e1b2e6-d4dc-4b76-bd93-775d67fd41e2.png">

## 5. 게시물 상세페이지

BoardService 에서 key값인 id 정보를 이용한 Board 데이터를 호출하는 비즈니스로직을 작성한다.

<img width="1440" alt="스크린샷 2022-04-23 16 12 11" src="https://user-images.githubusercontent.com/78843098/164884396-f02de78f-ee5d-4c45-ba36-bf017bc75ae5.png">

이후 Controller에서 마찬가지로 뷰 템플릿으로 데이터를 던져준다.

<img width="1440" alt="스크린샷 2022-04-23 16 12 16" src="https://user-images.githubusercontent.com/78843098/164884441-0968538d-e01e-4f12-adc0-11b050173063.png">

이번 페이지의 경우, 내용만을 다룰것이기 때문에 뷰 템플릿은 최소화하여 작성한다.

<img width="1440" alt="스크린샷 2022-04-23 16 12 02" src="https://user-images.githubusercontent.com/78843098/164884381-3692d713-52fb-44f7-b509-667d70064e12.png">

결과 확인

<img width="1440" alt="스크린샷 2022-04-23 16 15 36" src="https://user-images.githubusercontent.com/78843098/164884462-53d1b02a-74e3-4581-9bf0-992e0df27107.png">

추가적으로 List 페이지에서 Title을 클릭하면, 상세페이지로 가게끔 페이지를 리펙토링 해준다.
Thymeleaf 문법을 사용한다.

<img width="1440" alt="스크린샷 2022-04-23 16 21 21" src="https://user-images.githubusercontent.com/78843098/164884668-4b821232-5432-4ba7-b64e-f16ea9cb95fe.png">

결과 확인

<img width="1440" alt="스크린샷 2022-04-23 16 21 54" src="https://user-images.githubusercontent.com/78843098/164884699-74abf2e1-6719-496c-9ebe-9fcf5bc15d35.png">

<img width="1440" alt="스크린샷 2022-04-23 16 21 57" src="https://user-images.githubusercontent.com/78843098/164884701-29472cd1-1d62-47e2-9ddc-8d99104ada64.png">


## 6. 게시물 삭제

BoardService 에 비즈니스 로직 작성

<img width="1440" alt="스크린샷 2022-04-27 15 20 35" src="https://user-images.githubusercontent.com/78843098/165454004-010c066f-adb4-45ac-9714-d930a8f51072.png">

BoardController 에 API 작성

<img width="1440" alt="스크린샷 2022-04-27 15 27 37" src="https://user-images.githubusercontent.com/78843098/165454983-983a940f-12d5-4562-bf01-84107845dadc.png">

마지막으로 게시물 상세페이지에 삭제 버튼을 만들어주고, rink를 걸어준다.

<img width="1440" alt="스크린샷 2022-04-27 15 23 37" src="https://user-images.githubusercontent.com/78843098/165454419-0d3e312e-408f-40b7-b313-a0e51b7a782d.png">

결과 확인 >> 맨 위 게시글 지우기

<img width="1440" alt="스크린샷 2022-04-27 15 28 23" src="https://user-images.githubusercontent.com/78843098/165455094-0e653916-5427-48cb-ba49-16f17ca9e8e4.png">

<img width="1440" alt="스크린샷 2022-04-27 15 28 53" src="https://user-images.githubusercontent.com/78843098/165455163-12f54179-03dc-4567-b475-0739fc456989.png">

<img width="1440" alt="스크린샷 2022-04-27 15 29 43" src="https://user-images.githubusercontent.com/78843098/165455284-950cb4ae-e9c5-48cf-b628-343ea1e3fa80.png">


## 7. 게시물 수정

게시물 삭제의 경우, 별도의 비즈니스로직(Service) 가 필요없다.
기존에 작성되어있던 게시물 작성을 적극 활용한다.

우선 게시물 상세 페이지에 수정 버튼을 추가해준다. 이번엔 @PathVariable 을 사용해서 작성한다.

<img width="1440" alt="스크린샷 2022-04-27 15 49 49" src="https://user-images.githubusercontent.com/78843098/165458400-14cd306a-c2b8-4cce-979c-4240538deb61.png">

이후 boardmodify 라는 페이지를 만들어준다. 동일하게 게시물 작성 페이지를 활용한다.

<img width="1440" alt="스크린샷 2022-04-27 15 49 04" src="https://user-images.githubusercontent.com/78843098/165458294-7fa59cdc-38f4-4f7f-b268-e217dc773e7d.png">

마지막으로 Controller 에 API를 만들어준다.

<img width="1440" alt="스크린샷 2022-04-27 15 52 18" src="https://user-images.githubusercontent.com/78843098/165458788-3dc210cf-667d-4a21-baa7-b569d1bca3d6.png">

결과 확인

<img width="1440" alt="스크린샷 2022-04-27 15 53 08" src="https://user-images.githubusercontent.com/78843098/165458888-f493ee37-874d-49c1-b0e7-089b2c0f1388.png">

<img width="1440" alt="스크린샷 2022-04-27 15 53 17" src="https://user-images.githubusercontent.com/78843098/165458908-33c2382b-f565-4254-9bac-d26c27d1b5bb.png">

<img width="1440" alt="스크린샷 2022-04-27 15 53 26" src="https://user-images.githubusercontent.com/78843098/165458937-e9a535b3-33da-4939-9df7-18a9cd37ef50.png">

<img width="1440" alt="스크린샷 2022-04-27 15 53 49" src="https://user-images.githubusercontent.com/78843098/165459002-58120122-8e15-42a1-a42f-7203406d5bb2.png">

<img width="1440" alt="스크린샷 2022-04-27 15 54 07" src="https://user-images.githubusercontent.com/78843098/165459042-a77ad1d7-f264-44cb-9d12-0f65aedbd133.png">


## ++ 메세지 호출

종종 게시글 등록 / 수정 / 삭제 시 완료 메세지를 호출한다.

이를 위한 message 페이지를 만듬.

<img width="1440" alt="스크린샷 2022-04-27 16 13 46" src="https://user-images.githubusercontent.com/78843098/165462302-e9c11061-3138-4e13-9f99-b87a8f803e2f.png">

이후, redirect로 바로 list 페이지를 호출했던 writeDo API를 message 페이지로 이동시켜주고, 이동 이후 다시 list 페이지로 이동하게 model 을 통해 값을 넘겨준다.

<img width="1440" alt="스크린샷 2022-04-27 16 13 33" src="https://user-images.githubusercontent.com/78843098/165462267-8ec5c759-3674-45b7-8daa-572a67094781.png">

결과 확인

<img width="1440" alt="스크린샷 2022-04-27 16 18 12" src="https://user-images.githubusercontent.com/78843098/165463076-a8018bea-b4bc-4b41-87ca-e3c3a0af9155.png">

<img width="1440" alt="스크린샷 2022-04-27 16 18 31" src="https://user-images.githubusercontent.com/78843098/165463107-2f2b1df8-512d-4aba-9c5e-880f3be34b04.png">

<img width="1440" alt="스크린샷 2022-04-27 16 18 41" src="https://user-images.githubusercontent.com/78843098/165463136-f28f041c-b0d8-4568-89eb-923646c35a80.png">


## 7. 게시판 페이징 처리

게시글 목록은 기존에 작성한 바에 따르면 아래와 같다.

<img width="1440" alt="스크린샷 2022-04-27 16 59 56" src="https://user-images.githubusercontent.com/78843098/165470841-c01d6fa7-4b27-482d-a9e9-9d7b05a9a728.png">

다만, 대부분의 게시판의 경우 가장 나중에 쓴 게시글이 맨 위에 올라와있다. 또한 모든 게시글 목록을 보여주는 것이 아닌 10개 혹은 20개씩 출력해준다.
이를 구현시켜주는 Pageable 객체와 어노테이션을 사용한다.

<img width="1440" alt="스크린샷 2022-04-27 17 01 20" src="https://user-images.githubusercontent.com/78843098/165470753-ff5eb99d-1598-483b-800f-4ce86d83c230.png">

기존에 Service 에서 return type이 List 였는데, 이를 Page로 바꿔준다. 또한 파라미터로 Pageable pageable 을 넘겨준다. >> JPA 기능

<img width="1440" alt="스크린샷 2022-04-27 17 01 41" src="https://user-images.githubusercontent.com/78843098/165470815-d8a7e7d5-9b29-4a82-a4f3-b9557962e5da.png">

결과 확인

<img width="1440" alt="스크린샷 2022-04-27 17 00 08" src="https://user-images.githubusercontent.com/78843098/165470847-6bfc1635-309f-46e9-964f-ad459e49b152.png">

추가적으로 url 에 파라미터를 추가하는 방법으로 설정을 해줄수도 있다.

<img width="1440" alt="스크린샷 2022-04-27 17 05 48" src="https://user-images.githubusercontent.com/78843098/165471532-b981168b-48b7-4755-a156-bfd68ea3734f.png">

<img width="1440" alt="스크린샷 2022-04-27 17 05 56" src="https://user-images.githubusercontent.com/78843098/165471508-f6043cf1-7e7d-4c08-b370-97ec5d385378.png">

### 페이징 처리 2

이후, 나머지 list 목록에 접근할 수 있는 페이지네이션이 필요하다. 따라서 Controller 에 현재 페이지, 첫 페이지, 마지막 페이지 값을 구해준다.
그리고 이 구한 페이지 값들을 boardlist 로 넘겨준다.

<img width="1440" alt="스크린샷 2022-04-27 17 22 54" src="https://user-images.githubusercontent.com/78843098/165474750-eb32c332-4d97-4078-b00f-ef3fb9407ca6.png">

boardlist 페이지에서 간단하게 페이지를 이동시키는 네비게이션을 Thymeleaf 문법을 활용해 만들어준다.

<img width="1440" alt="스크린샷 2022-04-27 17 23 17" src="https://user-images.githubusercontent.com/78843098/165474822-19dae4be-281b-4ca0-bc07-ad6daa5a935f.png">

결과 확인

<img width="1440" alt="스크린샷 2022-04-27 17 23 31" src="https://user-images.githubusercontent.com/78843098/165474884-5d4f2eab-fb62-443f-b156-964b5be45af5.png">

<img width="1440" alt="스크린샷 2022-04-27 17 23 39" src="https://user-images.githubusercontent.com/78843098/165474916-e607bdf6-7d42-4eb8-ba54-43199b703ac4.png">

## 끝으로...

현재까지 SpringBoot + JPA + MySQL 을 활용한 간단한 CRUD 구현을 했습니다.

이후 과정으로는 현재 이 프로젝트 기반 Refactoring 을 진행하며, 실제 게시판과 흡사한 페이지를 만들 것입니다.