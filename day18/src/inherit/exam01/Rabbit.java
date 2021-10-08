package inherit.exam01;

public class Rabbit extends Animal{

	
	private int jumping; 
	
	public Rabbit() {}
	
	public Rabbit(String type, String color, String state, int clean) {
		super(type, color, state);
		this.jumping = jumping;
		}
	
	public void listen() {
		System.out.println("듣다");
	}
	
	public void jump() {
		System.out.println("뛰다");
	}
	
	@Override
	public void speak() {
		 System.out.println("아악");
	}
}
