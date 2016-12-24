<%@page import="com.tacademy.board.vo.Board"%>
<%@page import="com.tacademy.board.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//넘어온 데이터를 board 테이블에 삽입 후 
	//getBoardList.jsp 로 이동
	request.setCharacterEncoding("utf-8");
	BoardDAO dao = new BoardDAO();
	Board vo = new Board();
		
	vo.setTitle(request.getParameter("title"));
	vo.setWriter(request.getParameter("writer"));
	vo.setContent(request.getParameter("content"));
		
	dao.doInsertBoard(vo);
		
	response.sendRedirect("getBoardList.jsp");
%>