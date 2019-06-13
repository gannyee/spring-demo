package com.gannyee.dependency.injection.constructor.injection.with.collection.example;

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
    private List<String> answers;
    private Map<String, Object> testInfo;

    public Question() {
    }

    public Question(int id, String name, List<String> answers, Map<String, Object> testInfo) {
        super();
        this.id = id;
        this.name = name;
        this.answers = answers;
        this.testInfo = testInfo;
    }

    public void displayInfo() {
        System.out.println(id + " " + name);
        System.out.println("answers are:");
        Iterator<String> itr = answers.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (Map.Entry<String, Object> entry : testInfo.entrySet()) {
            System.out.println("key" + entry.getKey());
            System.out.println("value" + entry.getValue());
        }
    }
}
