package com.wx.filter;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.wx.inter.InterTestCase;

public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		try {
			Method[] method = this.getClass().getClassLoader().loadClass("com.wx.controller.MyController").getDeclaredMethods();
			for (Method m : method) {
				if(m.isAnnotationPresent(InterTestCase.class)){
					InterTestCase a = m.getAnnotation(InterTestCase.class);
					System.out.println("================>"+a.code());
				}
			}
		} catch (SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		
	}

}
