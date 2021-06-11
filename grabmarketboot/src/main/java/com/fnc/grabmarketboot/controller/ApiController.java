package com.fnc.grabmarketboot.controller;

import java.util.ArrayList;
import java.util.List;

import com.fnc.grabmarketboot.dto.Product;
import com.fnc.grabmarketboot.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    ProductService productSerivce;
    
    @GetMapping("/products")
    public List<Product> getProducts() {
        List<Product> products = productSerivce.getProductList();
        return products;
        // List<Product> products = new ArrayList<>();
        // Product product1 = new Product();
        // product1.setImageUrl("/images/products/basketball1.jpeg");
        // product1.setName("농구공");
        // product1.setPrice("10000");
        // product1.setSeller("Jordan");
        // Product product2 = new Product();
        // product2.setImageUrl("/images/products/soccerball1.jpg");
        // product2.setName("축구공");
        // product2.setPrice("30000");
        // product2.setSeller("Jordan");
        // Product product3 = new Product();
        // product3.setImageUrl("/images/products/keyboard1.jpg");
        // product3.setName("키보드");
        // product3.setPrice("35000");
        // product3.setSeller("Jordan");
        // products.add(product1);
        // products.add(product2);
        // products.add(product3);
        // return products;
    }
}
