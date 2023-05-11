package com.edu.restapiproduct.controllers;

import com.edu.restapiproduct.dtos.CategoryDTO;
import com.edu.restapiproduct.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getCategories() {
        List<CategoryDTO> categories = categoryService.getAllCategories();
        return ResponseEntity.ok(categories);
    }
    @GetMapping(path = "{categoryId}")
    public ResponseEntity<CategoryDTO>getCategory(@PathVariable("categoryId") Integer id) {
        CategoryDTO categoryDTO = categoryService.getCategory(id);
        return ResponseEntity.ok(categoryDTO);
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO) {
        CategoryDTO createdCategory = categoryService.saveCategory(categoryDTO);
        return new ResponseEntity<>(createdCategory, HttpStatus.CREATED);
    }

    @PutMapping(path = "{categoryId}")
    public ResponseEntity<CategoryDTO> updateCategory(@PathVariable("categoryId") Integer id, @RequestBody CategoryDTO categoryDTO) {
        CategoryDTO updatedCategory = categoryService.updateCategory(id, categoryDTO);
        return ResponseEntity.ok(updatedCategory);
    }

    @DeleteMapping(path = "{categoryId}")
    public ResponseEntity<String> deleteCategory(@PathVariable("categoryId") Integer id) {
        categoryService.deleteCategory(id);
        return new ResponseEntity<>("Category has been deleted successfully", HttpStatus.OK);
    }


}
