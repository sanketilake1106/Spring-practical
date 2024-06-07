package com.maven.entities;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@Component
public class Student{
    private int id;
    private short  age;
    private String name;
    private String contact;
    @Autowired
    private Address address;

    @Autowired
    public void settingValue(){
        setId(1001);
        setName("Omkar");
        setContact("887898332");
        setAge((short) 21);
    }

    @PostConstruct
    public void getStudent(){
        System.out.println("Student class method initilazing");
    }

    @PreDestroy
    public void shutDown(){
        System.out.println("Student class method destroyed");
    }
}
