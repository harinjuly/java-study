package input;
import java.lang.*;
import java.util.*;
public class Test02 {
	public static void main (String [] args) {
		// =java.util.Scanner
		//도구생성
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println("a=" + a);
		
		int b = sc.nextInt();
		System.out.println("b=" + b); 
		
		//저장
		sc.close();
		
	}
}
