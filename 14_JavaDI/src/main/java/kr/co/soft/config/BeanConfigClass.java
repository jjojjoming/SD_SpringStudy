package kr.co.soft.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.soft.beans.DataBean1;
import kr.co.soft.beans.DataBean2;
import kr.co.soft.beans.DataBean3;
import kr.co.soft.beans.TestBean1;
import kr.co.soft.beans.TestBean2;
import kr.co.soft.beans.TestBean3;

@Configuration
public class BeanConfigClass {
	
	@Bean
	public TestBean1 java1() {
		return new TestBean1(200,"좋아요", new DataBean1());
	}
	
	@Bean
	public TestBean1 java2() {
		TestBean1 t1=new TestBean1();
		t1.setData1(100);
		t1.setData2("맞아요");
		t1.setData3(new DataBean1());
		
		return t1;
	}
	//5.1부터 권장하지 않음 =>생성자를 통한 자동주입을 권장함
	@Bean(autowire = Autowire.BY_NAME)
	public TestBean2 java3() {
		return new TestBean2();
	}
	
	@Bean
	public DataBean2 data1() {
		return new DataBean2();
		
	}
	@Bean
	public DataBean2 data2() {
		return new DataBean2();
		
	}
	
	
	//5.1부터 권장하지 않음 =>생성자를 통한 자동주입을 권장함
	@Bean(autowire = Autowire.BY_TYPE)
	public TestBean3 java4() {
		return new TestBean3();
	}
	
	@Bean
	public DataBean3 data100() {
		return new DataBean3();
		
	}
}
