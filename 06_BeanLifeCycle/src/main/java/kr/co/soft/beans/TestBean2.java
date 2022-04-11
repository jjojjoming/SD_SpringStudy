package kr.co.soft.beans;


public class TestBean2 {
	
	public TestBean2() {
		System.out.println("TestBean2의 객체생성");
	}
	//�����ڰ� ȣ����� �ٷ� �ڵ����� ȣ��� �޼���
	public void default_init() {
		System.out.println("TestBean2의 default_init");
		
	}
	//close �� �� �Ҹ��� �ڵ����� ȣ��� �޼���
	public void default_destroy() {
		System.out.println("TestBean2의 default_destroy");
	}

}