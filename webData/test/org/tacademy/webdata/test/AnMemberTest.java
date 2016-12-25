package org.tacademy.webdata.test;

import org.tacademy.webdata.dao.AnMemberDAO;
import org.tacademy.webdata.vo.AnMember;

public class AnMemberTest {

	public AnMemberTest() {
		AnMember vo = new AnMember();
		AnMemberDAO dao = new AnMemberDAO();
		
		
		vo.setId("abc");
		
		dao.doCheck(vo);
		
//		vo.setPw("111");
		
//		dao.doLogin(vo);
		
//		vo.setName("내이름");
//		vo.setAddress("우리집");
//		vo.setTel("010-0000-000");
//		vo.setComment("테스트");
		
		
		
//		dao.doInsert(vo);
		
		System.out.println(vo);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnMemberTest();
	}

}
