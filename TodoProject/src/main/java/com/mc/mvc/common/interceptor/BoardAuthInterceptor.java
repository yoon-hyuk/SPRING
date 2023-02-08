package com.mc.mvc.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import com.mc.mvc.common.code.ErrorCode;
import com.mc.mvc.common.exception.HandlableException;

public class BoardAuthInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession();

		String[] uriArr = request.getRequestURI().split("/");
		System.out.println(session.getAttribute("auth"));
		System.out.println(uriArr[2]);

		switch (uriArr[2]) {
		case "board-form":
			if (session.getAttribute("auth") == null)
				throw new HandlableException(ErrorCode.UNAUTHORIZED_REQUEST);
			break;
		case "upload":
			if (session.getAttribute("auth") == null)
				throw new HandlableException(ErrorCode.UNAUTHORIZED_REQUEST);
			break;

		default:
			break;
		}

		return true;
	}
}
