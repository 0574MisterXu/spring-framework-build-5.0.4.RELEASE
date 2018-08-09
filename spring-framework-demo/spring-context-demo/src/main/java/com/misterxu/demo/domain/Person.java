package com.misterxu.demo.domain;

import org.springframework.stereotype.Component;

/**
 * Created by misterxu on 2018/8/9.
 */
@Component
public class Person {
    private String id;
    private String name;


    public Person(){
        System.out.println("Person 加入容器");
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
