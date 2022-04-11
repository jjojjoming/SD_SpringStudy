package kr.co.soft.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import kr.co.soft.beans.DataBean1;

public class DataBean1Validator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return DataBean1.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		DataBean1 bean1=(DataBean1)target; //등록완료
		
		//공백도 글자로 취급.변수이름.위배시 코드이름
		ValidationUtils.rejectIfEmpty(errors, "data2", "error2");
		//공백이거나 0이하의 문자는 취급하지 않음
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "data3", "error3");
		
		//target으로 DataBean1이 등록되어 있으므로 검사할 데이터 가져올 수 있음
		String data2=bean1.getData2();
		String data3=bean1.getData3();
		
		//유저가 구현하는 코드
		if(data2.length()>10) {
			errors.rejectValue("data2", "error4");
		}
		
		if(data3.contains("@") ==false) {
			errors.rejectValue("data3", "error5");
		}
		
		
	}

}
