<%@page import="com.tacademy.board.vo.Board"%>
<%@page import="com.tacademy.board.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//seq, title, content 내용을 받아 수정하고
	//getBoardList.jsp로 이동
	request.setCharacterEncoding("utf-8");
	BoardDAO dao = new BoardDAO();
	Board board = new Board();
	board.setSeq(request.getParameter("seq"));
	board.setTitle(request.getParameter("title"));
	board.setContent(request.getParameter("content"));
		
	dao.doUpdateBoard(board);
	response.sendRedirect("getBoardList.jsp");
%>