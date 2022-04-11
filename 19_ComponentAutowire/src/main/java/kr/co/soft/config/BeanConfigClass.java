package kr.co.soft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.soft.beans.DataBean3;
import kr.co.soft.beans.DataBean4;
import kr.co.soft.beans.DataBean5;
import kr.co.soft.beans.TestBean3;

@Configuration
@ComponentScan(basePackages = "kr.co.soft.beans")
public class BeanConfigClass {
	
	@Bean
	public DataBean3 obj4() {
		return new DataBean3();
	}
	
	@Bean
	public DataBean3 obj5() {
		return new DataBean3();
	}
	
	@Bean
	public TestBean3 java2() {
		TestBean3 t2=new TestBean3(200, "test2", new DataBean4(), new DataBean5());
		return t2;
}
}
	
