package kr.co.soft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.HelloWorld;
import kr.co.soft.beans.HelloWorldEn;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
		HelloWorld hello1=(HelloWorld)ctx.getBean("hello");
		callMethod(hello1);
		
		HelloWorld hello2=(HelloWorld)ctx.getBean("hello2", HelloWorld.class);
		callMethod(hello2);
		
		ctx.close();

	}
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
}
