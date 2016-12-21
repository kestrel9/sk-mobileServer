package com.tacademy.sam.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyRequestWrapper extends HttpServletRequestWrapper {

	public MyRequestWrapper(HttpServletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getParameter(String name) {
		String str = super.getParameter(name);
		if(str != null){
			str = str.toUpperCase();
		}
		if("tel".equals(name)){
			if(str == null){
				str = "999-9999-9999";
			}
		}
		return str;
	}
	

}
