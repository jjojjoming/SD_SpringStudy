package kr.co.soft.main;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.TestBean1;
import kr.co.soft.beans.TestBean2;
import kr.co.soft.beans.TestBean3;
import kr.co.soft.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
	
		System.out.println("============================XML====================================");
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
		System.out.println("----------생성자를 통한 주입-------------");
		TestBean1 xml1=ctx.getBean("xml1", TestBean1.class);
		System.out.println("xml1.data1 : "+ xml1.getData1());
		System.out.println("xml1.data2 : "+ xml1.getData2());
		System.out.println("xml1.data3 : "+ xml1.getData3());
		
		System.out.println("----------setter를 통한 주입-------------");
		TestBean1 xml2=ctx.getBean("xml2", TestBean1.class);
		System.out.println("xml2.data1 : "+ xml2.getData1());
		System.out.println("xml2.data2 : "+ xml2.getData2());
		System.out.println("xml2.data3 : "+ xml2.getData3());
		
		System.out.println("----------autowire=byName를 통한 주입-------------");
		TestBean2 xml3=ctx.getBean("xml3", TestBean2.class);
		System.out.println("xml3.data1 : "+ xml3.getData1());
		System.out.println("xml3.data2 : "+ xml3.getData2());
		
		System.out.println("----------autowire=byType를 통한 주입-------------");
		TestBean3 xml4=ctx.getBean("xml4", TestBean3.class);
		System.out.println("xml4.data1 : "+ xml4.getData1());
		System.out.println("xml4.data2 : "+ xml4.getData2());
		
		ctx.close();
		System.out.println();
		
		System.out.println("============================Annotation====================================");
		
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		System.out.println("----------생성자를 통한 주입-------------");
		TestBean1 java1=ctx2.getBean("java1", TestBean1.class);
		System.out.println("java1.data1 : "+ java1.getData1());
		System.out.println("java1.data2 : "+ java1.getData2());
		System.out.println("java1.data3 : "+ java1.getData3());
		
		System.out.println("----------setter를 통한 주입-------------");
		TestBean1 java2=ctx2.getBean("java2", TestBean1.class);
		System.out.println("java2.data1 : "+ java2.getData1());
		System.out.println("java2.data2 : "+ java2.getData2());
		System.out.println("java2.data3 : "+ java2.getData3());
		
		System.out.println("----------autowire=byName를 통한 주입-------------");
		TestBean2 java3=ctx2.getBean("java3", TestBean2.class);
		System.out.println("java3.data1 : "+ java3.getData1());
		System.out.println("java3.data2 : "+ java3.getData2());
		
		System.out.println("----------autowire=byType를 통한 주입-------------");
		TestBean3 java4=ctx2.getBean("java4", TestBean3.class);
		System.out.println("java4.data1 : "+ java4.getData1());
		System.out.println("java4.data2 : "+ java4.getData2());
		
		
		ctx2.close();
	}
	
	
}
	


