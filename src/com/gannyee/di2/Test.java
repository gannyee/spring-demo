package com.gannyee.di2;


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
        Resource resource = new ClassPathResource("com/gannyee/di2/applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Employee e = (Employee) factory.getBean("e1");
        e.show();
        //using ClasspathXmlApplicationContext
        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/gannyee/di2/applicationContext.xml");

        Employee e1 = (Employee) context.getBean("e1");
        e1.show();


    }
}
