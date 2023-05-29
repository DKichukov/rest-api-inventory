package com.edu.restapiproduct.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Integer id;
    @Size(min = 4,message = "Min size of category title is 4")
    private String name;
    @NotNull
    private double price;
    @Size(min = 10,message = "Min size of category title is 10")
    private String description;
    private CategoryDTO category;
}
