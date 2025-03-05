package com.hardcore.coder.controller;

import com.hardcore.coder.model.Product;
import com.hardcore.coder.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService service){
        this.productService = service;
    }

    @PostMapping("/products")
    public Product addProduct(){
        Product p = new Product(2L,"Mobile", 99.99,"Nice Mobile");
        return productService.addProduct(p);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable Long id){
       Product p = productService.getProduct(id);
       if(p != null){
           return new ResponseEntity<>(p, HttpStatus.OK);
       }else{
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }
}
