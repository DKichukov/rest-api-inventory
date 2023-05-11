package com.edu.restapiproduct.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ProductDTO {
    private Integer id;
    private String name;
    private double price;
    private double description;
}
