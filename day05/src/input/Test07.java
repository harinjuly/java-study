package input;
import java.util.Scanner;
public class Test07 {
	public static void main(String[] args) {
		// 띄어쓰기 문자열만 가능.
		// .next 계열 명령들은 개행(엔터)이나 공백등을 구분기호로 인식.
		//개행만 구분기호로 인식하는 명령 - nextLine
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요.");
		String text = sc.nextLine();
		sc.close();
		
		System.out.println(text);
		
		
		
	}
}
