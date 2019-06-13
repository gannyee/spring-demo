package com.gannyee.constructor.injection.with.non.string.collection.having.dependent.object.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-05
 **/
public class Test {
    public static void main(String[] args) {
        Resource r = new ClassPathResource("com/gannyee/constructor/injection/with/non/string/collection/having/dependent/object/example/applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);

        Question q = (Question) factory.getBean("q");
        q.displayInfo();
    }

}
