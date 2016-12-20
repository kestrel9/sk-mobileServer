<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
jsp 선언 예제<br>
<%!
	int cnt = 0;
%>
<%!
	void bb(int b, JspWriter out){
		try{
			out.println("aaa");
		}catch(Exception e){}
		
	
    }
%>
<%
	cnt++;
	bb(2, out);
	out.println("aaa");
%>
cnt : <%= cnt %><br>
</body>
</html>