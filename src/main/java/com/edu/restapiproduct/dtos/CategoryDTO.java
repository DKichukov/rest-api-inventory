package com.edu.restapiproduct.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class CategoryDTO {
    private Integer id;
    @NotBlank
    @Size(min = 4, message = "Min size of category title is 4")
    private String name;

}
