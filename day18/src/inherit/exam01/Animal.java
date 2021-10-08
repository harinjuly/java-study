package inherit.exam01;
//부모 클래스
public class Animal {

	private String type;
	private String color;
	private String state;
	
	
	public Animal() {}
	public Animal(String type, String color, String state) {
		this.type = type;
		this.color = color;
		this.state = state;
	}
	
	public void eat() {
		System.out.println("먹다");
	}
	
	public void speak() {
		System.out.println("짖다");
	}
	
	public void walk() {
		System.out.println("걷다");
	}
	
}
