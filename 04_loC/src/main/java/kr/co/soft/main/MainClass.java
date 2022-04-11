package kr.co.soft.main;

import kr.co.soft.beans.TestBean;

import java.nio.file.FileSystemAlreadyExistsException;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class MainClass {

   public static void main(String[] args) {
      
      //test1(); //객체가 자동으로 생성되지 앟음
      //test2(); //객체가 자동으로 생성되지 앟음
	   test3();
   }
   
   public static void test1() {
      
              //경로지정
            ClassPathResource res = new ClassPathResource("kr/co/soft/config/beans.xml");
            
            //경로지정 객체
            XmlBeanFactory factory = new XmlBeanFactory(res);
            
            TestBean t1=factory.getBean("t1", TestBean.class);
            System.out.printf("t1 : %s\n", t1 );
            
            
            TestBean t2=factory.getBean("t1", TestBean.class);
            System.out.printf("t1 : %s\n", t2 );
   }
   	public static void test2() {
   		
   		FileSystemResource res=new FileSystemResource("beans.xml");
   		XmlBeanFactory factory = new XmlBeanFactory(res);
   		
   		TestBean t1=factory.getBean("t2", TestBean.class);
        System.out.printf("t1 : %s\n", t1 );
        
        
        TestBean t2=factory.getBean("t2", TestBean.class);
        System.out.printf("t1 : %s\n", t2 );
}
   	public static void test3() {	
   		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
   	
   		//ctx.close();//로딩하자마자 생성자가 호출됨
   		
   		TestBean t1=ctx.getBean("t1", TestBean.class);
        System.out.printf("t1 : %s\n", t1 );
        
        
        TestBean t2=ctx.getBean("t1", TestBean.class);
        System.out.printf("t2 : %s\n", t2 );
        
        ctx.close();
   	}
   	//외부
   	public static void test4() {
   	
   		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("beans.xml");
   		//ctx.close(); //로딩하자마자 생성자 호출
   		
   		TestBean t1=ctx.getBean("t2", TestBean.class);
        System.out.printf("t1 : %s\n", t1 );
        
        TestBean t2=ctx.getBean("t2", TestBean.class);
        System.out.printf("t2 : %s\n", t2 );
        
        ctx.close();
   	}
}