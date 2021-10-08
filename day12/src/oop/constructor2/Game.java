package oop.constructor2;

public class Game {

	private String id;
	private String job;
	private int level;
	private int money;
		
	public Game (String id, String job, int level, int money) {
			this.setId(id);
			this.setJob(job);
			this.setLevel(level);
			this.setMoney(money);
			}
	
	public Game (String id, String job) {
		this.setId(id);
		this.setJob(job);
		this.setLevel(1);
		this.setMoney(0);
			}
	
	
	public void setId(String id){
		this.id=id;
	}
	
	public void setJob(String job) {
		this.job=job;
	}
	
	public void setLevel(int level) {
		if(level < 1) return;
			this.level=level;
		}
		
	public void setMoney(int money) {
		if(money < 0) return;
			this.money = money;
		
		}
	
	
	String getId() {
		return id;
	}
	
	String getJob() {
		return job;
		
	}
	
	int getLevel() {
		return level;
	}
	
	int getMoney() {
		return money;
	}
	
	
	void output () {
		
		System.out.println("아이디 " + this.getId());
		System.out.println("직업 " + this.getJob());
		System.out.println("레벨 " + this.getLevel());
		System.out.println("소지금 " + this.getMoney());
	}
	
	
}
