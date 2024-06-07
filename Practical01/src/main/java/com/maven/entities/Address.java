package com.maven.entities;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Address {
    String city;
    String state;
    String country;
    String pinCode;
}
