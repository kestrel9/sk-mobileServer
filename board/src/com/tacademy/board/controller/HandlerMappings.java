package com.tacademy.board.controller;

import java.util.HashMap;

public class HandlerMappings {
	
	private HashMap<String, Controller> mappings = new HashMap<String, Controller>();

	public HandlerMappings() {
		init();
		// TODO Auto-generated constructor stub
	}
	void init(){
		mappings.put("/hello.do", new HelloController());
	}
	public Controller getController(String url){
		return mappings.get(url);
	}

}
