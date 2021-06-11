package com.fnc.grabmarketboot.dao;

import java.util.List;

import com.fnc.grabmarketboot.dto.Product;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper // 앤 뭐누 aPACHE Mybatis 얘가 xml mapper 에 있는 id와 namespace를 통해 자동적으로 설정 해준다.
@Repository
public interface ProductDao {
    public List<Product> getProductList();
    public void insertProductList(Product product);
}
