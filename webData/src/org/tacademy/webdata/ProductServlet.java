package org.tacademy.webdata;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tacademy.webdata.dao.ProductDAO;
import org.tacademy.webdata.vo.Condition;
import org.tacademy.webdata.vo.Product;
import org.tacademy.webdata.vo.Result;

import com.google.gson.Gson;
import com.google.gson.JsonSerializer;
import com.sun.org.apache.bcel.internal.generic.DADD;

import net.sf.json.JSONSerializer;
import net.sf.json.xml.XMLSerializer;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "result.jsp";
		
		doSearch(request, response);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}
	
	protected void doSearch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Product vo = new Product();
		ProductDAO dao = new ProductDAO();
		ArrayList<Product> list = new ArrayList<Product>();
		String key = request.getParameter("key");
		String category = request.getParameter("category");
		String type = request.getParameter("type");
		Result rst = new Result();
		
		Condition cn = new Condition();
		cn.setKey(key);
		cn.setCategory(category);
		
		if("empty".equals(key)){
			switch(category){
			case "0" :
				list = dao.doSearchALL();
				break;
			case "1" :
			case "2" :
				list = dao.doSearchALLConditon(cn);
				break;
				default:
					list = dao.doSearchALL();
					break;
			}
		}else{
			switch(category){
			case "0" :
				list = dao.doSearchTitle(cn);
				break;
			case "1" :
			case "2" :
				list = dao.doSearchTitleConditon(cn);
				break;
			default:
				list = dao.doSearchALL();
				break;
			}
		}
		rst.setpList(list);
		rst.setCount(list.size());
		rst.setStatus("success");
		
		Gson gson = new Gson();
		
		if("0".equals(type)){
			request.setAttribute("result", gson.toJson(rst));
		}else if("1".equals(type)){
			request.setAttribute("result", gson.toJson(rst));
//			String xml = new XMLSerializer().write(JSONSerializer.toJSON(rst));
//			request.setAttribute("result", xml);
		}
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
	

}
