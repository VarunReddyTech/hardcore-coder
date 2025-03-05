package com.hardcore.coder.service;

import com.hardcore.coder.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products;

    public ProductService(){
        products = new ArrayList<>();
        Product p = new Product(1L,"Laptop", 999.99,"A powerful gaming laptop");
        Product p1 = new Product(3L,"shoes", 99.99,"comfortable shoes");
        products.add(p);
        products.add(p1);
    }

    public Product addProduct(Product p) {
        products.add(p);
        return p;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProduct(Long id) {

        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
