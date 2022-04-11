package kr.co.soft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.soft.beans.DataBean1;
import kr.co.soft.beans.DataBean2;
import kr.co.soft.beans.TestBean1;
import kr.co.soft.beans.TestBean2;



@Configuration
public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		TestBean1 t1=new TestBean1();
		t1.setData1(100);
		return t1;
	}
	
	@Bean
	public DataBean1 data_bean1() {
		return new DataBean1();
	}
	
	@Bean
	public DataBean2 obj4() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 obj5() {
		return new DataBean2();
	}
	
	//자동주입이 되지 않음
	
	  @Bean 
	  public TestBean2 java2() { 
		  return new TestBean2(); 
		  }
	 
	
	
}
