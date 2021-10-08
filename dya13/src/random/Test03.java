package random;

public class Test03 {
	public static void main(String[] args) {
		
		int a = (int)(Math.random()*45) + 1 ;
		
		System.out.println("로또번호 1개 : " + a);
		
		
		int b = (int)(Math.random()*90) +10; //= 10부터 90개 (10~99까지)
		
		System.out.println("두 자리 정수 중 1개 : " + b);
		
		int c = (int)(Math.random() * 2); //0부터 2개
		
		System.out.println("앞,뒤 중 1개 :  " +c);
		
//		if(c==0) {
//			System.out.println("앞");
//		}
//		else {
//			System.out.println("뒤");
//		}
		
		String[] str = new String[] {"앞", "뒤"};
		System.out.println(str[c]);
		
		
	}
}
