package kr.co.soft.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.soft.beans.DataBean1;



@Controller
@SessionAttributes({"sessionBean1", "sessionBean2"}) //요청이 발생되면 sessionBean1, sessionBean2메소드를 찾
public class TestController {
	/*
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		
		HttpSession session=request.getSession();
		session.setAttribute("data1", "문자1");
		
		return "test1";
	}
	
	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		
		HttpSession session=request.getSession();
		String data1=(String)session.getAttribute("data1");
		System.out.println("data1 : "+ data1);
		
		return "result1";
	}
	*/
	
	@GetMapping("/test1")
	//HttpSession session를 매개변수로 하여 영역을 확보
	public String test1(HttpSession session) {
		
		session.setAttribute("data1", "문자1");
		
		return "test1";
	}
	
	@GetMapping("/test2")
	//HttpSession session를 매개변수로 하여 영역을 확보
	public String test2(HttpSession session) {
		
		session.setAttribute("data1", "문자1");
		
		return "redirect:/result1";
	}
	
	@GetMapping("/test3")
	//HttpSession session를 매개변수로 하여 영역을 확보
	public String test3(HttpSession session) {
		
		session.setAttribute("data1", "문자1");
		
		return "forward:/result1";
	}
	
	
	@GetMapping("/result1")
	public String result1(HttpSession session) {
	
		String data1=(String)session.getAttribute("data1");
		System.out.println("data1 : "+ data1);
		
		return "result1";
	}
	
	//====================DataBean1========================
	@GetMapping("/test4")
	//HttpSession session를 매개변수로 하여 영역을 확보
	public String test4(HttpSession session) {
		
		DataBean1 bean1=new DataBean1();
		bean1.setData1("점심시간");
		bean1.setData2("맛점");
		
		session.setAttribute("bean1", bean1);
		
		return "test4";
	}
	
	/*
	@GetMapping("/result4")
	public String result4(HttpSession session) {
	
		
		DataBean1 bean1=(DataBean1)session.getAttribute("bean1");
		
		System.out.println("bean1.data1 : "+ bean1.getData1());
		System.out.println("bean1.data2 : "+ bean1.getData2());
		
		return "result4";
	}*/
	
	@GetMapping("/result4")
	public String result4(@SessionAttribute("bean1") DataBean1 bean1) {
	
		System.out.println("bean1.data1 : "+ bean1.getData1());
		System.out.println("bean1.data2 : "+ bean1.getData2());
		
		return "result4";
	}
	
	//==========================================
	
	@ModelAttribute("sessionBean1") //메서드로 빈 객체 생성
	public DataBean1 sessionBean1() {
		return new DataBean1();
	}
	
	@ModelAttribute("sessionBean2") //메서드로 빈 객체 생성
	public DataBean1 sessionBean2() {
		return new DataBean1();
	}
	
	@GetMapping("/test5")
	public String result(@ModelAttribute("sessionBean1") DataBean1 sessionBean1, 
						@ModelAttribute("sessionBean2") DataBean1 sessionBean2) {
	
		sessionBean1.setData1("점심시간");
		sessionBean1.setData2("맛점");
		
		sessionBean2.setData1("오전수업");
		sessionBean2.setData2("종료");
		
		return "result5";
	}
	
	@GetMapping("/result5")
	public String result5(@ModelAttribute("sessionBean1") DataBean1 sessionBean1, 
							@ModelAttribute("sessionBean2") DataBean1 sessionBean2) {
	
		System.out.println("sessionBean1.data1 : "+ sessionBean1.getData1());
		System.out.println("sessionBean1.data2 : "+ sessionBean1.getData2());
		
		System.out.println("sessionBean2.data1 : "+ sessionBean2.getData1());
		System.out.println("sessionBean2.data2 : "+ sessionBean2.getData2());
		
		return "result5";
	}
}
