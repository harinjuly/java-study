package poly2.abst2;

public class Genesis extends Car{
	
	@Override
	public void engineStart() {
		System.out.println("휴대폰 앱으로 시동");
	}

	@Override
	public void gear() {
		System.out.println("제어판을 터치해서 기어 변경");
	}

	@Override
	public void window() {
		System.out.println("제어판을 터치해서 조절");
		
	}
}
