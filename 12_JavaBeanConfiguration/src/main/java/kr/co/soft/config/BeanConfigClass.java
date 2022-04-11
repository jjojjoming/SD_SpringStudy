package kr.co.soft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import kr.co.soft.beans.TestBean1;
import kr.co.soft.beans.TestBean2;
import kr.co.soft.beans.TestBean3;
import kr.co.soft.beans.TestBean4;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		TestBean1 t1=new TestBean1();
		return t1;
	}
	//Annotation방식의 객체이름변경
	@Bean(name="java600")
	public TestBean1 java500() {
		TestBean1 t1=new TestBean1();
		return t1;
	}
	
     // getBean을 통해서만 주소값 반환 
	@Bean
	@Lazy
	public TestBean2 java2() {
		TestBean2 t2=new TestBean2();
		return t2;
	}
	
	@Bean
	@Scope("prototype")
	public TestBean3 java3() {
		TestBean3 t3=new TestBean3();
		return t3;
	}
	
	@Bean
	public TestBean4 java4() {
		TestBean4 t4=new TestBean4();
		return t4;
	}
	
	@Bean
	@Primary
	public TestBean4 java5() {
		TestBean4 t4=new TestBean4();
		return t4;
	}

}
