package kr.co.soft.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean2 {
	
	public TestBean2() {
		System.out.println("TestBean2의 생성자");
	}
	
	@PostConstruct
	public void init2() {
		System.out.println("TestBean2의 init2");
	}
	
	@PreDestroy
	public void destroy2() {
		System.out.println("TestBean2의 destroy2");
	}
}
