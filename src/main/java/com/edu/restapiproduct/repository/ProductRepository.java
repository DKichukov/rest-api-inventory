package com.edu.restapiproduct.repository;

import com.edu.restapiproduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
