package com.edu.restapiproduct.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ProductDTO {
    private Integer id;
    private String name;
    private double price;

}
