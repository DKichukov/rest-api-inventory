package com.edu.restapiproduct.repositories;

import com.edu.restapiproduct.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ProductRepository extends JpaRepository<Product,Integer> {
    @Query("select p from Product p where p.name=?1")
    Product findByName(String name);
}
