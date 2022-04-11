package kr.co.soft.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.soft.beans.DataBean1;
import kr.co.soft.validator.DataBean1Validator;

@Controller
public class TestController {

	@GetMapping("/input_data")
	public String input_data(DataBean1 dataBean1) {
		return "input_data";
	}

	@PostMapping("/input_pro")
	public String input_pro(@Valid DataBean1 dataBean1, BindingResult result) {
		//유효성 검사를 통과하지 못한게 된다면
		if(result.hasErrors()) {
			return "input_data";
		}
		
		return "input_success";
		
		}
	
	//WebDataBinder : @Valid가 붙어있는 변수 클래스를 탐색해서 주입
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		DataBean1Validator validator1=new DataBean1Validator();
		binder.addValidators(validator1);

	}

}
