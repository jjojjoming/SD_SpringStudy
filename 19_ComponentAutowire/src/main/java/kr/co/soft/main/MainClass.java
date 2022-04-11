package kr.co.soft.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.TestBean1;
import kr.co.soft.beans.TestBean2;
import kr.co.soft.beans.TestBean3;
import kr.co.soft.config.BeanConfigClass;


public class MainClass {

   public static void main(String[] args) {    
      
      System.out.println("======================Annotation==============================");
     
      AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);

      //Type
      TestBean1 t1=ctx.getBean(TestBean1.class);
      System.out.println("t1.data1 : " + t1.getData1());
      System.out.println("t1.data2 : " + t1.getData2());
      System.out.println("t1.data3 : " + t1.getData3());
      System.out.println("t1.data4 : " + t1.getData4());
      System.out.println("t1.data5 : " + t1.getData5());
      
      System.out.println("-------------------------------------------------------");
      
      //생성자를 올린 자동주입
      TestBean2 t2=ctx.getBean(TestBean2.class);
      System.out.println("t2.data1 : " + t2.getData1());
      System.out.println("t2.data2 : " + t2.getData2());
      System.out.println("t2.data3 : " + t2.getData3());
      System.out.println("t2.data4 : " + t2.getData4());

      //생성자를 올린 자동주입
      TestBean3 java2=ctx.getBean("java2", TestBean3.class);
      System.out.println("java2.data1 : " + java2.getData1());
      System.out.println("java2.data2 : " + java2.getData2());
      System.out.println("java2.data3 : " + java2.getData3());
      System.out.println("java2.data4 : " + java2.getData4());
      
      ctx.close();
   }

}