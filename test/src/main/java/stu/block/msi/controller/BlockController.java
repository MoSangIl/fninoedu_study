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
		// model�� Ű, ������ ������ ���ִ� �ݷ��� �̴�.
//		model.addAttribute("list", "��ſ� �ݿ���");
		return "list";
	}
	
	@RequestMapping("/content.chain")
	public String content(Model model) {
		// model�� Ű, ������ ������ ���ִ� �ݷ��� �̴�.
		blockService.content(model);
		return "content";
	}
}