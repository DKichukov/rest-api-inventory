package com.edu.restapiproduct.repositories;

import com.edu.restapiproduct.models.Category;
import com.edu.restapiproduct.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class ProductRepositoryTest {
    @Autowired
    private ProductRepository productRepository;
//    @Test
//    void checkIfProductNameExists() {
//        String name = "testName";
//        Category testCategory = new Category(1,"any",new ArrayList<>());
//        Product testProduct = new Product(1, "testName", 1.5, "something", testCategory);
//        productRepo.save(testProduct);
//        Product foundProduct = productRepo.findByName(name);
//        assertThat(foundProduct.getName()).isEqualTo(testProduct.getName());
//    }
@Test
public void testFindByName() {
    Product product = new Product();
    product.setCategory(new Category());
    product.setDescription("neshto");
    product.setName("TestProduct");
    product.setPrice(1);
    productRepository.save(product);

    Product foundProduct = productRepository.findByName("TestProduct");

    assertNotNull(foundProduct);
    assertEquals("TestProduct", foundProduct.getName());
}

}