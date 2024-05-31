package com.maven.entities;

import lombok.Data;

@Data

public class Student{

    private int id;
    private short  age;
    private String name,contact;
    private Address address;

}
