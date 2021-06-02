package stu.block.msi.dao;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import stu.block.msi.dto.EmployeeDTO;

@Repository
public class BlockDaoImpl implements BlockDao {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSession sqlSessionTemplate;
	
	final private String query = "a";
	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("µø¿€«‘");
		int employeeId=101;
		EmployeeDTO employee = sqlSessionTemplate.selectOne(query + ".employee", employeeId);
		System.out.println(employee);
		System.out.println(sqlSessionTemplate.selectOne(query + ".employee", employeeId));
	}

}
