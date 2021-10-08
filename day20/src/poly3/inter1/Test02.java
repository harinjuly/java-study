package poly3.inter1;

public class Test02 {
	//구현 클래스를 이용한 객체생성
	
	public static void main(String[] args) {
		Galaxy20 g=new Galaxy20();
		
		//객체로 인터페이스 내 상수값 사용
		// 접근은 되지만 경고발생
		// 정적인 방법으로 액세스해야 한다.
		System.out.println(g.FREQUENCY);

		g.on();
		g.search();
		Bluetooth.pairing(); // 정적 메소드는 참조변수로 접근 불가능
		g.connect();
		g.of();
		g.samsungPay();
		
	}
}
