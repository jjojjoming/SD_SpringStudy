package kr.co.soft.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/test1")
	public String test1() {
		//���������� �̵��ϹǷ� �ּҰ� ����
		return "redirect:/sub1";
	}
	
	@GetMapping("/sub1")
	public String sub1() {
		//���������� �̵��ϹǷ� �ּҰ� ����
		return "sub1";

	}
	
	
	//======================forward====================
	
	@GetMapping("/test2")
	public String test2() {
		//�������� �̵��ϹǷ� �ּҰ� �������(�� �������� �˼� ����)
		return "forward:/sub2";

	}
	
	@GetMapping("/sub2")
	public String sub2() {
		//�������� �̵��ϹǷ� �ּҰ� �������(�� �������� �˼� ����)
		return "sub2";

	}
}
