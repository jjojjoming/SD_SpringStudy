package kr.co.soft.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.TestBean1;
import kr.co.soft.beans.TestBean2;
import kr.co.soft.beans2.TestBean3;
import kr.co.soft.beans2.TestBean4;
import kr.co.soft.beans3.TestBean5;
import kr.co.soft.config.BeanConfigClass;


public class MainClass {

   public static void main(String[] args) {

      System.out.println("======================XML==============================");
      ClassPathXmlApplicationContext ctx1= new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
      
      //type으로 호출
      TestBean1 xml1=ctx1.getBean(TestBean1.class);
      System.out.println("xml1 : "+xml1);
      
      //Name으로 호출
      TestBean2 xml2=ctx1.getBean("xml2",TestBean2.class);
      System.out.println("xml2 : "+xml2);
      TestBean2 xml3=ctx1.getBean("xml3",TestBean2.class);
      System.out.println("xml3 : "+xml3);
      
      System.out.println("----------------------------------");
      
      //bean에서 선언 안해주고 component로 받음
      //component_type으로 
      TestBean3 xml4=ctx1.getBean(TestBean3.class);
      System.out.println("xml4 : "+xml4);
      //component_name으로 
      TestBean4 xml5=ctx1.getBean("bean4",TestBean4.class);
      System.out.println("xml5 : "+xml5);
      
      System.out.println("----------------------------------");
      //이름을 여러개 지정해서 사용 가능
      TestBean4 xml100=ctx1.getBean("xml100",TestBean4.class);
      System.out.println("xml100 : "+xml100);
      //TestBean4에 component이름을 선언했지만 이 외에도 이름을 여러개 지정해서 다르게 호출 가능
      TestBean4 xml200=ctx1.getBean("xml200",TestBean4.class);
      System.out.println("xml200 : "+xml200);
      
 
      ctx1.close();
      
      
      System.out.println("======================Annotation==============================");
      AnnotationConfigApplicationContext ctx2=new AnnotationConfigApplicationContext(BeanConfigClass.class);
      
      //type으로 호출
      TestBean1 java1=ctx2.getBean(TestBean1.class);
      System.out.println("java1 : "+java1);
      
      //Name으로 호출
      TestBean2 java2=ctx2.getBean("java2",TestBean2.class);
      System.out.println("java2 : "+java2);
      TestBean2 java3=ctx2.getBean("java2",TestBean2.class);
      System.out.println("java3 : "+java3);
      
      System.out.println("----------------------------------");
      
      //bean에서 선언 안해주고 component로 받음
      //component_type으로 
      TestBean3 java4=ctx2.getBean(TestBean3.class);
      System.out.println("java4 : "+java4);
      //component_name으로 
      TestBean4 java5=ctx2.getBean("bean4",TestBean4.class);
      System.out.println("java5 : "+java5);
      
      //component_name으로 
      TestBean5 java6=ctx2.getBean("bean5",TestBean5.class);
      System.out.println("java6 : "+java6);
      
      ctx2.close();
   }

}