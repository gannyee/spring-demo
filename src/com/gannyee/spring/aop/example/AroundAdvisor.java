package com.gannyee.spring.aop.example;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-13
 **/
public class AroundAdvisor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object obj;
        System.out.println("additional concern before actual logic");
        obj = methodInvocation.proceed();
        System.out.println("additional concern after actual logic");
        return obj;
    }
}
