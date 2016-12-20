<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String num1 = request.getParameter("num1");
	String num2 = request.getParameter("num2");
	int sum = 0;
	int su1 = Integer.parseInt(num1);
	int su2 = Integer.parseInt(num2);
	sum = su1 + su2;
	
	request.setAttribute("sum", sum);
	RequestDispatcher dispatcher = request.getRequestDispatcher("i2.jsp");
	dispatcher.forward(request, response);
	
%>