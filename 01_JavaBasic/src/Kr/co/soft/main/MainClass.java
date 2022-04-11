package Kr.co.soft.main;

import Kr.co.soft.beans.HelloWorldEn;
import Kr.co.soft.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		
			HelloWorldEn hello1=new HelloWorldEn();
			callHello(hello1);
			
			HelloWorldKo  hello2=new HelloWorldKo();
			callHello(hello2);
	}
	public static void callHello(HelloWorldEn hello) {
		hello.sayHello();
	}
	
	public static void callHello(HelloWorldKo hello) {
		hello.sayHello();
	}
}
