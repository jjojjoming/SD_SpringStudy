package kr.co.soft.controller;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.soft.beans.DataBean1;
import kr.co.soft.beans.DataBean2;
import kr.co.soft.beans.DataBean3;
import kr.co.soft.beans.DataBean4;


@Controller
public class TestController {
	
	//type으로 주입
	@Autowired
	DataBean1 requestBean1;
	
	//name으로 주입
	@Resource(name="requestBean2")
	DataBean2 requestBean2;
	
	//type으로 주입(component)
	@Autowired
	DataBean3 requestBean3;
	
	//name으로 주입
	@Resource(name="requestBean4")
	DataBean4 requestBean4;
	
	//========================================================
	
	@GetMapping("/test1")
	public String test1() {
		
		requestBean1.setData1("Autowired");
		requestBean1.setData2("주입");
		
		requestBean2.setData3("Resource");
		requestBean2.setData4("주입");
		
		requestBean3.setData5("component");
		requestBean3.setData6("주입");
		
		requestBean4.setData7("component/Resource");
		requestBean4.setData8("주입");
		
		return "forward:/result1"; 
	
	}
	
	@GetMapping("/result1")
	public String result1(Model model) {
		//request영역에 저장된 것이 아니므로 view까지 응답을 줄수는 없다 그러므로 Model에 담아서 넘겨준다.
		System.out.println("requestBean1.data1 : "+requestBean1.getData1());
		System.out.println("requestBean1.data2 : "+requestBean1.getData2());
		
		System.out.println("requestBean2.data1 : "+requestBean2.getData3());
		System.out.println("requestBean2.data2 : "+requestBean2.getData4());
		
		System.out.println("requestBean3.data1 : "+requestBean3.getData5());
		System.out.println("requestBean3.data2 : "+requestBean3.getData6());
		
		System.out.println("requestBean4.data1 : "+requestBean4.getData7());
		System.out.println("requestBean4.data2 : "+requestBean4.getData8());
		
		//request영역에 저장
		model.addAttribute("requestBean1",requestBean1);
		model.addAttribute("requestBean2",requestBean2);
		model.addAttribute("requestBean3",requestBean3);
		model.addAttribute("requestBean4",requestBean4);
		
		
		return "result1"; 
	
	}
	
	
}
