# 인프런 자바 스프링 프레임워크(renew ver.) - 신입 프로그래머를 위한 강좌 를 보고 공부한 것입니다.


## 의존객체 주입
- applicationContext.xml에 있는 빈가져올 준비
GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

- 빈을 가져옴
클래스 a = ctx.getBean("Bean이름" , 클래스.class);

---------------
## MVC 패턴
![image](https://user-images.githubusercontent.com/77110648/179233514-2d7e959c-3afb-4d99-baf1-25a49d7264a0.png)

## 스프링MVC프레임워크 설계 구조
![image](https://user-images.githubusercontent.com/77110648/179234063-85ba55a0-26e9-46c0-b82b-d426fcecf6cd.png)


## 리다이렉트가 많을 경우 HandlerInterceptor를 사용할 수 있다
-  HandlerInterceptor 에는 컨트롤러 사용 이전에 preHandle(), 컨트롤러 사용 후인 postHandle()
컨트롤러와 뷰가 모두 작업한 후인 afterCompletion()이 있다. (preHandle이 가장 많이 쓰인다)
