package kr.co.soft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.TestBean;

public class Mainclass {
   
   public static void main(String[] args) {
      
      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
      
      
      TestBean bean1 = ctx.getBean("xml1",TestBean.class);
      Object value =bean1.method1();
      System.out.println("value: "+value);
      
      ctx.close();
   }

}