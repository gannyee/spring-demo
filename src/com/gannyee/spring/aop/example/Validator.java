package com.gannyee.spring.aop.example;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-13
 **/
public class Validator {
    public void validate(int age) throws Exception {
        if (age < 18) {
            throw new ArithmeticException("Not Valid Age");
        } else {
            System.out.println("vote confirmed");
        }
    }
}
