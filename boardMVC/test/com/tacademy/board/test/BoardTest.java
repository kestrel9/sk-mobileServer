package com.tacademy.board.test;

import java.util.ArrayList;

import com.tacademy.board.dao.BoardDAO;
import com.tacademy.board.vo.Board;

public class BoardTest {

	public BoardTest() {
		BoardDAO dao = new BoardDAO();
		Board board = new Board();
		board.setSeq("3");
		
		dao.doDeleteBoard(board);
		
//		board.setTitle("변경된 타이틀");
//		board.setContent("변경된 content");
//		
//		dao.doUpdateBoard(board);
//		System.out.println(board);
//		
//		dao.getBoard(board);
//		
//		System.out.println(board);
//		
//		ArrayList<Board> list = dao.getBoardList();
//		
//		for(Board board : list){
//			System.out.println(board);
//		}
		
//		
//		BoardDAO dao = new BoardDAO();
//		Board vo = new Board();
//		
//		vo.setTitle("제목입니다");
//		vo.setWriter("글쓴이5");
//		vo.setContent("내용sdsffdsfddsada content 1234");
//		
//		dao.doInsertBoard(vo);
//		
//		System.out.println(vo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoardTest();

	}

}
