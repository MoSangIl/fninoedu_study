package stu.msi.comment.dao;

import java.util.List;

import org.springframework.ui.Model;

import stu.msi.comment.dto.CommentDTO;

public interface CommentDAO {
	public void write(CommentDTO comment);

	public List<CommentDTO> list();

	public String login(String id);
}
