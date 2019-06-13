package com.gannyee.constructor.injection.with.non.string.collection.having.dependent.object.example;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-05
 **/
public class Answer {
    private int id;
    private String name;
    private String by;

    public Answer() {
    }

    public Answer(int id, String name, String by) {
        super();
        this.id = id;
        this.name = name;
        this.by = by;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + by;
    }
}
