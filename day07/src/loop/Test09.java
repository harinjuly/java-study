package loop;
	import java.lang.*;
public class Test09 {
	public static void main (String[] args ) {
		
		/*
		 * 다이어트를 위해서 오늘부터 30일간 푸시업을 해보려고 합니다.
		 * 처음부터 많이하면 힘들기 때문에 첫날은 10개만 하고, 
		 * 둘째날부터는 전날보다 3개씩 개수를 늘려서 하려고 합니다.
		 * 일자별로 하게되는 푸시업 개수를 화면에 출력하세요
		 * 30일동안 하게되는 푸시업의 총 개수를 구하여 출력하세요
		 */
	
		
		
		int pushUp = 10;
		int total = 0;

		for (int i = 1; i <= 30; i++) {
			System.out.println(i + "일차 : " + pushUp + "개");
			total += pushUp;
			pushUp += 3;
			
			//total +=pushUp --> 속도가 훨씬 빠르다.
		}

		System.out.println("총 푸시업 개수: " + total + "개");
	
	}	
}
