package Kr.co.polymophism.main;

import Kr.co.polymophism.HelloWorld;
import Kr.co.polymophism.HelloWorldEn;
import Kr.co.polymophism.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		
			HelloWorldEn hello1=new HelloWorldEn();
			callHello(hello1);
			
			HelloWorldKo  hello2=new HelloWorldKo();
			callHello(hello2);
	}
	public static void callHello(HelloWorld hello) {
		hello.sayHello();
	}
	
	public static void callHello1(HelloWorld hello) {
		hello.sayHello();
	}
}
