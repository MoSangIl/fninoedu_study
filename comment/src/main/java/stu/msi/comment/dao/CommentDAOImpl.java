package stu.msi.comment.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import stu.msi.comment.dto.CommentDTO;

@Repository
public class CommentDAOImpl implements CommentDAO {
	
	@Autowired
	private SqlSession sqlSessionTemplate;
	
	final private String namespace = "stu.msi.comment.dao.CommentDAO";
	@Override
	public void write(CommentDTO comment) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.insert(namespace + ".insert", comment);
		//
	}
	@Override
	public List<CommentDTO> list() {
		// TODO Auto-generated method stub
		List<CommentDTO> list = sqlSessionTemplate.selectList(namespace + ".selectAll");
		System.out.println(list);
		return list;
		
	}
	@Override
	public String login(String id) {
		// TODO Auto-generated method stub
		System.out.println(id);
		String pass = sqlSessionTemplate.selectOne(namespace + ".login", id);
		return pass;
	}
	@Override
	public void delete(int commentNum) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.delete(namespace + ".delete", commentNum);
	}
}
