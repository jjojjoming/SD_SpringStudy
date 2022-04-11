package kr.co.soft.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import kr.co.soft.beans.DataBean1;


@Controller
public class TestController {
	
	//==================redirect와forward/========================
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		request.setAttribute("data1", "문자1");
		
		//return "redirect:/result1"; //새로운 요청 정보에 의해서 request소멸 => null값 반환
		return "forward:/result1"; //브라우저에서 생성되는 것이 아니므로 결과값은 반환되고 다시 result1에 전달됨(최종값까지 반환됨)
	
	}
	
	//redirect로 넘겼으므로 setAttribute의 data1에는 데이터가 소멸되고 없음=>반환값 없음
	@GetMapping("/result1")
	public String sub1(HttpServletRequest request) {
		
		String data1=(String)request.getAttribute("data1");
		System.out.println("data1 : "+data1);
		
		return "result1";
	
	}
	
	//===============Model=================
	
	@GetMapping("/test2")
	public String test2(Model model) {
	
		
		model.addAttribute("data2","문자2");
		
		return "forward:/result2";
	
	}
	/*
	@GetMapping("/result2")
	public String sub2(Model model) {
		//Model에서 model로는 전달이 안됨
		String data2=(String)model.getAttribute("data2");
		System.out.println("data2 : "+data2);
		return "result2";
	
	}*/
	
	@GetMapping("/result2")
	public String sub2(HttpServletRequest request) {
		
		String data2=(String)request.getAttribute("data2");
		System.out.println("data2 : "+data2);

		return "result2";
	
	}
	
	//============ModelAndView===============
	
		@GetMapping("/test3")
		public ModelAndView test3(ModelAndView mv) {
		
			mv.addObject("data3","문자3");
			mv.setViewName("forward:/result3");
			
			return mv;
		}
		
		@GetMapping("/result3")
		public String result3(HttpServletRequest request) {
			
			String data3=(String)request.getAttribute("data3");
			System.out.println("data3 : "+data3);

			return "result3";
		
		}
		
 // ===============DataBean1_Model=======================
		
		@GetMapping("/test4")
		public String test4(Model model) {
			
			DataBean1 bean=new DataBean1();
			bean.setData1("정보처리기사");
			bean.setData2("특강");
			//request 에 저장
			model.addAttribute("bean",bean);
			return "forward:/result4";
		}
		
		@GetMapping("/result4")
		public String result4(HttpServletRequest request) {
			
			DataBean1 bean=(DataBean1)request.getAttribute("bean");
			System.out.println("bean.data1 : "+bean.getData1());
			System.out.println("bean.data2 : "+bean.getData2());
			
			return "result4";
		
		}
		
		//=========================DataBean1_ModelAttribute=============================
		
		@GetMapping("/test5")
		public String test5(@ModelAttribute("bean1") DataBean1 bean1) {
			
			bean1.setData1("리눅스");
			bean1.setData2("특강");
		
			return "forward:/result5";
		}
		/*
		@GetMapping("/result5")
		//새로운 객체 주입으로 인하여 request에 저장된 데이터를 받아오지 못함 null값 출력
		public String result5(@ModelAttribute("bean1") DataBean1 bean1) {
			
			System.out.println("bean.data1 : "+bean1.getData1());
			System.out.println("bean.data2 : "+bean1.getData2());
			
			return "result5";
		
		}*/
		
		@GetMapping("/result5")
		//새로운 객체 주입으로 인하여 request에 저장된 데이터를 받아오지 못함 null값 출력
		public String result5(HttpServletRequest request	) {
			
			
			DataBean1 bean1=(DataBean1)request.getAttribute("bean1");
			
			System.out.println("bean.data1 : "+bean1.getData1());
			System.out.println("bean.data2 : "+bean1.getData2());
			
			return "result5";
		
		}
	
}
