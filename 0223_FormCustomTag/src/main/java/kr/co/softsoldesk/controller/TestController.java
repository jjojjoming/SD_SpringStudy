package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.UserDataBean;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(UserDataBean bean) {
		
		bean.setUser_name("홍길동");
		bean.setUser_id("soldesk");
		bean.setUser_pw("12345");
		bean.setUser_postcode("11000");
		bean.setUser_address1("서울시 종로구");
		bean.setUser_address2("서울시 강서구");
		
		
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(UserDataBean bean) {
		
		bean.setUser_name("김유신");
		bean.setUser_id("soldesk2");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12345");
		bean.setUser_address1("경기도 고양시");
		bean.setUser_address2("서울시 강북구");
		
		
		return "test2";
	}
	
	//testBean이라는 이름으로 정의하여 주입
	@GetMapping("/test3")
	public String test3(@ModelAttribute("testBean") UserDataBean bean) {
		
		bean.setUser_name("길동무");
		bean.setUser_id("soldesk2");
		bean.setUser_pw("1234");
		bean.setUser_postcode("12000");
		bean.setUser_address1("서울시 마포구");
		bean.setUser_address2("서울시 동작구");
		
		return "test3";
		
	}
	@GetMapping("/test4")
	public String test4(Model model) {
		
		UserDataBean bean=new UserDataBean();
		
		bean.setUser_name("홍길동");
		bean.setUser_id("soldesk3");
		bean.setUser_pw("1234");
		bean.setUser_postcode("14000");
		bean.setUser_address1("서울시 마포구");
		bean.setUser_address2("서울시 동작구");
		//Model의 객체로 저장
		model.addAttribute("test_user2",bean);
		return "test4";
		
	}
	
	@PostMapping("/result")
	public String result() {
		return "result";
	}

}
