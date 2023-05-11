package com.edu.restapiproduct.services;

import com.edu.restapiproduct.dtos.ProductDTO;

import java.util.List;

public interface ProductService {
    public List<ProductDTO> getAllProducts();
    public ProductDTO getProduct(Integer productId);
//    Optional<ProductDTO> findById(int id);
    public ProductDTO save(ProductDTO productDTO);
    public ProductDTO updateProduct(Integer productId, ProductDTO productDTO);
    public void delete(Integer productId);
}
