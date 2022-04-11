package kr.co.soft.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component("requestBean4")
@RequestScope
public class DataBean4 {
	
	private String data7;
	private String data8;
	
	//requestBean4 이름으로 등록

}
