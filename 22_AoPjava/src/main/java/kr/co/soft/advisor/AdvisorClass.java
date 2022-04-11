package kr.co.soft.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdvisorClass {
	
	//메서드 호출전
	@Before("execution(* method())")
   public void beforeMethod() {
      System.out.println("beforeMethod 호풀");
      
   }
	//==================================================
   //메서드 호출후 
	@After("execution(* method())")
   public void afterMethod() {
	      System.out.println("afterMethod 호출");
	      
   }
   //개발자가 시점을 명확히 조정
	@Around("execution(* method())")
   public Object aroundMethod(ProceedingJoinPoint pjp)throws Throwable {
	   System.out.println("aroundMethod 호출1");
	   System.out.println("aroundMethod 호출2");
	   Object obj= pjp.proceed();
	   
	   
	   return obj;
  
   }
   //메서드가 정상적으로 끝났을때
	@AfterReturning("execution(* method())")
   public void afterReturningMethod() {
	   System.out.println("afterReturningMethod 호출");
   }
   //error 발생시 동작하는 advice
	@AfterThrowing("execution(* method())")
   public void afterthrowingMethod(Throwable e1) {
	   System.out.println("afterthrowingMethod 호출");
	   System.out.println(e1);
   }
}