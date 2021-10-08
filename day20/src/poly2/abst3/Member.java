package poly2.abst3;

public  abstract class Member {



	private String name;
	private String grade; //등급
	private int point;
	// private double rate;
		
	public Member(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
		
	}
	
	public abstract double getInterest(); //이자율
	
		
	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public int getPoint() {
		return point;
	}
	
}
