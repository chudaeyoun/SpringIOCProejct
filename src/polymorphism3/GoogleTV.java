package polymorphism3;

public class GoogleTV implements TV {
	private Speaker speaker;
	private int price;
	
	public GoogleTV() {
		System.out.println("===> GoogleTV ����");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("---> setSpeaker() ȣ��");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("---> setPrice() ȣ��");
		this.price = price;
	}

	public void powerOn() {
		System.out.println("GoogleTV---���� �Ҵ�." + price);
	}
	public void powerOff() {
		System.out.println("GoogleTV---���� ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
