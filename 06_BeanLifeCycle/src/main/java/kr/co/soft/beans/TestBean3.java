package kr.co.soft.beans;


public class TestBean3 {
	
	public TestBean3() {
		System.out.println("TestBean3의 객체생성");
	}
	//�����ڰ� ȣ����� �ٷ� �ڵ����� ȣ��� �޼���
	public void default_init() {
		System.out.println("TestBean3의 default_init�޼���");
		
	}
	//close �� �� �Ҹ��� �ڵ����� ȣ��� �޼���
	public void default_destroy() {
		System.out.println("TestBean3의 default_destroy");
	}
	
	//�����ڰ� ȣ����� �ٷ� �ڵ����� ȣ��� �޼���
	public void bean3_init() {
		System.out.println("TestBean3의 init");
		
	}
	//close �� �� �Ҹ��� �ڵ����� ȣ��� �޼���
	public void bean3_destroy() {
		System.out.println("TestBean3의 destroy");
	}


}