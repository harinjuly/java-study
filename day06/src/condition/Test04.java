package condition;
import java.lang.*;
import java.util.Scanner;
public class Test04 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("나이를 입력하세요");
		int age = sc. nextInt();
		
		sc.close();
		
		// !는 논리부정 연산자. 논리값을 반대로 뒤집는 효과를 발생시킨다.
		
		if (age >=14 && age <=19){
			System.out.println("청소년입니다.");
				}
		else {
			System.out.println("당신은 청소년이 아닙니다.");
		}
		
	}
}
