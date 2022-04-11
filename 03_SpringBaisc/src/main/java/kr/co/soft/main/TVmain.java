package kr.co.soft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.SamSungTV;
import kr.co.soft.beans.TV;

public class TVmain {

	public static void main(String[] args) {
		//컨테이너 구동
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
		//컨테이너로 부터 객체 호출
		TV tv=(TV)ctx.getBean("tv1");
		//SamSungTV TV1 = ctx.getBean("TV1", SamSungTV.class);
		//TV tv=ctx.getBean("tv1",TV.class);
		tv.powerOn();
		tv.powerUp();
		tv.powerDown();
		tv.powerOff();
		//컨테이너 종
		ctx.close();
	}

}
