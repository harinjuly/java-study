package poly1.basic1;

public class Test04 {
	public static void main(String[] args) {
		
		// 객체 배열
		// 다양한 자식 객체들을 여러 개 만들어서 사용해야 하는 경우 사용 가능
		Animal [] ani = new Animal[3];
		ani[0] =new Cat();
		ani[1] =new Dog();
		ani[2] =new Cat();
				
		for ( int i =0; i<ani.length; i++) {
			System.out.println(ani[i].getClass().getName()); //객체 타입 확인 ,패키지+클래스명 반환
			System.out.println(ani[i].getClass().getSimpleName()); // 클래스명만 반환
			ani[i].eat();
			ani[i].speak();
		}
	}
}
