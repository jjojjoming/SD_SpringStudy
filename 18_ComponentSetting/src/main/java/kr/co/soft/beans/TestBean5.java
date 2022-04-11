package kr.co.soft.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TestBean5 {
	
	public TestBean5() {
		System.out.println("TestBean5의 생성자");
	}
	
	public void init() {
		System.out.println("TestBean5의 init");
	}
	
	public void destroy() {
			System.out.println("TestBean5의 destroy");
		}
}
