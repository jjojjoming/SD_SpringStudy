package kr.co.soft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.TestBean;

public class Mainclass {
   
   public static void main(String[] args) {
      
      ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
      
      
      TestBean xml1 = ctx.getBean(TestBean.class);
      xml1.method1();
      
      ctx.close();
   }

}