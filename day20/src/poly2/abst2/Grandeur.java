package poly2.abst2;

public class Grandeur extends Car {
	@Override
	public void engineStart() {
		System.out.println("버튼을 눌러서 시동");
	}

	@Override
	public void gear() {
		System.out.println("버튼으로 기어 변경");
	}

	@Override
	public void window() {
		System.out.println("버튼을 눌러서 조절");
		
	}
}
