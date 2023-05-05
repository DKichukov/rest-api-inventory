package com.edu.restapiproduct.service;

import com.edu.restapiproduct.dto.ProductDTO;
import com.edu.restapiproduct.model.Product;
import com.edu.restapiproduct.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ModelMapper mapper;

    public ProductServiceImpl(ProductRepository productRepository, ModelMapper mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    @Override
    public List<ProductDTO> getAllProducts() {

        List<Product> products = productRepository.findAll();

        return products
                .stream()
                .map(prd -> mapper.map(prd, ProductDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO getProduct(Integer productId) {

        Product product = productRepository.findById(productId).orElseThrow(RuntimeException::new);

        return mapper.map(product, ProductDTO.class);
    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {

        Product product = mapper.map(productDTO,Product.class);

        return mapper.map(productRepository.save(product),ProductDTO.class);
    }

    @Override
    public ProductDTO updateProduct(Integer productId, ProductDTO productDTO) {

        Product product = productRepository.findById(productId).orElseThrow(RuntimeException::new);
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());

        return mapper.map(productRepository.save(product),ProductDTO.class);
    }

    @Override
    public void delete(Integer productId) {

        Product product = productRepository.findById(productId).orElseThrow(RuntimeException::new);

        productRepository.delete(product);
    }
}
