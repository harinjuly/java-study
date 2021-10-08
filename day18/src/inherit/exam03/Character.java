package inherit.exam03;

//부모클래스
public class Character {

	private String name;
	private String job;
	private int level;
	private int str;
	private int def;
	private int hp;
	private int mp;
	
	public Character() {
		
	}
	
	public Character(String name, String job, int level, int str, int def, int hp, int mp)
	{
		this.name= name;
		this.job=job;
		this.level= level;
		this.str=str;
		this.def=def;
		this.hp=hp;
		this.mp=mp;
	}
	
	
	public void attack() {
		System.out.println("공격");
	}
	
	public void defense() {
		System.out.println("방어");
	}
	
	@Override
	public String toString() {
		return "이름: "+name+"직업: "+job+" 레벨: "+level+
				" 공격력: "+str+" 방어력: "+def+" 체력: "+ hp +" 마나: "+mp; 
	}
	
	
	
	
	
	
}
