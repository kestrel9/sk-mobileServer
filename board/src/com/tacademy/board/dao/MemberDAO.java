package com.tacademy.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tacademy.board.vo.Member;

public class MemberDAO {

	public MemberDAO() {
		// TODO Auto-generated constructor stub
	}
	String loginSQL = "select name from member where id = ? and password = ?;";
	public  void doLogin(Member member){
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rst = null;
		try{
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(loginSQL);
			stmt.setString(1, member.getId());
			stmt.setString(2, member.getPassword());
			rst = stmt.executeQuery();
			if(rst.next()){
				member.setName(rst.getString(1));
			}
				
		}catch(SQLException e){
			System.out.println("login e : " + e);
			
		}finally{
			JDBCUtil.close(rst, stmt, conn);
			
		}
	}

}
