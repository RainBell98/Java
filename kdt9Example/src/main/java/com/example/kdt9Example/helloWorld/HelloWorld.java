package com.example.kdt9Example.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        //스프링 컨텍스트를 실행하는 단계
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //스프링 프레임워크가 관리하도록 설정
        //스프링에서 관리하는 것은 무엇이든 Bean이 될 수 있다.
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2"));
        System.out.println(context.getBean("myAddress"));
        System.out.println(context.getBean("info"));
        System.out.println(context.getBean(Infomation.class));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("info2"));
        System.out.println(context.getBean(Infomation.class));
    }
}