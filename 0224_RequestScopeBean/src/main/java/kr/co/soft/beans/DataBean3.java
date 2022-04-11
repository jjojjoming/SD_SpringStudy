package kr.co.soft.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
@RequestScope
public class DataBean3 {
	
	private String data5;
	private String data6;
	


}
