package polymorphism3;

public class SamsungTV implements TV {
	private Speaker speaker;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) ����");
	}	
	
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV(2) ����");		
		this.speaker = speaker;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---���� �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("SamsungTV---���� ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
