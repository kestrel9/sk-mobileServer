<%@page import="com.tacademy.math.vo.Data"%>
<%@page import="com.tacademy.math.util.Calc"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Data d = new Data();
	d.setNum1(Integer.parseInt(request.getParameter("num1")));
	d.setNum2(Integer.parseInt(request.getParameter("num2")));

	d.setOpt(request.getParameter("opt"));

	Calc cal = new Calc();
	cal.doCalc(d);

	System.out.println(d);
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=d.getNum1() %><%=d.getOpt() %><%=d.getNum2() %> = <%=d.getResult() %>
</body>
</html>