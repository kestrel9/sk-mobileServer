package com.tacademy.board.test;

import com.tacademy.board.dao.MemberDAO;
import com.tacademy.board.vo.Member;

public class MemberTest {

	public MemberTest() {
		MemberDAO dao = new MemberDAO();
		Member vo = new Member();
		vo.setId("aaa");
		vo.setPassword("aaaa");
		
		dao.doLogin(vo);
		
		System.out.println(vo);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MemberTest();

	}

}
