package inherit.exam03;

public class Wizard extends Character{

	
	public Wizard () {
		}
	
	public Wizard(String name, String job) {
		super(name,job,1,100,50,1000,1500);
	}
	
	@Override
	public void attack() {
		System.out.println("마법 공격");
	}
	
}
