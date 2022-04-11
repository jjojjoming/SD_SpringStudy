package kr.co.soft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.soft.interceptor.TestInterceptor1;
import kr.co.soft.interceptor.TestInterceptor2;
import kr.co.soft.interceptor.TestInterceptor3;
import kr.co.soft.interceptor.TestInterceptor4;
import kr.co.soft.interceptor.TestInterceptor5;
import kr.co.soft.interceptor.TestInterceptor6;
import kr.co.soft.interceptor.TestInterceptor7;
import kr.co.soft.interceptor.TestInterceptor8;
//<annotation-driven/>와 같음
@Configuration
//controller어노테이션이 셋팅되어 있는 클래스 로드
@EnableWebMvc 
@ComponentScan("kr.co.soft.controller")
public class ServletAppContext implements WebMvcConfigurer{

	//jsp의 파일이름 앞 뒤 생략
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");	
	}

	//정적 파일의 경로를 매핑
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resource/");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		WebMvcConfigurer.super.addInterceptors(registry);
		
		//인터셉터 객체 생성
		TestInterceptor1 inter1 = new TestInterceptor1();
		TestInterceptor2 inter2 = new TestInterceptor2();
		TestInterceptor3 inter3 = new TestInterceptor3();
		TestInterceptor4 inter4 = new TestInterceptor4();
		TestInterceptor5 inter5 = new TestInterceptor5();
		TestInterceptor6 inter6 = new TestInterceptor6();
		TestInterceptor7 inter7 = new TestInterceptor7();
		TestInterceptor8 inter8 = new TestInterceptor8();
		
		
		//인터셉터 등록
		InterceptorRegistration reg1 = registry.addInterceptor(inter1);
		InterceptorRegistration reg2 = registry.addInterceptor(inter2);
		InterceptorRegistration reg3 = registry.addInterceptor(inter3);
		InterceptorRegistration reg4 = registry.addInterceptor(inter4);
		InterceptorRegistration reg5 = registry.addInterceptor(inter5);
		InterceptorRegistration reg6 = registry.addInterceptor(inter6);
		InterceptorRegistration reg7 = registry.addInterceptor(inter7);
		InterceptorRegistration reg8 = registry.addInterceptor(inter8); 
		
		//인터셉터 관심사 등록
		reg1.addPathPatterns("/test1");
		reg2.addPathPatterns("/test1");
		reg3.addPathPatterns("/test2");
		
		reg4.addPathPatterns("/test1");
		reg4.addPathPatterns("/test2");
		
		reg4.addPathPatterns("/test1","/test2");
		
		reg5.addPathPatterns("/sub1/test3", "/sub1/test4");
		
		reg6.addPathPatterns("/*"); //경로 하나의 모든 메소드에 반응
		
		reg7.addPathPatterns("/sub1/*"); //sub1경로아래  하나의 모든 메소드에 반응
		
		reg8.addPathPatterns("/**"); //여러경로 => 모두 다 
		
		reg8.excludePathPatterns("/*"); //제외할 주소의 경로 => 한덩어리짜리 주소경로 제외
		
		
	}
	

	
	
	
	

}
