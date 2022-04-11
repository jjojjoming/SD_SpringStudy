package kr.co.soft.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		
		String data1=request.getParameter("data1");
		String data2=request.getParameter("data2");
		String [] data3=request.getParameterValues("data3");
		
		System.out.println("data1 : "+data1);
		System.out.println("data2 : "+data2);
		
		for(String str1:data3) {
			System.out.println("data3 : "+str1);
		}
		
		return "result";
	}
	
	@PostMapping("/test2")
  	public String test2(HttpServletRequest request) {
      	
      	String data1 = request.getParameter("data1");
      	String data2 = request.getParameter("data2");
      	String[] data3 = request.getParameterValues("data3");
      	/*
      	if(data3==null) {
      		data3 = new String[] {""};
      	}*/
      
      	System.out.println("data1 : "+data1);
      	System.out.println("data2 : "+data2);
      	
      	if(data3 != null) {
		      	for(String str1:data3) {
		      		System.out.println("data3 : "+str1);
			
		      		}
      	}
      	return "result";
	}
	
	//WebRequest는 HttpServletRequest의 모든 기능을 보유하고 API의 종속되지 않고 복합 페이지를 컨트럴해주는 서비스
	@GetMapping("/test3")
  	public String test3(WebRequest request) {
		
		String data1=request.getParameter("data1");
		String data2=request.getParameter("data2");
		String [] data3=request.getParameterValues("data3");
		
		System.out.println("data1 : "+data1);
		System.out.println("data2 : "+data2);
		
		for(String str1:data3) {
			System.out.println("data3 : "+str1);
		}
		
		
		return "result";
	}
	
	
	//반복되는 작업을 알아서 처리 /형변환이 가능함
	//@PathVariable String data1로 받아야 하지만 형변환 가능 => @PathVariable int data1
	@GetMapping("/test4/{data1}/{data2}/{data3}")
	public String test4(@PathVariable String data1, @PathVariable int data2, @PathVariable int data3) {
		
		System.out.println("data1 : "+data1);
		System.out.println("data2 : "+data2);
		System.out.println("data3 : "+data3);
		
		int add=data2+data3;
		System.out.println("add : "+ add);
		
		
		return "result";
	}
	
	  @GetMapping("/test5")
	  	public String test5(@RequestParam int data1, @RequestParam int data2, @RequestParam int[] data3) {
	      	
	    	System.out.println("data1 : "+data1);
	      	System.out.println("data2 : "+data2);
	      	
	      	for(int data:data3) {
	      		System.out.println("data3 : "+data);
	      	  }
	    
	    return "result";
	  }
	  //데이터를 다 받지 않아도 됨(넘겨주지 않은 데이터는 받을수 없음)
	  @GetMapping("/test6")
	  	public String test6(@RequestParam (value = "data1") int value1,@RequestParam(value="data3") int[] value3) {
	      	
	    	System.out.println("data1 : "+value1);
	      	for(int data:value3) {
	      		System.out.println("data3 : "+data);
	      	  }
	    
	    return "result";
	  }
	  
	//존재하지 않는 데이터 오류방지 String null/ int 0
	  @GetMapping("/test7")
	  	public String test7(@RequestParam int data1, @RequestParam (required = false) String data2, 
	  								@RequestParam (defaultValue = "0") int data3) {
	      	
	    	System.out.println("data1 : "+data1);
	    	System.out.println("data2 : "+data2);
	    	System.out.println("data3 : "+data3);
	      	
	    
	    return "result";
	  }
	  
	  
}
