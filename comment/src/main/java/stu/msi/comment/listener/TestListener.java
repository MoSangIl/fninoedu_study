package stu.msi.comment.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestListener implements ServletContextListener{

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub

		System.out.println("���� ���ؽ�Ʈ ������ ����");
		ServletContext  sc = sce.getServletContext();
		System.out.println(sc.getInitParameter("sangil"));
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}
	
}
