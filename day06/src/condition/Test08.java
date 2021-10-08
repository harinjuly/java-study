package condition;
import java.lang.*;
public class Test08 {
	public static void main (String [] args ) {
		
		int age = 22;
		int fare;
		if(age>=65 || age < 8) {
		fare = 0;
		}
		else if(age>=20) {
		fare = 1250;
		}
		else {
		fare = 7200;
		}
		
		System.out.println("요금" + fare);
		
		
	}
}
