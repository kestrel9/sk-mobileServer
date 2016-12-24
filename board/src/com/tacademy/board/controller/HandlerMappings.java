package com.tacademy.board.controller;

import java.util.HashMap;

public class HandlerMappings {

	private HashMap<String, Controller> mappings = new HashMap<String, Controller>();
	public HandlerMappings() {
		init();
	}
	void init(){
		mappings.put("/hello.do", new HelloController());
		mappings.put("/tacademy.do", new TacademyController());
		mappings.put("/login.do", new LoginController());
		mappings.put("/logout.do", new LogoutController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/getBoardJson.do", new GetBoardJsonController());
		mappings.put("/getBoardListJson.do", new GetBoardListJsonController());
		mappings.put("/addBoard.do", new AddBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
	}
	public Controller getController(String url){
		return mappings.get(url);
	}

}
