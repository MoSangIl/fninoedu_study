package com.fnc.grabmarketboot.controller;

import com.fnc.grabmarketboot.dto.Product;
import com.fnc.grabmarketboot.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;



@Slf4j
@Controller
@RequestMapping("/grab")
public class PageController1 {

    @Autowired
    ProductService productService;
   
    
    @GetMapping("/product-list")
    public void getProducts(Model model){
        // log.debug("prduct-list");
        model.addAttribute("js","/js/list.js");
        System.out.println("product...");
       
    }
    @GetMapping("/product-reg")
    public void regProducts(Model model){
        model.addAttribute("js","/js/reg.js");
        System.out.println("regProducts...");
       
    }
    @PostMapping("/product-reg") //메소드가 다르면 같은 url을 가져도 됨
    public String reg1Product(Model model, @ModelAttribute Product product){ //for문으로 데이터 전송받을때 @ModelAttribute 써줌
        model.addAttribute("js", "js/reg.js");//데이터를 전송받음
        model.addAttribute("product",product);//받은 데이터를 product로 넘겨줌
        // log.info("/grab/product-reg...POST : " + product.toString());
        System.out.println("/grab/product-reg...POST : " + product.toString());
        productService.insertProductList(product);
        return "redirect:./product-list";
    }
    @GetMapping("/index")
    public void index(){
        // log.info("index...");
    }
}