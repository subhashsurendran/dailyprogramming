package com.example.demo.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class MyControllerInterceptors implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest servletRequest,HttpServletResponse servletResponse,  Object handler) 
			throws Exception {
		
		return true;
				
		
	}
	@Override
	public void postHandle(HttpServletRequest servletRequest, HttpServletResponse servletResponse, Object handler, ModelAndView modelAndView) throws Exception
	{
		System.out.println("Subhash");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest servletRequest,HttpServletResponse servletResponse, Object handler, Exception exception) throws Exception
	{
		System.out.println("after completion method");
	}

}
