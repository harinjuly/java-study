package loop2;
import java.lang.*;
import java.util.Scanner;
public class Test03 {

	public static void main (String [] args) {
		
		// 사용자에게 짝수를 입력받는 프로그램을 구현. 홀수입력 종료
		//종료될 경우 여태까지 입력한 짝수의 합계를 구하여 출력
		
		Scanner sc = new Scanner(System.in);
		int total = 0;

		while (true) {
			

			System.out.println("짝수를 입력하세요.(홀수 입력시 종료)");
			int number = sc.nextInt();
			System.out.println("입력한 숫자: " + number);

			if (number % 2 != 0) {
				break;
			}
			total += number;

							}
			System.out.println("입력한 짝수의 합계: " + total + "개");
			sc.close();
	}
}
