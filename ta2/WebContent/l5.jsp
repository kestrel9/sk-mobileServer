<%@page import="com.tacademy.vo.Data"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="data" class="com.tacademy.vo.Data" scope="session"></jsp:useBean>
<jsp:setProperty property="name" name="data"/>

<%
	/* RequestDispatcher dispatcher = request.getRequestDispatcher("l6.jsp");
	dispatcher.forward(request, response); */
	response.sendRedirect("l6.jsp");
%>