package kr.co.soft.beans;

public class SamSungTV implements TV{
	
	private SonySpeaker speaker;
	private int price;
	
	public SamSungTV() {
		System.out.println("=>SamSungTV 객체생성");
	}
	
	public SamSungTV(SonySpeaker speaker) {
		System.out.println("SamSungTV->SonySpeaker1 객체생성");
		this.speaker=speaker;
	}
	
	public SamSungTV(SonySpeaker speaker, int price) {
		System.out.println("SamSungTV->SonySpeaker2 객체생성");
		this.speaker=speaker;
		this.price=price;
	}

	public void powerOn() {
		System.out.println("=>SamSungTV 전원켜기");
		System.out.println("가격 : "+price);
		
	}

	public void powerOff() {
		System.out.println("=>SamSungTV 전원끄기");
		
	}

	public void volumeUp() {
		speaker.volumeUp();
		
	}

	public void volumeDown() {
		speaker.volumeDown();
		
	}

}
