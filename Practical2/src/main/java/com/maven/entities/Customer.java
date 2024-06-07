package com.maven.entities;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@RequiredArgsConstructor
@Component
public class Customer {
    private Long customerId;
    private String customerName;
    private String customerContact;
    private String customerCity;
    private String customerState;
    private String customerPincode;
    private Order order;

}
