package com.gannyee.autowiring.in.spring;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-13
 **/
public class A {
    B b;


    A() {
        System.out.println("a is created");
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    void print() {
        System.out.println("hello a");
    }

    void display() {
        print();
        b.print();
    }
}
