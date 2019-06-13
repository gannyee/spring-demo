package com.gannyee.spring.aop.example;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-13
 **/
public class ThrowsAdvisor implements ThrowsAdvice {

    public void afterThrowing(Exception ex) {
        System.out.println("additional concern if exception occurs");
    }
}
