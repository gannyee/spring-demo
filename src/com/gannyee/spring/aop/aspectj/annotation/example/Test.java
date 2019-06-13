package com.gannyee.spring.aop.aspectj.annotation.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-13
 **/
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/gannyee/spring/aop/aspectj/annotation/example/applicationContext.xml");
        Operation operation = (Operation) context.getBean("opBean");
        System.out.println("calling msg");
        operation.msg();
        System.out.println("========================");
        System.out.println("calling m...");
        System.out.println(operation.m());
        System.out.println("========================");
        System.out.println("calling k ...");
        System.out.println(operation.k());

        try {
            operation.validate(19);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("calling validate again...");

        try {
            operation.validate(11);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
