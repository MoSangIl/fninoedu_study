package stu.block.msi.service;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import stu.block.msi.dao.BlockDao;

@Service
public class BlockServiceImpl implements BlockService{
	
	@Inject // J2EE �� �����ϴ� ������̼�
	private BlockDao blockDao;
	
	@Override
	public void list(Model model) {
		model.addAttribute("list", "��ſ� �ݿ���");
		blockDao.list();
	}

	@Override
	public void content(Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("content", "����� content ����");
	}
}
