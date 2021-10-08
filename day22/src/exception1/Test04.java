package exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//	catch 다중 예외 처리
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("숫자 1 입력 :  ");
			int num1 = sc.nextInt();
			System.out.print("숫자 2 입력 :  ");
			int num2 = sc.nextInt();
			System.out.println("나누기 :  " +(num1/num2));
		} catch(ArithmeticException e) {
			// e.printStackTrace();		// 예외 정보 출력
			System.out.println("잘못된 정보를 입력하셨습니다.");
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력해주세요.");
		}
		catch(Exception e) {
			System.out.println("무언가 예외발생");
		} finally {
		System.out.println("프로그램 종료");
		}
	}
}
