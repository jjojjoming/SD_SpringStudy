package kr.co.soft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.soft.beans.TestBean1;

@Configuration
public class BeanConfigClass {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public TestBean1 java1() {
		return new TestBean1();
	}
}
