package condition;

public class Test01 {
	public static void main (String [] args ) {
		// 조건부 코드
		// 목표 : 보유자산을 이용하여 부자인지 판단하여 출력
		// 기준 : 보유자산이 100억 이상이면 부자로 판단
		
		long money = 10000000000L;
		
		System.out.println("자산 : " + money);
		if(money >= 10000000000L) {
			System.out.println("부자");
		}
		
		if(money < 10000000000L) {
		System.out.println("아님");
		}
	}
}
