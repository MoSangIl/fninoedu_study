package stu.msi.comment.intercept;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		// request : 요청 -> session을 가지고 있음
		if(!request.getMethod().equalsIgnoreCase("POST")) {			
			if (request.getSession().getAttribute("id") == null) {
				response.sendRedirect("./login.chain");
				return false;
			}
			return true;
		}
		return true;
	}
	
}
