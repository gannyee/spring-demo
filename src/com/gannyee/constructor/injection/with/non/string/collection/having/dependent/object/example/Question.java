package com.gannyee.constructor.injection.with.non.string.collection.having.dependent.object.example;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-05
 **/
public class Question {

    private int id;
    private String name;
    private List<Answer> answers;
    private Map<String, Object> testInfo;

    public Question() {
    }

    public Question(int id, String name, List<Answer> answers) {
        super();
        this.id = id;
        this.name = name;
        this.answers = answers;
        this.testInfo = testInfo;
    }

    public void displayInfo() {
        System.out.println(id + " " + name);
        System.out.println("answers are:");
        Iterator<Answer> itr = answers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
