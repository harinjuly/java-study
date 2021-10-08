package poly3.inter1;

// 인터페이스 구현 클래스
public class Galaxy20 implements Bluetooth {

	@Override
	public void on() {
		System.out.println("@@블루투스가 켜집니다");
	}

	@Override
	public void of() {
		System.out.println("@@블루투스가 꺼집니다");
	}

	@Override
	public void search() {
		System.out.println("@@디바이스를 찾는 중입니다.");
				
	}
	
	@Override
	public void connect() {
		System.out.println("갤럭시랑 연결됨!");
	}
	
	
	// 인터페이스 내 정의되지않은 필드 작성가능
	public void samsungPay() {
		System.out.println("삼성페이로 결제");
		
	}
	
	//인터페이스는 구현관계이다. (상속X)


	
}
