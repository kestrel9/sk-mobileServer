<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
JDBC 테스트 <br>
<%
try{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("로딩 성공");
}catch(ClassNotFoundException e){
	System.out.println("로딩 e : " + e);
	return;
}

//2.DB 접속
String jdbcURL = "jdbc:mysql://127.0.0.1:3306/db_tacademy";
String jdbcId = "root";
String jdbcpw = "1234";

String account = "hhhh";
String pw = "3333";
String address = "충북";
String phoneno = "000-222-5555";

String sql = "select * from tbl_account;";
//String sql = "insert into tbl_account (account, password, address, phoneno)	values (?, ?, ?, ?);";
//String sql = "insert into tbl_account (account, password, address, phoneno)	values ('qqqq', '1111', '강원', '500-0444-0022');";

Connection conn = null;
//Statement stmt = null;
PreparedStatement stmt = null;
ResultSet rst = null;

try{
	conn = DriverManager.getConnection(jdbcURL, jdbcId, jdbcpw);
	System.out.println("접속 성공");
	stmt = conn.prepareStatement(sql);
	stmt.executeQuery();
	rst = stmt.executeQuery();
	while(rst.next()){
		out.print(rst.getInt(1) + "\t");
		out.print(rst.getString("account") + "\t");
		out.print(rst.getString("address") + "<br>");
	}
	
	
//	stmt.setString(1, account);
//	stmt.setString(2, pw);
//	stmt.setString(3, address);
//	stmt.setString(4, phoneno);
//	
//	int cnt = stmt.executeUpdate(); //prepare statement에서 이미 sql문 정의해서 인자가 없어야함
////	int cnt = stmt.executeUpdate(sql); //영향받은 행의 갯수 반환
//	if(cnt == 1){
//		System.out.println("insert success");
	
}catch(SQLException e){
	System.out.println("오류 : " + e);
}finally{
	
	if(rst != null){
		try{
			rst.close();
		}catch (SQLException e) {
			// TODO: handle exception
		}
	}
	
	
	
	if(stmt != null){
		try{
			stmt.close();
		}catch (SQLException e) {
			// TODO: handle exception
		}
	}
	
	if(conn == null){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
%>
</body>
</html>