package inherit.exam02;

public class Figure {
	
	private int level;
	private int power;
	private int defense ;
	private int hp;
	private int mp ;
	
	public Figure() {}
	
	public Figure(int level, int power, int defense, int hp, int mp) {
		level = 1;
	}

		
	public int getLevel() {
		System.out.println("레벨 : " + level);
		return level;
				
	}
	
	public void setPower(int power) {
		}
	
	public int getPower() {
		return power;
	}
	
	public void setDefense(int defense) {
	
	}
	
	public int getDefense() {
		return defense;
				
	}
	
	public void setHp(int hp) {

	}
	
	public int getHp() {
		return hp;	
		
		
	}
	
	public void setMp(int mp) {
	
	}
	
	public int getMp() {
		return mp;
		
	}

	public int getLevle() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getLevel(int level) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
