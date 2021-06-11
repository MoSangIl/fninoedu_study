package com.fnc.grabmarketboot.service;

import java.util.List;

import com.fnc.grabmarketboot.dao.ProductDao;
import com.fnc.grabmarketboot.dto.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductDao productDao;

    public List<Product> getProductList(){
        return productDao.getProductList();
    }
    
    public void insertProductList(Product product){
        productDao.insertProductList(product);
    }
}
