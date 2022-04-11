package kr.co.soft.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1() {
		return "test1";
		
	}
	
	//============================
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		
		//data저장
		//HttpServletRequest : setAttribute등록
		request.setAttribute("data1", 100);
		request.setAttribute("data2", 200);
		
		return "test2";
		
	}
	
	@GetMapping("/test3")
	public String test3(Model model) {
		
		//Model 객체로 셋팅시 HttpServletRequest 객체에 담겨서 전달됨
		//HttpServletRequest : setAttribute등록
		model.addAttribute("data1",300);
		model.addAttribute("data2",400);
		
		
		return "test3";
		
	}
	
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv) {
		
		//Model 객체로 셋팅시 HttpServletRequest 객체에 담겨서 전달됨
		//HttpServletRequest : setAttribute등록
		mv.addObject("data1",500);
		mv.addObject("data2",600);
		//View의 이름 지정
		mv.setViewName("test4");
		
		
		return mv;
		
	}
	
	  
}











