<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
상품리스트 <br>
<table border=1>
	<tr>
		<th>상품명</th>
		<th>코드</th>
		<th>가격</th>
	</tr>
	<c:forEach var="product" items="${list }">
	<tr>
		<td>${product.name }</td>
		<td>${product.code }</td>
		<td>${product.price }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>