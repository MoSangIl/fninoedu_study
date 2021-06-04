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


@Aspect // pointcut과 adivse 가 선언되어 잇을 것이다!!
@Component
public class LoginAspect {
	private static final Logger logger = LoggerFactory.getLogger(LoginAspect.class);
	
	// 메소드 이름은 그냥 이름만 지어 줄 뿐임
	@Pointcut("execution(* stu.msi.comment.controller.CommentController.writeForm(..))")
	public void writeForm() {
		logger.info("LoginAspect의 writeForm()에 포인트컷 동작");
	}
	
	@Around("writeForm()")
	public Object human(ProceedingJoinPoint pjt) throws Throwable {
		// ProceedingJoinPoint 는 함수에 대한 인자를 받아온다.
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
			// WEB-INF 에 아래 jsp 파일은 함부러 접근이 안되기 때문에, 다시 요청을 보내주는 방법을 활요해야 한다.
			return "redirect:/login.chain";
		}
		
		// Controller의 메소드 실행
		Object result = pjt.proceed();
		
		// Controller의 메소드가 실행되고 난 이후에 코드
		return result;
	}
}
