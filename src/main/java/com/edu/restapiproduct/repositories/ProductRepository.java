package com.edu.restapiproduct.repositories;

import com.edu.restapiproduct.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
