package kr.co.soft.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean1 {
	
	
	private int data1;
	private DataBean1 data2;
	//자동주입 변수방으로 선언  => setter가 완료되었으므로 getter만 추가해서 사용이 가능
	//@Autowired : 객체에만 적용되며 , type으로 인식
	@Autowired
	private DataBean1 data3;
	
	@Autowired
	@Qualifier("obj4") //정의하지 않으면 obj5와 같은 주소를 받아옴 즉 모호성에 빠짐
	private DataBean2 data4;
	@Autowired
	@Qualifier("obj5")
	private DataBean2 data5;
	
	@Autowired(required = false)
	@Qualifier("obj6")
	private DataBean2 data6;
	
	
	
	
	
	//data1의 활용
	/*
	public TestBean1(int data1) {
		this.data1=data1;
	}*/
	
	//필수 주입 속성(spring 5.0이하의 xml에서 사용)
	//자바에서는 생성자를 통해서 필수주입을 권장함
	@Required
	public void setData1(int data1) {
		this.data1 = data1;
	}

	public int getData1() {
		return data1;
	}

	
	
	//data2의 활용
	public DataBean1 getData2() {
		return data2;
	}
	//자동주입
	@Autowired
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}

	//data3활용
	public DataBean1 getData3() {
		return data3;
	}

	//data4 data5 활용
	public DataBean2 getData4() {
		return data4;
	}

	public DataBean2 getData5() {
		return data5;
	}

	/* data6 */
	public DataBean2 getData6() {
		return data6;
	}
	
	
	

}
