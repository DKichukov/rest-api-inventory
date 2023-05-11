package com.edu.restapiproduct.services;

import com.edu.restapiproduct.dtos.CategoryDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    CategoryDTO getCategory(Integer categoryId);
    CategoryDTO saveCategory(CategoryDTO categoryDTO);
    CategoryDTO updateCategory(Integer categoryId, CategoryDTO categoryDTO);
    void deleteCategory(Integer categoryId);




}
