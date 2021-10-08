package poly1.basic1;

public class Test05 {
	public static void main(String[] args) {
		// 업 캐스팅해서 사용할 경우 자식 클래스 멤버에는 접근이 안된다.
		//	다운 캐스팅
		// 업한 객체를 임시로 원형으로 돌린다.
		
		Animal ani;
		ani = new Cat();
		ani.eat();
		ani.speak();
		((Cat)ani).grumming(); //다운케스팅.
//		ani.grumming();
		
		ani = new Dog();
		ani.eat();
		ani.speak();
		((Dog)ani).protect();
		
	}
}
