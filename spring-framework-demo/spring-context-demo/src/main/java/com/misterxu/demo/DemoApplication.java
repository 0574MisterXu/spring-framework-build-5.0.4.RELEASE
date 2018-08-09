package com.misterxu.demo;

import com.misterxu.demo.domain.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by misterxu on 2018/8/9.
 */
public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop.xml");
        Person p = context.getBean(Person.class);
        System.out.println(p);
    }
}
