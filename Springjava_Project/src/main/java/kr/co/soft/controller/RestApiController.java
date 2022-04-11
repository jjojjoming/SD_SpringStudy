package kr.co.soft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import kr.co.soft.service.UserService;

@RestController // 응답받을 값이 데이터 이므로 RestController 사용
public class RestApiController {

	@Autowired
	private UserService userService;

	@GetMapping("/user/checkUserIdExist/{user_id}")
	public String checkUserIdExist(@PathVariable String user_id) {
		boolean chk = userService.checkUserIdExist(user_id);

		return chk + "";
	}

}
