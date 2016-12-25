package org.tacademy.webdata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.tacademy.webdata.vo.Condition;
import org.tacademy.webdata.vo.Product;

public class ProductDAO {

	public ProductDAO() {
		// TODO Auto-generated constructor stub
	}
	
	private static final String SCH_ALL_SQL = "select * from product;";
	private static final String SCH_TITLE_SQL = "select * from product where title = ?;";
	private static final String SCH_ALL_CON_SQL = "select * from product where category = ?;";
	private static final String SCH_TITLE_CON_SQL = "select * from product where title = ? and category = ?;";
	
	public ArrayList<Product> doSearchTitleConditon(Condition condition){
		ArrayList<Product> list = new ArrayList<Product>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rst = null;
		
		
		try{
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(SCH_TITLE_CON_SQL);
			stmt.setString(1, condition.getKey());
			stmt.setString(2, condition.getCategory());
			
			rst = stmt.executeQuery();
			
			Product product = null;
			while(rst.next()){
				product = new Product();
				product.setTitle(rst.getString("title"));
				product.setCount(rst.getString("count"));
				product.setPrice(rst.getInt("price"));
				product.setImage(rst.getString("image"));
				product.setCategory(rst.getString("category"));
				list.add(product);
			}

		}catch(SQLException e){
			System.out.println("check e : " + e);
			
		}finally{
			JDBCUtil.close(rst, stmt, conn);
		}
		
		return list;
	}
	
	public ArrayList<Product> doSearchALLConditon(Condition condition){
		ArrayList<Product> list = new ArrayList<Product>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rst = null;
		
		
		try{
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(SCH_ALL_CON_SQL);
			stmt.setString(1, condition.getCategory());
			
			rst = stmt.executeQuery();
			
			Product product = null;
			while(rst.next()){
				product = new Product();
				product.setTitle(rst.getString("title"));
				product.setCount(rst.getString("count"));
				product.setPrice(rst.getInt("price"));
				product.setImage(rst.getString("image"));
				product.setCategory(rst.getString("category"));
				list.add(product);
			}

		}catch(SQLException e){
			System.out.println("check e : " + e);
			
		}finally{
			JDBCUtil.close(rst, stmt, conn);
		}
		
		return list;
	}
	
	public ArrayList<Product> doSearchTitle(Condition condition){
		ArrayList<Product> list = new ArrayList<Product>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rst = null;
		
		
		try{
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(SCH_TITLE_SQL);
			stmt.setString(1, condition.getKey());
			
			rst = stmt.executeQuery();
			
			Product product = null;
			while(rst.next()){
				product = new Product();
				product.setTitle(rst.getString("title"));
				product.setCount(rst.getString("count"));
				product.setPrice(rst.getInt("price"));
				product.setImage(rst.getString("image"));
				product.setCategory(rst.getString("category"));
				list.add(product);
			}

		}catch(SQLException e){
			System.out.println("check e : " + e);
			
		}finally{
			JDBCUtil.close(rst, stmt, conn);
		}
		
		return list;
	}
	
	public ArrayList<Product> doSearchALL(){
		ArrayList<Product> list = new ArrayList<Product>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rst = null;
		
		
		try{
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(SCH_ALL_SQL);
			rst = stmt.executeQuery();
			Product product = null;
			while(rst.next()){
				product = new Product();
				product.setTitle(rst.getString("title"));
				product.setCount(rst.getString("count"));
				product.setPrice(rst.getInt("price"));
				product.setImage(rst.getString("image"));
				product.setCategory(rst.getString("category"));
				list.add(product);
			}

		}catch(SQLException e){
			System.out.println("check e : " + e);
			
		}finally{
			JDBCUtil.close(rst, stmt, conn);
			
		}
		
		return list;
	}

}
