package com.gannyee.autowiring.in.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-13
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/gannyee/autowiring/in/spring/applicationContext.xml");
        A a = context.getBean("a", A.class);
        a.display();
    }
}
