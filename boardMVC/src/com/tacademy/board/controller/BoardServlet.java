package com.tacademy.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.tacademy.board.dao.BoardDAO;
import com.tacademy.board.vo.Board;
import com.tacademy.board.vo.BoardListResult;
import com.tacademy.board.vo.Result;

/**
 * Servlet implementation class BoardServlet
 */
@WebServlet("/BoardServlet")
public class BoardServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch(action){
		case "addBoard" :
			doAddBoard(request, response);
			break;
		case "getBoard" :
			doGetBoard(request, response);
			break;
		case "updateBoard":
			doUpdateBoard(request, response);
			break;
		case "getBoardList":
			doGetBoardList(request, response);
			break;
		case "deleteBoard":
			doDeleteBoard(request, response);
			
		}
		
	}
	
	protected void doGetBoardList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();
		BoardListResult rstList = new BoardListResult();
		ArrayList<Board> list = dao.getBoardList();
		
		request.setAttribute("list", list);
		String url = "getBoardList.jsp";
		
		String format = request.getParameter("format");
		if("json".equals(format)){
			Gson gson = new Gson();
			url = "result.jsp";
			rstList.setCount(list.size());
			rstList.setStatus("success");
			rstList.setList(list);
			String result = gson.toJson(rstList);
			request.setAttribute("result", result);
		}else{
			
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}
	
	
	protected void doDeleteBoard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardDAO dao = new BoardDAO();
		Board board = new Board();
		board.setSeq(request.getParameter("seq"));
			
		dao.doDeleteBoard(board);
		
		String format = request.getParameter("format");
		if("json".equals(format)){
			Gson gson = new Gson();
			Result rst = new Result();
			rst.setStatus("success");
			String result = gson.toJson(rst);
			request.setAttribute("result", result);
			RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
			dispatcher.forward(request, response);
		}else{
			response.sendRedirect("board?action=getBoardList");
		}
		
	}
	
	protected void doUpdateBoard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardDAO dao = new BoardDAO();
		Board board = new Board();
		board.setSeq(request.getParameter("seq"));
		board.setTitle(request.getParameter("title"));
		board.setContent(request.getParameter("content"));
		
		
		
		dao.doUpdateBoard(board);
		String format = request.getParameter("format");
		if("json".equals(format)){
			Gson gson = new Gson();
			Result rst = new Result();
			rst.setStatus("success");
			String result = gson.toJson(rst);
			request.setAttribute("result", result);
			RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
			dispatcher.forward(request, response);
		}else{
			response.sendRedirect("board?action=getBoardList");
		}

	}
	
	protected void doAddBoard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();
		Board vo = new Board();
			
		vo.setTitle(request.getParameter("title"));
		vo.setWriter(request.getParameter("writer"));
		vo.setContent(request.getParameter("content"));
			
		dao.doInsertBoard(vo);
			
		response.sendRedirect("board?action=getBoardList");
	}
	
	protected void doGetBoard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO dao = new BoardDAO();
		Board board = new Board();
		String format = request.getParameter("format");
		String url = "getBoard.jsp";
		
		board.setSeq(request.getParameter("seq"));
		dao.getBoard(board);
		
		if("json".equals(format)){
			Gson gson = new Gson();
			String result = gson.toJson(board);
			request.setAttribute("result", result);
			url = "result.jsp";
		}else{
			request.setAttribute("board", board);
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
