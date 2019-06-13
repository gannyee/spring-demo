package com.gannyee.dependency.injection.with.factory.method.in.spring;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-13
 **/
public class A {
    private static final A obj = new A();

    private A() {
        System.out.println("private constructor");
    }

    public static A getA() {
        System.out.println("factory method ");
        return obj;
    }

    public void msg() {
        System.out.println("hello user");
    }

}
