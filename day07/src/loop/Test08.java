package loop;
import java.lang.*;
public class Test08 {
	public static void main (String[] args) {
		//1부터 10까지 합계구하기 (누적합계)
				
//		int sum = 1+2+3+4+5+6+7+8+9+10;
//		System.out.println(sum);
		
		int sum =0;
		
		for(int i =1; i<=10; i++) {
			sum +=i;
		}
		System.out.println(sum);
		
	}
	}

