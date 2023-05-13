package com.edu.restapiproduct.services;

import com.edu.restapiproduct.models.Product;
import com.edu.restapiproduct.repositories.ProductRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@DataJpaTest
class ProductServiceImplTest {
    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }
    @AfterEach
    void deleteAll() {
        productRepository.deleteAll();
    }

    @Autowired
    private ProductRepository productRepository;
    @Mock
    private ModelMapper mapper;
    @Autowired
    private ProductServiceImpl productServiceImpl;

    @Test
    public void testGetProduct() {
        int productId = 1;
        Product product = new Product();
        product.setId(productId);
        product.setName("Test Product");
        product.setPrice(10.0);
        product.setDescription("This is a test product");
        productRepository.save(product);
//        when(productRepository.findById(productId)).thenReturn(Optional.of(product));
        assertThat(productRepository.findById(productId)).isEqualTo(1);
        // Act
//        ProductDTO result = productServiceImpl.getProduct(productId);
////
////        // Assert
////        assertNotNull(result);
////        assertEquals(productId, result.getId());
////        assertEquals("Test Product", result.getName());
////        assertEquals(10.0, result.getPrice(), 0.001);
////        assertEquals("This is a test product", result.getDescription());
    }
}