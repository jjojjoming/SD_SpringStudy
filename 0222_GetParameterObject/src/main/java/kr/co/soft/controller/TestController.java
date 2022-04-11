package kr.co.soft.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.soft.beans.DataBean;
import kr.co.soft.beans.DataBean2;

@Controller
public class TestController {
	
	/*
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map) {
		
		String data1=map.get("data1");
		String data2=map.get("data2");
		
		System.out.println("data1 : "+data1);
		System.out.println("data2 : "+data2);
		
		return "result";
	}*/
	/*
	//동일한 이름의 data3가 주입될 경우 맨처음 하나만 가져옴
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map) {
		
		String data1=map.get("data1");
		String data2=map.get("data2");
		String data3=map.get("data3");
		
		System.out.println("data1 : "+data1);
		System.out.println("data2 : "+data2);
		System.out.println("data3 : "+data3);
		
		return "result";
	}*/
	
	
	//@RequestParam List<String> : 배열은 List로 받음
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map, @RequestParam List<String> data3) {
		
		String data1=map.get("data1");
		String data2=map.get("data2");
	
		
		System.out.println("data1 : "+data1);
		System.out.println("data2 : "+data2);
		
		for(String str:data3) {
			System.out.println("str : "+ str);
		}
		
		
		return "result";
	}
	
	//type변환 불가능
	/*
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, Integer> map, @RequestParam List<Integer> data3) {
		
		String data1=map.get("data1");
		String data2=map.get("data2");
	
		
		System.out.println("data1 : "+data1);
		System.out.println("data2 : "+data2);
		
		for(String str:data3) {
			System.out.println("str : "+ str);
		}
		
		
		return "result";
	}*/
	
	//=========================================================================
	
	//DataBean, DataBean2에 넘어온 데이터 주입
	/*
	@GetMapping("/test2") 
	public String test2(@ModelAttribute DataBean bean1, @ModelAttribute DataBean2 bean2) {
		

		System.out.println("bean1.data1 : "+bean1.getData1());
		System.out.println("bean1.data2 : "+bean1.getData2());
	
		
		for(int number:bean1.getData3()) {
			System.out.println("number : "+ number);
		}
		
		System.out.println("bean2.data1 : "+bean2.getData1());
		System.out.println("bean2.data2 : "+bean2.getData2());
		
		return "result";
	}*/
	//@ModelAttribute 생략가능
	@GetMapping("/test2") 
	public String test2(DataBean bean1, DataBean2 bean2) {
		

		System.out.println("bean1.data1 : "+bean1.getData1());
		System.out.println("bean1.data2 : "+bean1.getData2());
	
		
		for(int number:bean1.getData3()) {
			System.out.println("number : "+ number);
		}
		
		System.out.println("bean2.data1 : "+bean2.getData1());
		System.out.println("bean2.data2 : "+bean2.getData2());
		
		return "result";
	}
	  
	  
}











