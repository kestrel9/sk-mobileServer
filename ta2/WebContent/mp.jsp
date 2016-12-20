<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if(id == null || pw == null){
		response.sendRedirect("login.html");
		return;
	} 
	if("abcd".equals(id) && "1234".equals(pw)){
		session.setAttribute("id", id);
		session.setAttribute("name", "kim");
		response.sendRedirect("ma.jsp");
		return;
	}else{
		response.sendRedirect("login.html");
		return;
	}
	
%>