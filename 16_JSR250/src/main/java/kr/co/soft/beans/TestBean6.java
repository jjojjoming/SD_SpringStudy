package kr.co.soft.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean6 {
	
	@Resource
	private DataBean1 data100;
	@Resource
	private DataBean2 data200;
	public DataBean1 getData1() {
		return data100;
	}
	public DataBean2 getData2() {
		return data200;
	}
	
		
	
}
