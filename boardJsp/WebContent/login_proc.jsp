<%@page import="com.tacademy.board.vo.Member"%>
<%@page import="com.tacademy.board.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// id, pw를 받아 성공하면 getBoardList.jsp로 이동
	//        DB 체크
	//			     실패하면 login.jsp로 이동
	MemberDAO dao = new MemberDAO();
	Member vo =new Member();
	vo.setId(request.getParameter("id"));
	vo.setPassword(request.getParameter("password"));
	
	dao.doLogin(vo);
	if(vo.getName() == null){
		response.sendRedirect("login.jsp");
	}else{
		session.setAttribute("name", vo.getName());
		response.sendRedirect("getBoardList.jsp");
	}
	
%>