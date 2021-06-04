package stu.msi.comment.aop;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect // pointcut�� adivse �� ����Ǿ� ���� ���̴�!!
@Component
public class LoginAspect {
	private static final Logger logger = LoggerFactory.getLogger(LoginAspect.class);
	
	// �޼ҵ� �̸��� �׳� �̸��� ���� �� ����
	@Pointcut("execution(* stu.msi.comment.controller.CommentController.writeForm(..))")
	public void writeForm() {
		logger.info("LoginAspect�� writeForm()�� ����Ʈ�� ����");
	}
	
	@Around("writeForm()")
	public Object human(ProceedingJoinPoint pjt) throws Throwable {
		// ProceedingJoinPoint �� �Լ��� ���� ���ڸ� �޾ƿ´�.
		HttpSession session = null;
		HttpServletResponse resp = null;
		for (Object obj : pjt.getArgs()) {
			if(obj instanceof HttpSession) {
				session = (HttpSession)obj;
			}else if(obj instanceof HttpServletResponse) {
				resp = (HttpServletResponse)obj;
			}
		}
		
		if (session.getAttribute("id") == null) {
			// WEB-INF �� �Ʒ� jsp ������ �Ժη� ������ �ȵǱ� ������, �ٽ� ��û�� �����ִ� ����� Ȱ���ؾ� �Ѵ�.
			return "redirect:/login.chain";
		}
		
		// Controller�� �޼ҵ� ����
		Object result = pjt.proceed();
		
		// Controller�� �޼ҵ尡 ����ǰ� �� ���Ŀ� �ڵ�
		return result;
	}
}
