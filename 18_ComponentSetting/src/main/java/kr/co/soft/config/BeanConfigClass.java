package kr.co.soft.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import kr.co.soft.beans.TestBean2;

@Configurable
@ComponentScan(basePackages = "kr.co.soft.beans")
public class BeanConfigClass {
	
	@Bean
	public TestBean2 t5() {
	return new TestBean2();
	}
		
	@Bean
	public TestBean2 t6() {
	return new TestBean2();					
	}	

}
	
