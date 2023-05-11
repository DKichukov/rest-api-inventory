package com.edu.restapiproduct.services;

import com.edu.restapiproduct.dtos.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProducts();

    ProductDTO getProduct(Integer productId);

    ProductDTO save(ProductDTO productDTO);

    void updateProduct(Integer productId, ProductDTO productDTO);

    void delete(Integer productId);
}
