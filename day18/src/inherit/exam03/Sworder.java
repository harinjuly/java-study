package inherit.exam03;

public class Sworder extends Character{

	public Sworder () {}
	
	public Sworder(String name, String job) {
		super(name, job, 1, 50, 100, 1500, 1000);
	}
	
	@Override
	public void attack() {
		System.out.println("검 공격");
	}
	
	
}
