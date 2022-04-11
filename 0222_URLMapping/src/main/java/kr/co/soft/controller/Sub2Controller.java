package kr.co.soft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Sub2Controller {
	
	@RequestMapping(value = "/sub2/test5", method = RequestMethod.GET)
	public String sub1Test5() {
		
		return "sub2/test5";
	}
	
	@RequestMapping(value = "/sub2/test6", method = RequestMethod.GET)
	public String sub1Test6() {
		
		return "sub2/test6";
	}

}
