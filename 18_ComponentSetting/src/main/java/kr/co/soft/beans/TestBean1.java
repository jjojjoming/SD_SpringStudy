package kr.co.soft.beans;

import org.springframework.stereotype.Component;

//IOC 컨테이너 객체를 생성할 때 자동으로 객체가 생성
//타입을 통해서 등록
//Singletone
@Component("bean2")
public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean의 생성자");
	}
	
}
