package inherit.exam01;

public class Dog extends Animal {

	
	private int training; //훈련상태
	
	public Dog() {}
	
	public Dog(String type, String color, String state, int training) {
		super(type, color, state);
		this.training = training;
		}
	
	public void sniff () {
		System.out.println("냄새를 맡다");
	}
	
	public void protect() {
		System.out.println("지키다");
	}
	
	public void dig() {
		System.out.println("땅 파기");
	}
	

	public void speak() {
		 System.out.println("멍멍");
}
}
