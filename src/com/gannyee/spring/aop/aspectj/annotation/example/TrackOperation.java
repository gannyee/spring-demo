package com.gannyee.spring.aop.aspectj.annotation.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-13
 **/
@Aspect
public class TrackOperation {

    @Pointcut("execution(* Operation.m*(..))")
    public void poitcutMethod() {//切点名字

    }

    @Pointcut("execution(* Operation.k*(..))")
    public void newPointcut() {
    }

    @Pointcut("execution(* Operation.*(..))")
    public void afterReturningPointcut() {
    }

    @Pointcut("execution(* Operation.*(..))")
    public void aroundPointcut() {

    }

    @Before("poitcutMethod()")
    public void myAdvice(JoinPoint joinPoint) {
        System.out.println("additional concern");
    }

    @After("newPointcut()")
    public void myAfterAdvice(JoinPoint joinPoint) {
        System.out.println("myAfterAdvice");
    }

    @AfterReturning(pointcut = "afterReturningPointcut()", returning = "result")
    public void myAfterReturningAdvice(JoinPoint joinPoint, Object result) {
        System.out.println("joinPoint.getSignature()" + joinPoint.getSignature());
        System.out.println("result" + result);
    }

    @Around("aroundPointcut()")
    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(">>before<<");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println(">>after<<");
        return obj;
    }


    @AfterThrowing(
            pointcut = "execution(* Operation.*(..))",
            throwing= "error")

    public void myadvice(JoinPoint jp,Throwable error)//it is advice
    {
        System.out.println("additional concern");
        System.out.println("Method Signature: "  + jp.getSignature());
        System.out.println("Exception is: "+error);
        System.out.println("end of after throwing advice...");
    }
}
