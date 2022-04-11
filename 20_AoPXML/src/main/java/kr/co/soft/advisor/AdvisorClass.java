package kr.co.soft.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	//메서드 호출전
   public void beforeMethod() {
      System.out.println("beforeMethod 호풀");
      
   }
   //메서드 호출후 
   public void afterMethod() {
	      System.out.println("afterMethod 호출");
	      
   }
   //개발자가 시점을 명확히 조정
   public Object aroundMethod(ProceedingJoinPoint pjp)throws Throwable {
	   System.out.println("aroundMethod 호출1");
	   System.out.println("aroundMethod 호출2");
	   Object obj= pjp.proceed();
	   
	   
	   return obj;
  
   }
   //메서드가 정상적으로 끝났을때
   public void afterReturningMethod() {
	   System.out.println("afterReturningMethod 호출");
   }
   //error 발생시 동작하는 advice
   public void afterthrowingMethod(Throwable e1) {
	   System.out.println("afterthrowingMethod 호출");
	   System.out.println(e1);
   }
}