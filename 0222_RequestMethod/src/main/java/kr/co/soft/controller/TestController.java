package kr.co.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1() {
		return "test1";
	}
	
	@RequestMapping(value = "/test2", method = RequestMethod.POST)
	public String test2() {
		return "test2";
	}
	//get과 post방식이 서로 다른결과로 응답할때
	@RequestMapping(value = "/test3", method = RequestMethod.GET)
	public String test3_get() {	
		return "test3";
	}
	
	@RequestMapping(value = "/test3", method = RequestMethod.POST)
	public String test3_post() {
		return "test3";
	}
	
	@GetMapping("/test4")
	public String test4() {
		return "test4";
	}
	
	@PostMapping("/test5")
	public String test5() {
		return "test5";
	}
	
	//get과 post방식이 서로 같은결과로 응답할때
	@RequestMapping(value = "/test6", method = {RequestMethod.GET, RequestMethod.POST})
	public String test6() {	
		return "test6";
	}
	
	//get과 post방식이 서로 다른결과로 응답할때
	@GetMapping("/test7")
	public String test7_get() {
		return "test7";
	}
	
	@PostMapping("/test7")
	public String test7_post() {
		return "test7";
	}

}
