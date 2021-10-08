package exception1;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// try ~catch문을 이용한 예외처리
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 1 입력 :  ");
		int num1 = sc.nextInt();

		System.out.println("숫자 2 입력 :  ");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 :  " +(num1+num2));
		System.out.println("빼기 :  " +(num1-num2));
		System.out.println("곱하기 :  " +(num1*num2));
	
		try {
			System.out.println("나누기 :  " +(num1/num2));
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} finally { //예외가 발생하든 안하든 무조건 실행
			System.out.println("나누기 결과 확인 완료");
		}
		
		
		
	}
}
