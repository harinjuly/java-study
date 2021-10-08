package generic2;

public class Run {

	public static void main(String[] args) {
		AnimalController <Cat> ac = new AnimalController(new Cat());
		
		//제네릭 적용
		ac.ani.eat();
		ac.ani.grumming();
		
		
		
	}

}
