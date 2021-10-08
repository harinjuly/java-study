package date;

import java.lang.*;

public class Test04 {
	public static void main (String [] args) {
		System.out.println (5000*3);
		System.out.println (6000*2);
		System.out.println (5000*3 + 6000 *2);
	// ' = ' 대입연산
		int a = 5000*3;
		int b = 6000*2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);	
			
		//변수를 더 사용해서 각각의 정보들을 따로 관리
		int noodles = 5000;
		int champon = 6000;
		int noodlesCount=3;
		int champonCount=2;
		int noodlesTotal=noodles*noodlesCount;
		int champonTotal=champon*champonCount;
		int total=noodlesTotal+champonTotal;
		System.out.println(noodlesTotal);
		System.out.println(champonTotal);
		System.out.println(total);
	}
}
