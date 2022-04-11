package kr.co.soft.model;

import javax.servlet.http.HttpServletRequest;

public class TestController {
	
	public static int multi(HttpServletRequest request) {
		String str1=request.getParameter("data1");
		String str2=request.getParameter("data2");
		//형변환
		int number1=Integer.parseInt(str1);
		int number2=Integer.parseInt(str2);
		int result=number1*number2;
		
		return result;
		
	}

}
