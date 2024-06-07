package com.maven;

import com.maven.configruation.SpringConfig;
import com.maven.entities.Customer;
import com.maven.entities.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Customer checkOrderId = context.getBean("checkOrderId", Customer.class);
        System.out.println(checkOrderId.toString());
    }
}
