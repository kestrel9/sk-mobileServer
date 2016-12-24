package com.tacademy.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tacademy.board.dao.MemberDAO;
import com.tacademy.board.vo.Member;

public class LoginController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "login.jsp";
		MemberDAO dao = new MemberDAO();
		Member vo = new Member();
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		
		dao.doLogin(vo);
		if(vo.getName() != null){
			HttpSession session = request.getSession(true);
			session.setAttribute("name", vo.getName());
			url ="getBoardList.do";
		}
		return url;
	}

}
