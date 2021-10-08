package api1.wrapper1;

public class Test01 {

	public static void main(String[] args) {
		
		//Wrapper 클래스 기본 사용 
		
		//기본 자료형 사용
		int num1 = 10;
		
		// 박싱(Boxing)  :  기본 타입의 데이터를 객체로 변환
		Integer num2 = new Integer(num1);
		System.out.println(num2);
		
		// 언박싱(Unboxing) : Wrapper클래스의 인스턴스(객체)에 저장된 값을 다시 기본 타입의 데이터로 꺼내는 과정
		int num3 = num2.intValue();
		System.out.println(num3);
		
		//오토 박싱(AutoBoxing)
		Double num4 = 3.5;
		System.out.println(num4);
		
		//오토 언박싱 (Autounboxing)
		double num5 = num4;
		System.out.println(num5);
		
	}
}
