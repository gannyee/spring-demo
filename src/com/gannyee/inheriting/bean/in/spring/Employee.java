package com.gannyee.inheriting.bean.in.spring;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-05
 **/
public class Employee {
    private int id;
    private String name;
    private Address address;

    public Employee() {
    }

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void show() {
        System.out.println(id + " " + name);
        System.out.println(address);
    }
}
