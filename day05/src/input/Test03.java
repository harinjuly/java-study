package input;
import java.lang.*;
import java.util.*;
public class Test03 {
	public static void main(String[] args) {
		int menuZ = 5000;
		int menuJ = 6000;
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("자장면 = " + a);
		
		//가격은 얼마냐
		System.out.println(a * menuZ);
				
		int b = sc.nextInt();
		System.out.println("짬뽕= " + b);
		
		System.out.println(b * menuJ);
		
		sc.close();
		
	}
}
