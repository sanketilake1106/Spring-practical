package com.maven;

import com.maven.entities.Address;
import com.maven.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class App
{
    public static void main( String[] args )
    {
        // This is xml based configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Student student = context.getBean("student", Student.class);
//        System.out.println(student.toString());


        // Annotation based configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student getStudent = context.getBean("student", Student.class);
        System.out.println(getStudent.toString());
        context.registerShutdownHook();
    }

}
