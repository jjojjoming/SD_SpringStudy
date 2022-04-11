package kr.co.soft.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.SamSungTV;
import kr.co.soft.beans.TV;

public class TVmain {

	public static void main(String[] args) {
		//�����̳� ����
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
		//�����̳ʷ� ���� ��ü ȣ��
		TV tv=(TV)ctx.getBean("tv1");
		//SamSungTV TV1 = ctx.getBean("TV1", SamSungTV.class);
		//TV tv=ctx.getBean("tv1",TV.class);
		tv.powerOn();
		tv.powerUp();
		tv.powerDown();
		tv.powerOff();
		//�����̳� ��
		ctx.close();
	}

}
