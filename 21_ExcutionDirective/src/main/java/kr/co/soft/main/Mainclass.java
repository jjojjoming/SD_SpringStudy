package kr.co.soft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.TestBean1;
import kr.co.soft.beans.TestBean2;

public class Mainclass {
   
   public static void main(String[] args) {
      
      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
      
      TestBean1 xml1 = ctx.getBean("xml1",TestBean1.class);
      
      xml1.method1();
      System.out.println("========================================");
      xml1.method1(100);
      System.out.println("========================================");
      xml1.method1("Happy");
      System.out.println("=========================================");
      xml1.method1(100,200);
      System.out.println("=========================================");
      xml1.method1(100,"Happy");
      System.out.println("=========================================");
      xml1.method2();
      System.out.println("=========================================");
      TestBean2 xml2 = ctx.getBean("xml2",TestBean2.class);
      xml2.method1();
      System.out.println("=========================================");
      kr.co.soft.beans2.TestBean1 xml3=ctx.getBean("xml3", kr.co.soft.beans2.TestBean1.class);
      xml3.method1();
      System.out.println("=========================================");

      
      
      
      ctx.close();
   }

}