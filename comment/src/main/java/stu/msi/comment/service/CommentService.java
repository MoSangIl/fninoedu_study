package stu.msi.comment.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import stu.msi.comment.dto.CommentDTO;

public interface CommentService {
	public void write(CommentDTO comment);

	public List<CommentDTO> list(HttpSession session);
	public String login(String id, String pass, HttpSession session);
}
