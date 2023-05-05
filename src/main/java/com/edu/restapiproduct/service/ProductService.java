package com.edu.restapiproduct.service;

import com.edu.restapiproduct.dto.ProductDTO;
import com.edu.restapiproduct.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> getAllProducts();
    public Product getProduct(Integer productId);
//    Optional<ProductDTO> findById(int id);
    public Product save(ProductDTO productDTO);
    public Product updateProduct(Integer productId, ProductDTO productDTO);
    public void delete(Integer productId);
}
