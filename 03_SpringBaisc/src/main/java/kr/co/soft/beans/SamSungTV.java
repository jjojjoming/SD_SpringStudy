package kr.co.soft.beans;

public class SamSungTV implements TV{

	public SamSungTV() {
		System.out.println("=>SamSungTV 객체생성");
	}
	
	public void powerOn() {
	      System.out.println("=>SamSungTV 전원키기");
	   }

	public void powerOff() {
		System.out.println("=>SamSungTV 전원끄기");
	}

	public void powerUp() {
		System.out.println("=>SamSungTV 볼륨키기");
	}

	public void powerDown() {
		System.out.println("=>SamSungTV 볼륨끄기");
	}
}