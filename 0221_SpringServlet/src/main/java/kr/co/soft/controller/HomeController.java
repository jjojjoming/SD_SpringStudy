package kr.co.soft.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.soft.model.TestController;


@WebServlet("*.mvc")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		//System.out.println("HomeController");
		String url=request.getRequestURI();
		String viewName=null; //분기 url 저장될 변수방
		System.out.println(url);
		
		if(url.contains("main.mvc")) {
			System.out.println("main 요청");
			viewName="main.jsp";
		}else if(url.contains("test1.mvc")) {
			System.out.println("test1 요청");
			String str1=request.getParameter("data1");
			String str2=request.getParameter("data2");
			//형변환
			int number1=Integer.parseInt(str1);
			int number2=Integer.parseInt(str2);
			int result=number1+number2;
			//결과값 저장
			request.setAttribute("result", result);
			
			viewName="test1.jsp";
			
		}else if(url.contains("test2.mvc")) {
			System.out.println("test2 요청");
			
			int result=TestController.multi(request);
			
			//결과값 저장
			request.setAttribute("result", result);
			
			viewName="test2.jsp";
		}
		
		RequestDispatcher dis=request.getRequestDispatcher(viewName);
		dis.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
