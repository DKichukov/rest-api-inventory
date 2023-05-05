package com.edu.restapiproduct.service;

import com.edu.restapiproduct.dto.ProductDTO;
import com.edu.restapiproduct.model.Product;

import java.util.List;

public interface ProductService {
    public List<ProductDTO> getAllProducts();
    public ProductDTO getProduct(Integer productId);
//    Optional<ProductDTO> findById(int id);
    public ProductDTO save(ProductDTO productDTO);
    public ProductDTO updateProduct(Integer productId, ProductDTO productDTO);
    public void delete(Integer productId);
}
