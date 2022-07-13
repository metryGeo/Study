# 의존객체 주입
---------
- applicationContext.xml에 있는 빈가져올 준비
GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");

- 빈을 가져옴
클래스 a = ctx.getBean("Bean이름" , 클래스.class);
