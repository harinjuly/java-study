package condition;
import java.lang.*;
public class Test05 {
	public static void main (String[] args) {
		// 소수, 인수분해
		
		// 준비
		int number = 3;
		
		// 계산
		boolean even = number % 2 == 0; //2로 나눈 나머지가 0입니까?
				
		if (even){
		System.out.println("짝수입니다.");
		}
		
		else {
			System.out.println("홀수입니다.");
		}
	}
}
