package com.edu.restapiproduct.dtos;

import lombok.Data;

@Data
public class ProductDTO {
    private Integer id;
    private String name;
    private double price;
    private String description;
    private CategoryDTO category;
}
