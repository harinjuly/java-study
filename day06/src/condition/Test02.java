package condition;
import java.lang.*;
import java.util.Scanner;
public class Test02 {
	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("소지금을 입력하세요.");
		int money = sc.nextInt();
		
		sc.close();
		
		if(money >= 2000){
		System.out.println("떡볶이");
		}
		if(money >= 5000){
		System.out.println("자장면");
		}
		if(money >= 10000) {
		System.out.println("탕수육");
		}
		if(money >= 20000) {
		System.out.println("피자");
		}
	}
}
