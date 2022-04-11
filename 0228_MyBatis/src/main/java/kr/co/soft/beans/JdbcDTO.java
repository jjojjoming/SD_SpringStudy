package kr.co.soft.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
@Scope("prototype")
public class JdbcDTO {
	
	private int int_data;
	private String 	str_data;
	
}
