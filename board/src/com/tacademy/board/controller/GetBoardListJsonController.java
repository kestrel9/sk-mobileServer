package com.tacademy.board.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.tacademy.board.dao.BoardDAO;
import com.tacademy.board.vo.Board;
import com.tacademy.board.vo.BoardListResult;

public class GetBoardListJsonController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		BoardDAO dao = new BoardDAO();
		BoardListResult list = new BoardListResult();
		
		Gson gson = new Gson();
		list.setCount(dao.getBoardList().size());
		list.setStatus("success");
		list.setList(dao.getBoardList());
		String result = gson.toJson(list);
		request.setAttribute("result", result);
		
		return "result.jsp";
	}

}
