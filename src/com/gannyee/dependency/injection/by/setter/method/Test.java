package com.gannyee.dependency.injection.by.setter.method;

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

        // using BeanFactory
        Resource resource = new ClassPathResource("com/gannyee/dependency/injection/by/setter/method/applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Employee e = (Employee) factory.getBean("e");
        e.display();

    }
}
