package com.edu.restapiproduct.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class ProductDTO {
    private Integer id;
    @NotBlank
    @Size(min = 4,message = "Min size of category title is 4")
    private String name;
    @NotNull
    private double price;
    @NotBlank
    @Size(min = 10,message = "Min size of category title is 10")
    private String description;
    private CategoryDTO category;
}
