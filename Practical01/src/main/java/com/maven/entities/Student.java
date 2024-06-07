package com.maven.entities;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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


}
