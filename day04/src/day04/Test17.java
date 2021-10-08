package day04;
import java.lang.*;
public class Test17 {
	public static void main (String [] ages) {
		
		int java = 65;
		int data = 72;
		
		double everage = (java+data) / 2.0;
		
		System.out.println(everage);
		
		boolean graed = everage>=40 && everage<70;
		
		System.out.println("이 학생은 성적부진자입니까?" + graed);
		
	}
}
