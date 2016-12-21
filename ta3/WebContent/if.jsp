<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>최대값 구하기</title>
</head>
<body>
최대값:
<c:if test="${param.NUM1 - param.NUM2 >= 0 }">
	${param.NUM1 }
</c:if>
<c:if test="${param.NUM1 - param.NUM2 < 0 }">
	${param.NUM2 }
</c:if>
<c:choose>
	<c:when test="${param.NUM == 0 }">
		일본어 <br>
	</c:when>
	<c:when test="${param.NUM == 1 }">
		중국어 <br>
	</c:when>
	<c:otherwise>
		한국어 <br>
	</c:otherwise>
</c:choose>
<c:forEach var="cnt" begin="1" end="9">
	${param.NUM1 } * ${cnt } = ${param.NUM1 * cnt } <br>
</c:forEach>
</body>
</html>