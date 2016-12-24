<%@page import="com.google.gson.Gson"%><%@page import="com.tacademy.board.vo.Board"%><%@page import="com.tacademy.board.dao.BoardDAO"%><%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%
	//지정된 seq에 해당한 board 레코드를 불러와서 보여주기
		BoardDAO dao = new BoardDAO();
		Board board = new Board();
		board.setSeq(request.getParameter("seq"));
		dao.getBoard(board);
		
		Gson gson = new Gson();
		
		String result = gson.toJson(board);
		out.println(result);
%>	
