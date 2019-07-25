package polymorphism3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// ������ = ��� + Overriding + ����ȯ
public class TVUser {
	public static void main(String[] args) {
		// 1. ������ �����̳ʸ� ����(����)�Ѵ�.
		ClassPathXmlApplicationContext container = 
				new ClassPathXmlApplicationContext("business-layer.xml");
		
		// 2. ������ �����̳ʿ��� ����� ��ü�� ��û(Lookup)�Ѵ�.		
		TV tv = (TV) container.getBean("tv");
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown(); 
		tv.powerOff();
		
		// 3. ������ �����̳ʸ� �����Ѵ�.
		container.close();
	}
}


















