package com.tacademy.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dispatcherservlet
 */
@WebServlet("/Dispatcherservlet")
public class Dispatcherservlet extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String uri = request.getRequestURI();
		uri = uri.substring(uri.lastIndexOf("/"));
		System.out.println("uri : " + uri);
		HandlerMappings mappings = new HandlerMappings();
		Controller controller = mappings.getController(uri);
		String url = "login.jsp";
		if(controller != null){
			 url = controller.handleRequest(request, response);
		}
		switch(url){
		case "login.jsp" :
			response.sendRedirect(url);
			break;
		case "getBoardList.do":
			response.sendRedirect(url);
			break;
		default :
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);
			break;
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
