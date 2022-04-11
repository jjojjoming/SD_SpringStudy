package kr.co.soft.main;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.soft.beans.CollectionBean;
import kr.co.soft.beans.DataBean;
import kr.co.soft.beans.TestBean;




public class MainClass {

	public static void main(String[] args) {
	
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("kr/co/soft/config/beans.xml");
		
		TestBean t1=ctx.getBean("t1", TestBean.class);
		
		List<String> list1=t1.getList1();
		for(String str:list1) {
			System.out.println("list1 : "+str);
		}
		System.out.println("-----------------------------------");
		
		List<Integer> list2=t1.getList2();
		for(Integer value:list2) {
			System.out.println("list2 : "+value);
		}
		System.out.println("-----------------------------------");
		
		List<DataBean> list3=t1.getList3();
		for(DataBean obj:list3) {
			System.out.println("list3 : "+obj);
		}
		System.out.println("================================================");
		
		Set<String> set1=t1.getSet1();
		Set<Integer> set2=t1.getSet2();
		Set<DataBean> set3=t1.getSet3();
		
		for(String str:set1) {
			System.out.println("list3 : "+str);
		}
		
		for(Integer value:set2) {
			System.out.println("list3 : "+value);
		}
		
		for(DataBean obj:set3) {
			System.out.println("list3 : "+obj);
		}
		System.out.println("================================================");
		
		Map<String, Object> map1=t1.getMap1();
		
		String res1=(String)map1.get("k1");
		Integer res2=(Integer)map1.get("k2");
		DataBean res3=(DataBean)map1.get("k3");
		DataBean res4=(DataBean)map1.get("k4");
		List<String> res5=(List<String>)map1.get("k5");
		
		System.out.println("k1 : "+res1);
		System.out.println("k2 : "+res2);
		System.out.println("k3 : "+res3);
		System.out.println("k4 : "+res4);
		
		for(String str:res5) {
			System.out.println("k5 : "+str);
		}
		
		System.out.println("================================================");
		
		Properties prop1=t1.getProp1();
		
		String p1=prop1.getProperty("p1");
		String p2=prop1.getProperty("p2");
		String p3=prop1.getProperty("p3");
		
		System.out.println("p1 : "+p1);
		System.out.println("p2 : "+p2);
		System.out.println("p3 : "+p3);
		System.out.println("================================================");
		
		CollectionBean addr=ctx.getBean("addr", CollectionBean.class);
		
		List<String> addrlist=addr.getAddressList();
		for(String str:addrlist) {
			System.out.println("addrlist : "+str);
		}
		
		ctx.close();
	}
	
	
}
	


