package condition2;
import java.lang.*;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		sc.close();
		
		//출력
		
		switch(choice) {
		case 1:
			System.out.println("가위");
			break;
		case 2 :
			System.out.println("바위");
			break;
		case 3 :
			System.out.println("보");
			break;
		}
		
	}
}
