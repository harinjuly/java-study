package input;
import java.util.*;
public class Test04 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하시오.");
		int korean = sc.nextInt();
		System.out.println("국어점수 : " + korean);
		
		System.out.println("영어점수를 입력하시오.");
		int eng = sc.nextInt();
		System.out.println("영어점수 : " + eng);
		
		System.out.println("수학점수를 입력하시오.");
		int math= sc.nextInt();
		System.out.println("수학점수: " + math);
		
		sc. close();
		
		System.out.println("");
		int total = korean + eng + math;
		System.out.println("총점 : " + total);
		double average = (double)total / 3;
		System.out.println("평균 : " + average);
		
	}
}
