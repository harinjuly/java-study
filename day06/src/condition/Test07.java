package condition;
import java.lang.*;
import java.util.Scanner;
public class Test07 {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			
	System.out.println("출생년도를 입력하시오.");
	int year = sc.nextInt();

	int age = 2020 - year + 1;
	System.out.println("당신의 나이는:" + age);

	sc.close();
	
	if (age >= 65) {
		System.out.println("노인 65세 이상 : 0원");
	} else if (age >= 20) {
		System.out.println("성인 20세이상 65세미만 : 1250원");
	} else if (age >= 14) {
		System.out.println("청소년 14세이상 20세미만 : 720원");
	} else if (age >= 8) {
		System.out.println("어린이 8세이상 14세미만 : 450원");
	} else {
		System.out.println("유아 8세미만 : 0 원");
	}
}
}
