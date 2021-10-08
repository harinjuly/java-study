package loop;
import java.lang.*;
import java.util.Scanner;
public class Test07 {
	public static void main (String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int count=0;
		
		//----------------------
		
		for(int i=0; i<10; i++) {
				
		System.out.print("숫자를 입력하세요: ");
		int user = sc.nextInt();
			
			if(user % 2==1) {
				count++;
				}
			}
		//-----------------------
		
		sc.close();
		
		System.out.println("홀수입력횟수"+count);
		//------------------------------
//		  for(int i=1; i < 100; i++) { 
//			  if (user%2 ==1) { 
//		  }
//		  System.out.println(i);
//		  user++; 
//		  }
//		  else {  }
		  
	 } 	
	}

