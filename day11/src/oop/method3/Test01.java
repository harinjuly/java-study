package oop.method3;

public class Test01 {
	public static void main(String[] args) {
		
		Grades test1 = new Grades();
		Grades test2 = new Grades();
		Grades test3 = new Grades();
		
		
		//초기화
		test1.setup("피카츄", 50, 70);
		test2.setup("꼬부기", 60, 59);
		test3.setup("파이리", 35, 100);
		
		
		
		//출력
		
		
		test1.output();
		test2.output();
		test3.output();
	}
}
