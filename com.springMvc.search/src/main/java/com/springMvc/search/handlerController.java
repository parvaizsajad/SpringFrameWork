package com.springMvc.search;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class handlerController extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is pre handler controller");
		String search = request.getParameter("search");
		response.setContentType("test/html");
		PrintWriter writer = response.getWriter();
		if(search=="google") {
			writer.println("google");
			System.out.println(search);
			return true;
		}
			else {
				writer.println("invalid name"+search);
				System.out.println("invalid name");
				return false;
		}
	
	}

}
