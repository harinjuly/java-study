package loop2;
import java.lang.*;
import java.util.Scanner;
public class Test02 {
	public static void main (String[] args) {
		//while: 특정 시점까지의 반복 
		
		Scanner sc = new Scanner(System.in);
		
		
//--------------------------------------------------------------------
		
		while(true) { //조건이 true 이므로 영원히 실행되는 반복문
		System.out.println("숫자를 입력하세요.");
		int user = sc.nextInt();
		if (user==0) {
			break;
		}
		System.out.println("입력한 숫자는"+user+"입니다.");
			
		}
		
		sc.close();
	}
}
