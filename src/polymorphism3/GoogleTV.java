package polymorphism3;

public class GoogleTV implements TV {
	private Speaker speaker;
	private int price;
	
	public GoogleTV() {
		System.out.println("===> GoogleTV 생성");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("---> setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("---> setPrice() 호출");
		this.price = price;
	}

	public void powerOn() {
		System.out.println("GoogleTV---전원 켠다." + price);
	}
	public void powerOff() {
		System.out.println("GoogleTV---전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
