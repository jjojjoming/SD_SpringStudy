package kr.co.soft.beans;

public class TestBean1 {

   public void method1() {
      System.out.println("beans.TestBean1.method() 호출");
   }
   public void method1(int a1) {
	      System.out.println("beans.TestBean1.method() 호출");  
   }
   public void method1(String a2) {
	      System.out.println("beans.TestBean1.method(java.lang.String) 호출");
   }
   public void method1(int a1, int a2) {
	      System.out.println("beans.TestBean1.method(int형 2개) 호출");
   }
   public void method1(int a1, String a2) {
	      System.out.println("beans.TestBean1.method(int형 String) 호출");
}
   public void method2() {
	      System.out.println("beans.TestBean1.method() 호출");
}
} 
