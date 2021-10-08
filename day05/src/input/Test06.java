package input;
import java.lang.*;
import java.util.Scanner;

public class Test06 {
	public static void main (String [] args ) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("닉네임을 입력하세요.");
		String nickname = sc.next();
		
		sc.close();
		
		// 계산
		
		int size = nickname.length();
		boolean pass = size >= 2 && size <=10;
		
		//출력
		System.out.println("검사결과: " + pass);
		
		
	}
}
