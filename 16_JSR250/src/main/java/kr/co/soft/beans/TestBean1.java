package kr.co.soft.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1의 생성자");
	}
	
	public void init1() {
		System.out.println("TestBean1의 init1");
	}
	
	public void destroy1() {
		System.out.println("TestBean1의 destroy1");
	}
}
