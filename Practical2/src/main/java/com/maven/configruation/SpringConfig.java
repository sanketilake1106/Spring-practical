package com.maven.configruation;

import com.maven.entities.Customer;
import com.maven.entities.Order;
import com.maven.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.maven.entities")
public class SpringConfig {

    @Autowired
    private Customer customer;
    @Autowired
    private Product product;
    @Autowired
    private Order order;
    @Bean
    public Customer getCustomer(){
        customer.setCustomerId(1001L);
        customer.setCustomerName("Sanket Ilake");
        customer.setCustomerCity("Kolhapur");
        customer.setCustomerPincode("416234");
        customer.setCustomerContact("7057891106");
        customer.setCustomerState("Maharashtra");
        customer.setOrder(order);
        return customer;

    }
    @Bean
    public Product getProduct(){

        product.setProductId(1211L);
        product.setProductName("One Plus 12R");
        product.setProductPrice(40000.55F);
        product.setProductQuantity(1);
        return product;

    }

    @Bean
    public Order getOrder(){

        order.setOrderId(101L);
        order.setProduct(product);
        return order;
    }

    @Bean
   public Customer checkOrderId(){
       Customer customer1 = getCustomer();
       Order order1 = getOrder();
       if (customer1.getOrder().getOrderId().equals(order1.getOrderId())){
           return customer1;
       }
       return null;
   }
}
