package kr.co.soft.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
	
	@GetMapping("/test2")
	public String test2(Model model) {
		
		ArrayList<String> list=null;
		list.add("에러발생");
		
		return "test2";
	}
	/*
	@ExceptionHandler(java.lang.NullPointerException.class)
	private String exception2() {
		return "error2";

	}*/

}
