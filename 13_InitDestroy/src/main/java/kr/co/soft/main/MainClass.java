package kr.co.soft.main;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.TestBean1;

import kr.co.soft.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
	
		System.out.println("============================XML====================================");
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
		TestBean1 xml1=ctx.getBean("xml1", TestBean1.class);
		ctx.close();
		System.out.println();
		
		System.out.println("============================Annotation====================================");
		
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1=ctx2.getBean("java1", TestBean1.class);
		
		ctx2.close();
	}
	
	
}
	


