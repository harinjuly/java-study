package poly1.basic1;

public class Test06 {
	
	public static void main(String[] args) {
		//instanceof 연산자 사용
		
		Animal ani;
		
		ani = new Cat();
		System.out.println(ani instanceof Cat);
		System.out.println(ani instanceof Dog);
		
	}

}
