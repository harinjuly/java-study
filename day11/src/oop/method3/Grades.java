package oop.method3;

public class Grades {

	
	String name;
	int sub1;
	int sub2;
	
	
	//초기화
	//멤버 메소드 = 코드 저장
	
	
	void setup (String name, int sub1, int sub2)
	{
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
				
	}
	
	//출력

	
	void output () {
		
		System.out.println("이름:" +this.name);
		System.out.println("1과목:" + this.sub1);
		System.out.println("2과목:" + this.sub2);
		
		int sum = this.sub1+this.sub2;
		System.out.println("총점:  " + sum +" 점");
		double evg = sum/2.0;		
		System.out.println("평균:   "+ evg + " 점");
		
		boolean pass = this.sub1 >=40 && this.sub2 >=40 && evg>=60;
			
		
			if(pass) {
				System.out.println("통과");
			}
			else{
				System.out.println("재시험");
			}
	
	}

}
