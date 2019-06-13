package com.gannyee.spring.aop.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author: gany@koal.com
 * @description:
 * @created: 2019-06-13
 **/
public class Test {

    public static void main(String[] args) {
        //加载定义的资源 上下文
        Resource resource = new ClassPathResource("com/gannyee/spring/aop/example/applicationContext.xml");
        //声明bean工厂类
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        Validator v = beanFactory.getBean("proxy", Validator.class);
        try {
            v.validate(12);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
