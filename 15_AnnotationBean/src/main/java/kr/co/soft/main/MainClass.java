package kr.co.soft.main;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.TestBean1;
import kr.co.soft.beans.TestBean2;
import kr.co.soft.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
	
		System.out.println("============================XML====================================");
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
		
		TestBean1 xml1=ctx.getBean("xml1", TestBean1.class);
		System.out.println("xml1.data1 : "+ xml1.getData1());
		System.out.println("xml1.data2 : "+ xml1.getData2());
		System.out.println("xml1.data3 : "+ xml1.getData3());
		
		System.out.println("xml1.data4 : "+ xml1.getData4());
		System.out.println("xml1.data5 : "+ xml1.getData5());
		System.out.println("xml1.data6 : "+ xml1.getData6());
		
		System.out.println("=============================================");
		TestBean2 xml2=ctx.getBean("xml2", TestBean2.class);
		System.out.println("xml2.data1 : "+ xml2.getData1());
		System.out.println("xml2.data2 : "+ xml2.getData2());
		System.out.println("xml2.data3 : "+ xml2.getData3());
		System.out.println("xml2.data4 : "+ xml2.getData4());
		
		ctx.close();
		System.out.println();
		
		System.out.println("============================Annotation====================================");
		
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1=ctx2.getBean("java1", TestBean1.class);
		System.out.println("java1.data1 : "+ java1.getData1());
		System.out.println("java1.data2 : "+ java1.getData2());
		System.out.println("java1.data3 : "+ java1.getData3());
		System.out.println("java1.data4 : "+ java1.getData4());
		System.out.println("java1.data5 : "+ java1.getData5());
		System.out.println("java1.data6 : "+ java1.getData6());
		
		System.out.println("==================================================");
		//오류는 나지 않지만 값을 받지 못함
		TestBean2 java2=ctx2.getBean("java2", TestBean2.class);
		System.out.printf("java2.data1 : %d\n ", java2.getData1());
		System.out.printf("java2.data2 : %s\n ", java2.getData2());
		System.out.printf("java2.data3 : %s\n",  java2.getData3());
		System.out.printf("java2.data4 : %s\n",  java2.getData4());
		
		ctx2.close();
	}
	
	
}
	


