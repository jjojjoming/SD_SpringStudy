package kr.co.soft.main;




import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.TestBean01;
import kr.co.soft.beans.TestBean02;


public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
		
		TestBean01 t1=ctx.getBean("t1", TestBean01.class);
		System.out.printf("t1 : %s\n", t1);
		
		System.out.println("-----------------------------------------------------");
		
		TestBean02 t2=ctx.getBean("t2", TestBean02.class);
		System.out.printf("t2 : %s\n", t2);
		
		System.out.println("-----------------------------------------------------");
		
		
		ctx.close();
	}
	
	
}
	

