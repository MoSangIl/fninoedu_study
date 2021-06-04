package stu.msi.comment.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import stu.msi.comment.dto.CommentDTO;
import stu.msi.comment.service.CommentService;

@Controller
public class CommentController {
	@Autowired
	private CommentService commentServiceImpl;

	@RequestMapping({"/","/main.chain"})
	public String home(Model model) {
		return "home";
	}

	@GetMapping("/list.chain")
	public String list(Model model, HttpSession session) {
		List<CommentDTO> list = commentServiceImpl.list(session);
		model.addAttribute("list", list);
		return "list";
	}

	@GetMapping("/write.chain") 
	public String writeForm(HttpSession session){
		return "writeForm";
	}

	@PostMapping("/write.chain") 
	public String write(@ModelAttribute CommentDTO comment, HttpSession session){
		comment.setId((String) session.getAttribute("id"));
		commentServiceImpl.write(comment);
		return "redirect:/list.chain";
	}
	
	@GetMapping("/login.chain")
	public String loginForm() {
		return "login";
	}
	
	@PostMapping("/login.chain")
	public String login(@RequestParam("id") String id, @RequestParam("pass") String pass, HttpSession session) {
		return commentServiceImpl.login(id, pass, session);
		
	}
	
	@PostMapping("/logout.chain")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/main.chain";
	}
	
	@GetMapping("/delete.chain")
	public String delete(@RequestParam int commentNum) {
		commentServiceImpl.delete(commentNum);
		return "redirect:/list.chain";
	}
}