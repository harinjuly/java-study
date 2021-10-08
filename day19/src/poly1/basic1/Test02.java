package poly1.basic1;

public class Test02 {
	public static void main(String[] args) {
		Animal ani;
		
		//업 케스팅
		
		ani = new Cat();
		ani.eat();
		ani.speak();
		
		
		ani = new Dog();
		ani.eat();
		ani.speak();
		
	}
}
