<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//세션 정보를 삭제한 후 login.jsp로 이동
	session.invalidate();
	response.sendRedirect("login.jsp");
%>