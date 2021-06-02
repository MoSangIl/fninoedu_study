package stu.block.msi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import stu.block.msi.service.BlockService;

@Controller
public class BlockController {
	
	@Autowired // @Autowired
	private BlockService blockService;
	@RequestMapping("/list.chain")
	public String list(Model model) {
		blockService.list(model);
		// model은 키, 벨류를 저장할 수있는 콜렉션 이다.
//		model.addAttribute("list", "즐거운 금요일");
		return "list";
	}
	
	@RequestMapping("/content.chain")
	public String content(Model model) {
		// model은 키, 벨류를 저장할 수있는 콜렉션 이다.
		blockService.content(model);
		return "content";
	}
}