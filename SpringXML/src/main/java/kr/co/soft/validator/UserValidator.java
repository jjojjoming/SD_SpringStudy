package kr.co.soft.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import kr.co.soft.beans.UserBean;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return UserBean.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub

		UserBean userBean = (UserBean) target;
		
		//UserBean의 객체 중에서 유효성 검사를 할 객체만 사용하기 위한 name추출
		String beanname=errors.getObjectName();
//		System.out.println(beanname);
		
		//회원가입시 또는 비밀번호 변경
		if(beanname.equals("joinUserBean") || beanname.equals("modifyUserBean")) {

		if (userBean.getUser_pw().equals(userBean.getUser_pw2()) == false) {
			errors.rejectValue("user_pw", "NotEquals");
			errors.rejectValue("user_pw2", "NotEquals");
		}
		//회원가입
		if(beanname.equals("joinUserBean")) {
		
		if (userBean.isUserIdExist() == false) {
			errors.rejectValue("user_id", "DontCheckUserIdExist");
		}
		}
		}
	}

}
