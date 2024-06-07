package com.maven;

import com.maven.entities.Address;
import com.maven.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.maven.entities")
public class SpringConfig {

//    @Autowired
//    private Student student;
//
//    @Autowired
//    private Address address;

//    @Bean
//    public Student getStudent(){
//        student.setName("Omkar");
//        student.setId(1001);
//        student.setAge((short) 15);
//        student.setContact("7768879898");
//
//        address.setState("Maharashtra");
//        address.setCountry("India");
//        address.setCity("Kolhapur");
//        address.setPinCode("778787");
//
//        student.setAddress(address);
//
//        return student;
//    }
//
//    @Bean
//    public Address getAddress(){
//        address.setState("Maharashtra");
//        address.setCountry("India");
//        address.setCity("Kolhapur");
//        address.setPinCode("778787");
//        return address;
//    }

}
