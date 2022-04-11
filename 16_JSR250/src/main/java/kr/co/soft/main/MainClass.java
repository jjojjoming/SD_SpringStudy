package kr.co.soft.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.TestBean1;
import kr.co.soft.beans.TestBean2;
import kr.co.soft.beans.TestBean3;
import kr.co.soft.beans.TestBean4;
import kr.co.soft.beans.TestBean5;
import kr.co.soft.beans.TestBean6;
import kr.co.soft.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("======================Annotation======================");
		
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		//일반적인 init, destroy호출
		TestBean1 obj1 = ctx2.getBean("obj1", TestBean1.class);
		
		/* JSP25 어노테이션 */
		TestBean2 obj2 = ctx2.getBean("obj2", TestBean2.class);
		System.out.println("======================================================");
		
		/* @Autowire(By_NAME) */
		TestBean3 obj3 = ctx2.getBean("obj3", TestBean3.class);
		System.out.println("obj3.data1 :" +obj3.getData1());
		System.out.println("obj3.data2 :" +obj3.getData2());
		System.out.println("======================================================");
		
		/* @Autowire @Qualifier */
		TestBean4 obj4 = ctx2.getBean("obj4", TestBean4.class);
		System.out.println("obj4.data1 :" +obj4.getData1());
		System.out.println("obj4.data2 :" +obj4.getData2());
		System.out.println("======================================================");
		
		/* @Resource */
		TestBean5 obj5 = ctx2.getBean("obj5", TestBean5.class);
		System.out.println("obj4.data5 :" +obj5.getData1());
		System.out.println("obj4.data5 :" +obj5.getData2());
		System.out.println("======================================================");
		
		/* @Resource */
		TestBean6 obj6 = ctx2.getBean("obj6", TestBean6.class);
		System.out.println("obj6.data100 :" +obj6.getData1());
		System.out.println("obj6.data200 :" +obj6.getData2());
		System.out.println("======================================================");
		
		
		ctx2.close();
	}
}

