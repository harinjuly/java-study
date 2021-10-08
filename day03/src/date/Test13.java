package date;
import java.lang.*;
public class Test13 {
	public static void main (String[] ages) {
		
		// BMI 계산기
		
		int height = 180;
		int weight = 80;
		double heightM = (double)height/100.0;
		
		System.out.println(heightM);
		double bmi = weight / (heightM * heightM);
		
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
		System.out.println("체질량지수: " + bmi);
	}
}
