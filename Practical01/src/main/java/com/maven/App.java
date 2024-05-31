package com.maven;

import com.maven.entities.Address;
import com.maven.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student s = new Student();
        s.setId(1);
        s.setName("Sanket Ilake");
        s.setAge((short) 20);
        s.setContact("7057891106");
        Address a = new Address();
        a.setCountry("India");
        a.setState("Maharashtra");
        a.setPinCode("416234");
        a.setCity("Kolhapur");
        s.setAddress(a);


        System.out.println(s.toString());
    }
}
