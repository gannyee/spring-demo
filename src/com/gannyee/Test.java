package com.gannyee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-05
 **/
public class Test {

    public static void main(String[] args) {

        // using BeanFactory
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Student student = (Student) factory.getBean("studentbean");
        student.displayInfo();
        //using ClasspathXmlApplicationContext
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student1 = (Student) context.getBean("studentbean");
        student1.displayInfo();


    }
}
