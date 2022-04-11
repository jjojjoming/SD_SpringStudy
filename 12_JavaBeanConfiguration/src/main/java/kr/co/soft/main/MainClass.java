package kr.co.soft.main;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.TestBean1;
import kr.co.soft.beans.TestBean2;
import kr.co.soft.beans.TestBean3;
import kr.co.soft.beans.TestBean4;
import kr.co.soft.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
	
		System.out.println("============================XML====================================");
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
		System.out.println("--xml방식에서 주소값 가져오기");
		TestBean1 xml1=ctx.getBean("xml1", TestBean1.class);
		System.out.println("xml1 : "+ xml1);
		/* 싱글톤 */
		TestBean1 xml11=ctx.getBean("xml1", TestBean1.class);
		System.out.println("xml11 : "+ xml11);
		System.out.println();
		
		TestBean2 xml2=ctx.getBean("xml2", TestBean2.class);
		System.out.println("xml2 : "+ xml2);
		TestBean2 xml22=ctx.getBean("xml2", TestBean2.class);
		System.out.println("xml22 : "+ xml22);
		System.out.println();
		
		TestBean3 xml3=ctx.getBean("xml3", TestBean3.class);
		System.out.println("xml2 : "+ xml2);
		TestBean3 xml33=ctx.getBean("xml3", TestBean3.class);
		System.out.println("xml33 : "+ xml33);
		System.out.println();
		//type으로 호출
		TestBean4 t4=ctx.getBean(TestBean4.class);
		System.out.println("t4 : "+ t4);
		
		ctx.close();
		System.out.println();
		
		System.out.println("============================Annotation====================================");
		
		AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1=ctx2.getBean("java1", TestBean1.class);
		System.out.println("java1 : "+ java1);
		/* 싱글톤 */
		TestBean1 java11=ctx2.getBean("java1", TestBean1.class);
		System.out.println("java11 : "+ java11);
		System.out.println();
		
		/*TestBean1 java500=ctx2.getBean("java500", TestBean1.class);
		System.out.println("java500 : "+ java500);*/
		TestBean1 java600=ctx2.getBean("java600", TestBean1.class);
		System.out.println("java600 : "+ java600);
		System.out.println();
		
		TestBean2 java2=ctx2.getBean("java2", TestBean2.class);
		System.out.println("java2 : "+ java2);
		TestBean2 java22=ctx2.getBean("java2", TestBean2.class);
		System.out.println("java22 : "+ java22);
		System.out.println();
		
		TestBean3 java3=ctx2.getBean("java3", TestBean3.class);
		System.out.println("java2 : "+ java2);
		TestBean3 java33=ctx2.getBean("java3", TestBean3.class);
		System.out.println("java33 : "+ java33);
		System.out.println();
		//type으로 호출
		TestBean4 java4=ctx2.getBean(TestBean4.class);
		System.out.println("java4 : "+ java4);
		
		ctx2.close();
	}
	
	
}
	


