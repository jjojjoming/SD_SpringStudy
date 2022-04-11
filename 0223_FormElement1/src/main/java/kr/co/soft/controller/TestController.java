package kr.co.soft.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.soft.beans.DataBean;





//컨트롤러 지정
@Controller
public class TestController {
	

	//model은 담아서 간다
	@GetMapping("/test1")//@model 에트리부트 생략
	public String test1(DataBean bean) {
		bean.setA1("data1");
		bean.setA2("홍길동");
		bean.setA3("12345");
		bean.setA4("서울시 종로구");
		
		return "test1";
	}
	


}
