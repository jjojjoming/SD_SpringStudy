package kr.co.soft.controller;



import javax.servlet.ServletContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import kr.co.soft.beans.DataBean1;

@Controller
public class TestController {
	
	//application 타입에 의한 주입
	@Autowired
	ServletContext application;
	
	//=======================================
	/*
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		
		ServletContext application=request.getServletContext();
		application.setAttribute("data1", "퇴근");
		
		return "test1";
	}
	
	
	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		
		 ServletContext application=request.getServletContext();
		 String data1=(String)application.getAttribute("data1");
		 System.out.println("data1"+data1);
		
		return "result1";
		
	}*/
	
	@GetMapping("/test1")
	public String test1() {
		
		//application.setAttribute("data1", "퇴근");
		DataBean1 bean1=new DataBean1();
		bean1.setData1("오늘 수업");
		bean1.setData2("끝입니다.");
		
		application.setAttribute("bean1", bean1);
		
		return "test1";
	}
	
	
	@GetMapping("/result1")
	public String result1() {
		
		 //String data1=(String)application.getAttribute("data1");
		// System.out.println("data1"+data1);
		
		DataBean1 bean1=(DataBean1)application.getAttribute("bean1");
		System.out.println("bean1.data1 : "+bean1.getData1());
		System.out.println("bean1.data2 : "+bean1.getData2());
		
		return "result1";
		
	}
}
