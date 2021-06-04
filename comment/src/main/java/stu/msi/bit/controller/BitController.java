package stu.msi.bit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BitController {
	@RequestMapping("/test.bit")
	public void home(Model model) {
		System.out.println("asdflkjasdf");
//		return "";
//		return "home";
	}
}
