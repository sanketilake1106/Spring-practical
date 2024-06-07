package com.maven.entities;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@RequiredArgsConstructor
@ToString
@Component
public class Order {
    private Long orderId;
    private Product product;

}
