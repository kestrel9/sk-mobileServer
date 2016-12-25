package org.tacademy.webdata;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.tacademy.webdata.dao.AnMemberDAO;
import org.tacademy.webdata.vo.AnMember;

import com.google.gson.Gson;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String url = "result.jsp";
		
		if("login".equals(request.getParameter("action"))){
			doLogin(request, response);
		}else if("insert".equals(request.getParameter("action"))){
			doInsert(request, response);
		}else if("check".equals(request.getParameter("action"))){
			doCheck(request, response);
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
//		doGet(request, response);
	}
	
	protected void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		AnMember vo = new AnMember();
		AnMemberDAO dao = new AnMemberDAO();
		Gson gson = new Gson();
		
		vo.setId(request.getParameter("id"));
		vo.setPw(request.getParameter("pw"));
		
		dao.doLogin(vo);
		
		if(vo.getStatus() == FAIL){
			request.setAttribute("result", gson.toJson(FAIL));
		}else{
//			HttpSession session = request.getSession(true);
//			session.setAttribute("name", vo.getName());
			request.setAttribute("result", gson.toJson(vo.getName()));
		}
		
		
	}
	
	protected void doInsert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		AnMember vo = new AnMember();
		AnMemberDAO dao = new AnMemberDAO();
		Gson gson = new Gson();
		
		vo.setId(request.getParameter("id"));
		vo.setPw(request.getParameter("pw"));
		vo.setName(request.getParameter("name"));
		vo.setTel(request.getParameter("tel"));
		vo.setAddress(request.getParameter("address"));
		vo.setComment(request.getParameter("comment"));
		
		dao.doInsert(vo);
		
		if(vo.getStatus() == FAIL){
			request.setAttribute("result", gson.toJson(FAIL));
		}else{
//			HttpSession session = request.getSession(true);
//			session.setAttribute("name", vo.getName());
			request.setAttribute("result", gson.toJson(vo.getName()));
		}
		
		
		

	}
	protected void doCheck(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		AnMember vo = new AnMember();
		AnMemberDAO dao = new AnMemberDAO();
		Gson gson = new Gson();
		
		vo.setId(request.getParameter("id"));
		
		dao.doCheck(vo);
		
		if(vo.getStatus() != FAIL){
			request.setAttribute("result", gson.toJson(FAIL));
		}else{
//			HttpSession session = request.getSession(true);
//			session.setAttribute("name", vo.getName());
			
			request.setAttribute("result", gson.toJson(vo.getName()));
		}
		
		
	}

}
