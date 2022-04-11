package kr.co.soft.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.soft.beans.DataBean;

@Controller
public class TestController {
	/*
	@PostMapping("/test1")
	public String test1(@ModelAttribute DataBean bean) {
		
		System.out.println("bean.data1 : "+bean.getData1());
		System.out.println("bean.data2 : "+bean.getData2());
		
		return "test1";
	}*/
	
	@PostMapping("/test1")
	public String test1(DataBean bean) {
		
		System.out.println("bean.data1 : "+bean.getData1());
		System.out.println("bean.data2 : "+bean.getData2());
		
		return "test1";
	}
	
	//이름을 지정할때는 @ModelAttribute 생략안됨
	@PostMapping("/test2")
	public String test2(@ModelAttribute("testBean") DataBean bean) {
		return "test2";
	}
	  
	  
}











