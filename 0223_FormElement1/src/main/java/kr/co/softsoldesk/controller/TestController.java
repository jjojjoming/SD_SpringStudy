package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(DataBean bean) {
		bean.setA1("Soft");
		bean.setA2("홍길동");
		bean.setA3("12345");
		bean.setA4("서울시 종로구");
		
		return "test1";
		
	}

}
