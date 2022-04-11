package kr.co.soft.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.TestBean1;
import kr.co.soft.beans.TestBean2;
import kr.co.soft.beans.TestBean3;
import kr.co.soft.beans.TestBean4;
import kr.co.soft.beans.TestBean5;
import kr.co.soft.config.BeanConfigClass;


public class MainClass {

   public static void main(String[] args) {    
      
      System.out.println("======================Annotation==============================");
     
      AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);

      //Type
      TestBean1 t1=ctx.getBean(TestBean1.class);
      System.out.println("t1 : " + t1);
      TestBean1 t2=ctx.getBean(TestBean1.class);
      System.out.println("t2 : " + t2);
      System.out.println("=========================================================");
      
      //Name
      TestBean2 t3=ctx.getBean("t3",TestBean2.class);
      System.out.println("t3 : " + t3);
      TestBean2 t4=ctx.getBean("t3", TestBean2.class);
      System.out.println("t4 : " + t4);
      System.out.println("=========================================================");
      
      //Name
      TestBean2 t5=ctx.getBean("t5", TestBean2.class);
      System.out.println("t5 : " + t5);
      TestBean2 t6=ctx.getBean("t5", TestBean2.class);
      System.out.println("t6 : " + t6);
      
      System.out.println("=========================================================");
      //Lazy
      TestBean3 t7=ctx.getBean(TestBean3.class);
      System.out.println("t7 : " + t7);
      TestBean3 t8=ctx.getBean(TestBean3.class);
      System.out.println("t8 : " + t8);
      
      System.out.println("=========================================================");
      //Prototype
      TestBean4 t9=ctx.getBean(TestBean4.class);
      System.out.println("t9 : " + t9);
      TestBean4 t10=ctx.getBean(TestBean4.class);
      System.out.println("t10 : " + t10);
      
      System.out.println("=========================================================");
      //@PostConstruct @Predistroy
      TestBean5 t11=ctx.getBean(TestBean5.class);
      System.out.println("t11 : " + t11);
      
      ctx.close();
   }

}