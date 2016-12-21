<%@page import="com.google.gson.Gson"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tacademy.sam.vo.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	Product product = new Product();
	product.setCode("TA123");
	product.setName("모니터");
	product.setPrice(12000);
	ArrayList<Product> list = new ArrayList<Product>();
	list.add(new Product("TA111", "모니터1", 12000));
	list.add(new Product("TA112", "모니터2", 12000));
	list.add(new Product("TA113", "모니터3", 12000));
	list.add(new Product("TA114", "모니터4", 12000));
	list.add(new Product("TA115", "모니터5", 12000));
	
	Gson gson = new Gson();
	String result = gson.toJson(list);
	
	request.setAttribute("result", result);
	/* request.setAttribute("list", list); */
/* 	request.setAttribute("product", product);
	RequestDispatcher dispatcher = request.getRequestDispatcher("c2.jsp"); */
	/* RequestDispatcher dispatcher = request.getRequestDispatcher("c3.jsp"); */
	RequestDispatcher dispatcher = request.getRequestDispatcher("c4.jsp");
	dispatcher.forward(request, response);
%>