package kr.co.soft.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.soft.beans.UserDataBean;


//컨트롤러 지정
@Controller
public class TestController {
	

	//model은 담아서 간다
	@GetMapping("/test1")//@model 에트리부트 생략
	public String test1(UserDataBean bean) {
		
		//UserDataBean 에 저장					
		bean.setUser_name("홍길동");
		bean.setUser_id("smile");
		bean.setUser_pw("12345");
		bean.setUser_postcode("04321");
		bean.setUser_address1("종로구");
		bean.setUser_address2("은평구");
		
		return "test1";
	}
	
	@PostMapping("/result")
	public String result() {		
		return "result";
	}
	
	//================================================
	//model은 담아서 간다
		@GetMapping("/test2")//@model 에트리부트 생략
		public String test2(UserDataBean bean) {			
			//UserDataBean 에 저장					
			bean.setUser_name("홍길동");
			bean.setUser_id("joojoo");
			bean.setUser_pw("1234");
			bean.setUser_postcode("54321");
			bean.setUser_address1("강서구");
			bean.setUser_address2("강북구");
			
			return "test2";
		}
		
		//model은 담아서 간다
		@GetMapping("/test3")//모델에서 사용 (서버가 아님)
		public String test3(@ModelAttribute("testBean") UserDataBean bean) {
			
			//UserDataBean 에 저장					
			bean.setUser_name("장길산");
			bean.setUser_id("sul0808");
			bean.setUser_pw("12345");
			bean.setUser_postcode("98765"); 
			bean.setUser_address1("강서구");
			bean.setUser_address2("강북구");
			
			return "test3";
		}
		
		@GetMapping("/test4")//@model 에트리부트 생략
		//HttpServletRequest : dom 서버단에 저장
		
		public String test4(Model model) {
			
			UserDataBean bean=new UserDataBean();		
			//UserDataBean 에 저장				
			bean.setUser_name("장길산");
			bean.setUser_id("sul0808");
			bean.setUser_pw("12345");
			bean.setUser_postcode("55626"); 
			bean.setUser_address1("강서구");
			bean.setUser_address2("강북구");
							
			model.addAttribute("testBean2",bean);	//서버에 저장bean : 데이터베이스 객체
			
			return "test4";
		}


}
