package loop3;

import java.util.Scanner;

//import java.lang.*;
public class Test01 {
	public static void main(String[] args ) {
		//do~while
		
		Scanner sc = new Scanner (System.in);
		int score;
		
		do {
			System.out.println("시험 점수를 입력하세요");
			score = sc.nextInt();
		}
		while(score <0 || score > 100);
		
		
		
		sc.close();
	
}
}
