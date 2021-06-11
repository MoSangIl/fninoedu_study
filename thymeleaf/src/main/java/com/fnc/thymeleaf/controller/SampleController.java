package com.fnc.thymeleaf.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fnc.thymeleaf.dto.Product;
import com.fnc.thymeleaf.dto.SampleDTO;

@Controller
@RequestMapping("/sample")
public class SampleController {
	
	@GetMapping("/ex1")
	public void ex1() {
		System.out.println("ex1.....");
	}
	
	@GetMapping("/ex2")
	public void exModel(Model model) {
		List<SampleDTO> list = IntStream.rangeClosed(1,20).asLongStream().mapToObj(i ->{
			SampleDTO dto = SampleDTO.builder()
					.sno(i)
					.first("First.."+ i)
					.last("Last.."+i)
					.regTime(LocalDateTime.now())
					.build();
		return dto;
		}).collect(Collectors.toList());
		model.addAttribute("list",list);
	}
	
	@GetMapping("/ex3")
	public void ex3() {
		System.out.println("ex3");
		
	}
	@GetMapping("/index")
	public void index(Model model) {
         List<Product> products = new ArrayList();

         Product product1 = new Product();
         product1.setImageUrl("images/products/basketball1.jpeg");
         product1.setName("농구공");
         product1.setPrice("10000");
         product1.setSeller("Jordan");

         Product product2 = new Product();
         product2.setImageUrl("images/products/soccerball1.jpg");
         product2.setName("축구공");
         product2.setPrice("10000");
         product2.setSeller("Messi");
        
         Product product3 = new Product();
         product3.setImageUrl("images/products/keyboard1.jpg");
         product3.setName("키보드");
         product3.setPrice("10000");
         product3.setSeller("Jobs");

         products.add(product1);
         products.add(product2);
         products.add(product3);
         model.addAttribute("products", products);
	}
}
	