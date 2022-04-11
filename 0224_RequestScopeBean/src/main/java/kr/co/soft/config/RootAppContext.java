package kr.co.soft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import kr.co.soft.beans.DataBean1;
import kr.co.soft.beans.DataBean2;

//프로젝트 작업시 등록될 bean을 정의하는 클래스(//<annotation-driven/>와 같음)
@Configuration
public class RootAppContext {
	
	@Bean
	@RequestScope 
	public DataBean1 dataBean1() {
		return new DataBean1();
		
	}
	
	
	@Bean("requestBean2")
	@RequestScope 
	public DataBean2 dataBean2() {
		return new DataBean2();
		
	}

}
