package kr.co.soft.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	//메서드 호출전
   public void beforeMethod() {
      System.out.println("beforeMethod 호출");
      
   }
}