package com.edu.restapiproduct.services;

import com.edu.restapiproduct.dtos.CategoryDTO;
import com.edu.restapiproduct.models.Category;
import com.edu.restapiproduct.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper mapper;

    @Override
    public List<CategoryDTO> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        System.out.println(categories.stream().toString());
        return categories
                .stream()
                .map(cat -> mapper.map(cat, CategoryDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public CategoryDTO getCategory(Integer categoryId) {
        Category category = categoryRepository.findById(categoryId).orElseThrow(RuntimeException::new);

        return mapper.map(category, CategoryDTO.class);
    }

    @Override
    public CategoryDTO saveCategory(CategoryDTO categoryDTO) {
        Category category = mapper.map(categoryDTO, Category.class);

        return mapper.map(categoryRepository.save(category), CategoryDTO.class);
    }

    @Override
    public CategoryDTO updateCategory(Integer categoryId, CategoryDTO categoryDTO) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(RuntimeException::new);

        category.setId(categoryDTO.getId());
        category.setName(categoryDTO.getName());
//        category.setProducts(categoryDTO.getProducts());

        return mapper.map(categoryRepository.save(category), CategoryDTO.class);
    }

    @Override
    public void deleteCategory(Integer categoryId) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(RuntimeException::new);
        categoryRepository.delete(category);
    }
}
