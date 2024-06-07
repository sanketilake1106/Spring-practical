package com.maven.entities;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@RequiredArgsConstructor
@ToString
@Component
public class Product {

    private Long productId;
    private String productName;
    private Float productPrice;
    private Integer productQuantity;


}
