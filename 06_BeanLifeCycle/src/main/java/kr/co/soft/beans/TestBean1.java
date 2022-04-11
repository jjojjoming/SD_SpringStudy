package kr.co.soft.beans;


public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1의 객체생성");
	}
	//�����ڰ� ȣ����� �ٷ� �ڵ����� ȣ��� �޼���
	public void bean1_init() {
		System.out.println("TestBean1의 init");
		
	}
	//close �� �� �Ҹ��� �ڵ����� ȣ��� �޼���
	public void bean1_destroy() {
		System.out.println("TestBean1의 destroy");
	}

}