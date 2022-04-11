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
      
      //test1(); //��ü�� �ڵ����� �������� ����
      //test2(); //��ü�� �ڵ����� �������� ����
	   test3();
   }
   
   public static void test1() {
      
              //�������
            ClassPathResource res = new ClassPathResource("kr/co/soft/config/beans.xml");
            
            //������� ��ü
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
   	
   		//ctx.close();//�ε����ڸ��� �����ڰ� ȣ���
   		
   		TestBean t1=ctx.getBean("t1", TestBean.class);
        System.out.printf("t1 : %s\n", t1 );
        
        
        TestBean t2=ctx.getBean("t1", TestBean.class);
        System.out.printf("t2 : %s\n", t2 );
        
        ctx.close();
   	}
   	//�ܺ�
   	public static void test4() {
   	
   		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("beans.xml");
   		//ctx.close(); //�ε����ڸ��� ������ ȣ��
   		
   		TestBean t1=ctx.getBean("t2", TestBean.class);
        System.out.printf("t1 : %s\n", t1 );
        
        TestBean t2=ctx.getBean("t2", TestBean.class);
        System.out.printf("t2 : %s\n", t2 );
        
        ctx.close();
   	}
}