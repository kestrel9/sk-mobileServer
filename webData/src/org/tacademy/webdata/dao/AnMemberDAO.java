package org.tacademy.webdata.dao;

import org.tacademy.webdata.vo.AnMember;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnMemberDAO {

	public AnMemberDAO() {
		// TODO Auto-generated constructor stub
	}
	
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	
	private static final String LOGIN_SQL = "select name from ANMEMBER where id = ? and pw = ?;";
	private static final String INSERT_SQL = "insert into ANMEMBER "
			+ "values(null, ?, ?, ?, ?, ?, ?, now() )";
	private static final String CHECK_SQL = "select id from anmember where id = ?;";
	
	public  void doCheck(AnMember member){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rst = null;
		try{
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(CHECK_SQL);
			stmt.setString(1, member.getId());
			rst = stmt.executeQuery();
			if(rst.next()){
				member.setName(rst.getString(1));
				member.setStatus(SUCCESS);
			}else{
				member.setStatus(FAIL);
			}
			
		}catch(SQLException e){
			System.out.println("check e : " + e);
			
		}finally{
			JDBCUtil.close(rst, stmt, conn);
			
		}
	}
	
	
	public  void doLogin(AnMember member){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rst = null;
		try{
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(LOGIN_SQL);
			stmt.setString(1, member.getId());
			stmt.setString(2, member.getPw());
			rst = stmt.executeQuery();
			if(rst.next()){
				member.setName(rst.getString(1));
				member.setStatus(SUCCESS);
			}else{
				member.setStatus(FAIL);
			}
		}catch(SQLException e){
			System.out.println("login e : " + e);
			
		}finally{
			JDBCUtil.close(rst, stmt, conn);
			
		}
	}
	
	public  void doInsert(AnMember member){

		Connection conn = null;
		PreparedStatement stmt = null;
		try{
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(INSERT_SQL);
			stmt.setString(1, member.getName());
			stmt.setString(2, member.getId());
			stmt.setString(3, member.getPw());
			stmt.setString(4, member.getTel());
			stmt.setString(5, member.getAddress());
			stmt.setString(6, member.getComment());
			int cnt = stmt.executeUpdate();
			
			if(cnt == 1){
				member.setStatus(SUCCESS);
			}else
			{
				member.setStatus(FAIL);
			}
		}catch(SQLException e){
			System.out.println("insert member error : " + e);
			
		}finally{
			JDBCUtil.close(stmt, conn);
			
		}
	}
	

}
