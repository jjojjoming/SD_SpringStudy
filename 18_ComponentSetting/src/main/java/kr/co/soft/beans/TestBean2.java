package kr.co.soft.beans;

import org.springframework.stereotype.Component;

@Component("t3")
public class TestBean2 {
	
	public TestBean2() {
		System.out.println("TestBean의 생성자");
	}
	
}
