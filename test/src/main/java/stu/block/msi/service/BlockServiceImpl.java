package stu.block.msi.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import stu.block.msi.dao.BlockDao;

@Service
public class BlockServiceImpl implements BlockService{
	
	@Inject // J2EE 가 지원하는 언노테이션
	private BlockDao blockDao;
	
	@Override
	public void list(Model model) {
		model.addAttribute("list", "즐거운 금요일");
		blockDao.list();
	}

	@Override
	public void content(Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("content", "여기는 content 파일");
	}
}
