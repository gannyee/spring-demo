package com.gannyee.inheriting.bean.in.spring;

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
        Resource r = new ClassPathResource("com/gannyee/inheriting/bean/in/spring/applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(r);

        Employee e1 = (Employee) factory.getBean("e2");
        e1.show();

    }
}
