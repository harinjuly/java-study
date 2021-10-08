package poly2.abst2;

public class Avante extends Car{

	@Override
	public void engineStart() {
		System.out.println("키를 돌려서 시동");
	}

	@Override
	public void gear() {
		System.out.println("막대를 움직여서 기어 변경");
	}

	@Override
	public void window() {
		System.out.println("손잡이를 돌려서 조절");
		
	}
	
	
}
