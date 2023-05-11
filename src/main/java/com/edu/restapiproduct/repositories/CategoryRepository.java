package com.edu.restapiproduct.repositories;

import com.edu.restapiproduct.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
