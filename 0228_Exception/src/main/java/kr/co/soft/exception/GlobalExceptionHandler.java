package kr.co.soft.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{
	
	@ExceptionHandler(java.lang.NullPointerException.class)
	private String handlerException() {
		return "error2";

	}

}
