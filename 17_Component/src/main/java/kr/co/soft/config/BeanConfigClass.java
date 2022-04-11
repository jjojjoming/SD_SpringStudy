package kr.co.soft.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.co.soft.beans.TestBean1;
import kr.co.soft.beans.TestBean2;
import kr.co.soft.beans2.TestBean4;

@Configuration
@ComponentScan(basePackages = "kr.co.soft.beans2")
@ComponentScan(basePackages = "kr.co.soft.beans3")
public class BeanConfigClass {
	//TestBean1
	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}	
	
	//TestBean2
	@Bean
	public TestBean2 java2() {
	return new TestBean2();
	}
		
	@Bean
	public TestBean2 java3() {
	return new TestBean2();
	}
	
	//TestBean4를 여러개의 객체명으로 지정하여 사용할 경우
	@Bean
	public TestBean4 java100() {
	return new TestBean4();
	}	
	
	@Bean
	public TestBean4 java200() {
	return new TestBean4();
	}
	

}
	
