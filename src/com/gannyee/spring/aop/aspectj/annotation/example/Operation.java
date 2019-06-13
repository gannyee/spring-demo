package com.gannyee.spring.aop.aspectj.annotation.example;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-13
 **/
public class Operation {

    public void msg() {
        System.out.println("msg method invoked");
    }

    public int m() {
        System.out.println("m method invoked");
        return 2;
    }

    public int k() {
        System.out.println("poitcutMethod method invoked");
        return 3;
    }

    public void validate(int age) throws Exception {
        if (age < 18) {
            throw new ArithmeticException("Not valid age");
        } else {
            System.out.println("Thanks for vote");
        }
    }
}
