package com.gannyee.spring.aop.example;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-13
 **/
public class AfterAdvisor implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("additional concern after returning advice");
    }
}
