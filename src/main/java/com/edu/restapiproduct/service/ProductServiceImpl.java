package com.edu.restapiproduct.service;

import com.edu.restapiproduct.dto.ProductDTO;
import com.edu.restapiproduct.model.Product;
import com.edu.restapiproduct.repository.ProductRepository;
import org.modelmapper.ModelMapper;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    private final ModelMapper mapper;

    public ProductServiceImpl(ProductRepository productRepository, ModelMapper mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProduct(Integer productId) {
        return null;
    }

    @Override
    public Product save(ProductDTO productDTO) {
        return null;
    }

    @Override
    public Product updateProduct(Integer productId, ProductDTO productDTO) {
        return null;
    }

    @Override
    public void delete(Integer productId) {

    }
}
