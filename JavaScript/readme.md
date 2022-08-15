## JavaScript 기초
--------------
- <script></script> 태그 안에 자바스크립트 명령어 입력
- <script src=""> </> 로 경로를 통해 자바스크립트를 다른파일에 분리해서 사용가능
- window.onload = function(){} 함수는 웹브라우저의 모든 구성요소에 대한 로드가 끝났을 때 브라우저에 의해서 호출되는 함수
이 함수를 사용하지 않기 위해 head에 script를 정의하는 것 보단 body 끝에 정의하는 것이 더 좋다.

## BOM DOM
-----------------
- 브라우저를 제어하기위해서는 객체가 필요하고, 웹 브라우저가 그 객체를 만들고, 자바스크립트를 통해 제어를한다.

- DOM : document객체는 웹페이지에 있는 문서 태그를 제어하는 역할을 한다. ex) <body>, <img>
- BOM : 웹페이지의 내용을 제외한 브라우저의 각종 요소들을 객체화시킨 것 ex) alert()

## 

- alert() : 알림
- confirm : 확인창
- prompt : 원하는 값을 입력했을 시 true 아니면 false

## location
Location 객체는 문서의 주소와 관련된 객체로 Window 객체의 프로퍼티
브라우저에서 현재 윈도우 위치 알기 : alert(location.href);
location으로 할 수있는 함수 : protocol, host, port, pathname, search, hash
location.reload(); : 새로고침

## jQuery
- JQuery를 사용하기 위해 서는
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
    <script>
    jQuery( document ).ready(function( $ ) {
	
});
    </script> 를 기본적으로 입력해야 함

- jQuery 기본 문법
$('li').css('color', 'red');
$()는 jQuery의 함수이다. 이 함수의 인자로 CSS 선택자(li)를 전달하면 jQuery 객체라는 것을 리턴한다. 
이 객체는 선택자에 해당하는 엘리먼트를 제어하는 다양한 메소드를 가지고 있다.
