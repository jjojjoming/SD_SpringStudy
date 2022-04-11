package kr.co.soft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.DataBean;
import kr.co.soft.beans.TV;
import kr.co.soft.beans.TestBean;
import kr.co.soft.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
		
		
		TestBean t1=new TestBean();
		t1.printData();
		System.out.println("---------------------------------------------");
		TestBean obj1=ctx.getBean("obj1", TestBean.class);
	    obj1.printData();
	    
	    System.out.println("=================================================");
	    
	    TestBean t2=new TestBean(100);
		t2.printData();
		System.out.println("---------------------------------------------");
		TestBean obj2=ctx.getBean("obj2", TestBean.class);
	    obj2.printData();
	    System.out.println("=================================================");
	    
	    TestBean t3=new TestBean(11.11);
		t3.printData();
		System.out.println("---------------------------------------------");
		TestBean obj3=ctx.getBean("obj3", TestBean.class);
	    obj3.printData();
	    System.out.println("=================================================");
	    
	    TestBean t4=new TestBean("Soldesk");
		t4.printData();
		System.out.println("---------------------------------------------");
		TestBean obj4=ctx.getBean("obj4", TestBean.class);
	    obj4.printData();
	    System.out.println("=================================================");
	    
	    TestBean t5=new TestBean(200,22.22,"안녕하세요");
  		t5.printData();
  		System.out.println("---------------------------------------------");
  		TestBean obj5=ctx.getBean("obj5", TestBean.class);
	    obj5.printData();
	    System.out.println("=================================================");
	    
	    //TestBean t6=new TestBean("안녕하세요",200,22.22);
  		//t6.printData();
  		//System.out.println("---------------------------------------------");
	    TestBean obj6=ctx.getBean("obj6", TestBean.class);
	    obj6.printData();
	    System.out.println("=================================================");
	    //인덱스 활용
	    TestBean obj7=ctx.getBean("obj7", TestBean.class);
	    obj7.printData();
	    
	    System.out.println("=================================================");
	    
	    DataBean d1=new DataBean();
	    DataBean d2=new DataBean();
	    TestBean2 t200=new TestBean2(d1,d2);
	    t200.printData();
	    System.out.println("---------------------------------------------");
	    //방법1
	    TestBean2 obj8=ctx.getBean("obj8", TestBean2.class);
	    obj8.printData();
	    
	    System.out.println("---------------------------------------------");
	    //방법2
	    TestBean2 obj9=ctx.getBean("obj9", TestBean2.class);
	    obj9.printData();
	    
	    System.out.println("=================================================");
	    TV tv=(TV)ctx.getBean("tv");
	    tv.powerOn();
	    tv.volumeUp();
	    tv.volumeDown();
	    tv.powerOff();
	    
		ctx.close();
	}
	
	
}
	


