package com.edu.restapiproduct.controllers;

import com.edu.restapiproduct.dtos.ProductDTO;
import com.edu.restapiproduct.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getProducts() {
        List<ProductDTO> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }
    @GetMapping(path = "{productId}")
    public ResponseEntity<ProductDTO> getProduct(@PathVariable("productId") Integer productId) {
        ProductDTO productDTO = productService.getProduct(productId);
        return ResponseEntity.ok(productDTO);
    }
    @PostMapping
    public ResponseEntity<ProductDTO>createProduct(@RequestBody ProductDTO productDTO) {
        ProductDTO createdProduct = productService.save(productDTO);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @PutMapping(path = "{productId}")
    public ResponseEntity<ProductDTO> updateProduct(@PathVariable("productId") Integer id, @RequestBody ProductDTO productDTO) {
        ProductDTO updatedProduct = productService.updateProduct(id,productDTO);
        return ResponseEntity.ok(updatedProduct);
    }
    @DeleteMapping(path = "{productId}")
    public ResponseEntity<String>deleteProduct(@PathVariable("productId") Integer id) {
        productService.delete(id);
        return new ResponseEntity<>("Product has been deleted successfully!!",HttpStatus.OK);
    }

}
