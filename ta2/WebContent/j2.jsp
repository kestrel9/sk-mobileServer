<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
쿠키 리스트<br>
<%
	Cookie [] cookies = request.getCookies();
	if(cookies == null){
		%>
		쿠키 항목이 없습니다.
		<%
	}
	else{
		for(Cookie c : cookies){
			%>
			이름 : <%=c.getName() %> 값 : <%=c.getValue() %><br>
			<%
			
		}
	}
%>
</body>
</html>