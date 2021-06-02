package stu.msi.comment.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import stu.msi.comment.dao.CommentDAO;
import stu.msi.comment.dto.CommentDTO;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentDAO commentDAOImpl;

	@Override
	public void write(CommentDTO comment) {

		// TODO Auto-generated method stub
		commentDAOImpl.write(comment);
		//
	}

	@Override
	public List<CommentDTO> list(HttpSession session) {
		if (session.getAttribute("id") == null)
			return null;
		else {
		// TODO Auto-generated method stub
			return commentDAOImpl.list();
		}
	}

	@Override
	public String login(String id, String pass, HttpSession session) {
		
		// TODO Auto-generated method stub
		String password = commentDAOImpl.login(id);
		if (password == null) {
			System.out.println("��ϵ��� ���� ���̵�");
			return "redirect:/join.chain";
		}else {
			if(pass.equals(password)) {
				System.out.println("�α��� ����!");
				session.setAttribute("id", id);
				return "redirect:/main.chain";
			}else {
				System.out.println("�α��� ����! ��й�ȣ Ʋ��");
				return "redirect:/login.chain";
			}
		}
	}
}
