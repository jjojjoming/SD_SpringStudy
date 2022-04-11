package kr.co.soft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.SamSungTV;
import kr.co.soft.beans.TestBean;



public class MainClass {

	public static void main(String[] args) {
		TestBean obj1=new TestBean();
		obj1.setData1(100);
		
		System.out.println("obj1.data1 : "+ obj1.getData1());
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
		
		TestBean t1=ctx.getBean("t1", TestBean.class);
		System.out.printf("t1.data1 : %d\n", t1.getData1());
		System.out.printf("t1.data2 : %f\n", t1.getData2());
		System.out.printf("t1.data3 : %s\n", t1.isData3());
		System.out.printf("t1.data4 : %s\n", t1.getData4());
		System.out.printf("t1.data5 : %s\n", t1.getData5());
		System.out.printf("t1.data6 : %s\n", t1.getData6());
		
		SamSungTV stv=ctx.getBean("tv", SamSungTV.class);
		System.out.println("Speaker : "+stv.getSpeaker()); ;
		System.out.println("Price : "+stv.getPrice()); 
		System.out.println("---------------------------------------");
		stv.powerOn();
		stv.volumeUp();
		stv.volumeDown();
		stv.powerOff();
		
	    
		ctx.close();
	}
	
	
}
	


