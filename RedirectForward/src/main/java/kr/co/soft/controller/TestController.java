package kr.co.soft.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1() {
		//브라우저에서 이동하므로 주소가 변경
		return "redirect:/sub1";
	}
	
	@GetMapping("/sub1")
	public String sub1() {
		//브라우저에서 이동하므로 주소가 변경
		return "sub1";

	}
	
	
	//======================forward====================
	
	@GetMapping("/test2")
	public String test2() {
		//서버에서 이동하므로 주소가 변경없음(즉 브라우저는 알수 없음)
		return "forward:/sub2";

	}
	
	@GetMapping("/sub2")
	public String sub2() {
		//서버에서 이동하므로 주소가 변경없음(즉 브라우저는 알수 없음)
		return "sub2";

	}
}
