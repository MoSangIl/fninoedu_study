package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.dto.SampleDTO;


@Controller
@RequestMapping("/sample")
public class SampleController {
	
	@GetMapping("/ex1")
	public void ex1(Model model) {
		List<SampleDTO> list = IntStream.rangeClosed(1, 20)
				.asLongStream().mapToObj( i -> {
					SampleDTO dto = SampleDTO.builder()
							.sno(i)
							.build();
					return dto;
				}).collect(Collectors.toList());
		model.addAttribute("list", list);
		System.out.println("ex2......");
//		List<SampleDTO> sampleDto = new ArrayList<SampleDTO>();
//		SampleDTO sample1 = new SampleDTO();
//		sample1.setSno(1);
//		SampleDTO sample2 = new SampleDTO();
//		sample2.setSno(1);
//		SampleDTO sample3 = new SampleDTO();
//		sample3.setSno(1);
//		SampleDTO sample4 = new SampleDTO();
//		sample4.setSno(1);
//		
//		sampleDto.add(sample1);
//		sampleDto.add(sample2);
//		sampleDto.add(sample3);
//		sampleDto.add(sample4);
//		model.addAttribute("list", sampleDto);
	}
	
	@GetMapping("/exInline")
	public String exInline(RedirectAttributes redirectAttributes) {
		System.out.println("exInline....");
		SampleDTO dto = SampleDTO.builder()
				.sno(100L)
				.build();
		redirectAttributes.addFlashAttribute("result", "success");
		redirectAttributes.addFlashAttribute("dto", dto);
		return "redirect:/sample/ex3";
	}
	@GetMapping("/ex3")
	public void ex3() {
		System.out.println("ex3....");
	}
	@GetMapping("/ex4")
	public void ex4(Model model) {
		System.out.println("ex4....");
		List<SampleDTO> list = IntStream.rangeClosed(1, 20)
				.asLongStream().mapToObj( i -> {
					SampleDTO dto = SampleDTO.builder()
							.sno(i)
							.build();
					return dto;
				}).collect(Collectors.toList());
		model.addAttribute("list", list);
	}
	
	@GetMapping("/exTemplate")
	public void exTemplate() {
		System.out.println("exTemplate");
	}
}
