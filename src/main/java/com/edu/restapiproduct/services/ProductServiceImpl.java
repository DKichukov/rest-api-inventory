package com.edu.restapiproduct.services;

import com.edu.restapiproduct.dtos.ProductDTO;
import com.edu.restapiproduct.models.Category;
import com.edu.restapiproduct.models.Product;
import com.edu.restapiproduct.repositories.CategoryRepository;
import com.edu.restapiproduct.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;
    private final ModelMapper mapper;

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
        Product product = productRepository.findById(productId)
                .orElseThrow(RuntimeException::new);

        return mapper.map(product, ProductDTO.class);
    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {
        Product product = mapper.map(productDTO, Product.class);

        return mapper.map(productRepository.save(product), ProductDTO.class);
    }

    //partial updateProduct is possible
    @Override
    public void updateProduct(Integer productId, ProductDTO productDTO) {
        Product product = productRepository.findById(productId)
                .orElseThrow(RuntimeException::new);
        if (productDTO.getName() != null && !productDTO.getName().isEmpty()) {
            product.setName(productDTO.getName());
        }
        if (productDTO.getPrice() != 0) {
            product.setPrice(productDTO.getPrice());
        }
        if (productDTO.getDescription() != null && !productDTO.getDescription().isEmpty()) {
            product.setDescription(productDTO.getDescription());
        }
        if (productDTO.getCategory() != null) {
            Category category = categoryRepository.findById(productDTO.getCategory().getId())
                    .orElseThrow(RuntimeException::new);
            product.setCategory(category);
            productRepository.save(product);
        }
    }

    @Override
    public void delete(Integer productId) {

        Product product = productRepository.findById(productId)
                .orElseThrow(RuntimeException::new);
        productRepository.delete(product);
    }
}
