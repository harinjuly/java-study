package api1.string1;

public class Test03 {
	 public static void main(String[] args) {
		//String 클래스 메소드 사용
		
		 String str1 = "Hello";
		 
		 //1. 특정 위치(인덱스)의 문자 한개 추출 : .charAt()
		 
		 System.out.println(str1.charAt(0));
		 
		 //2. 특정 문자의 위치(Index) 알아내기 :  .indexOf()
		 
		 System.out.println(str1.indexOf('e'));  // 1 
		 System.out.println("이름: 홍길동, 나이:20".indexOf("나이:"));
		 
		 //3. 문자열 길이 구하기 :  .length()
		 System.out.println(str1.length());
		 
		 
		 //4. 문자열 비교하기 : .equals()
		 System.out.println(str1 == "Hello"); //true - 참조변수에 있는 주소를 비교
		 System.out.println(str1 == new String("Hello")); // false - 주소를 비교
		 
		 System.out.println(str1.equals("Hello")); // true - 실제 문자열 비교
		 System.out.println(str1.equals(new String("Hello"))); // true = 실제 문자열 비교 (5글자)

		 System.out.println(str1.equals("hello")); // false 대소문자 명확히 구분
		 System.out.println(str1.equalsIgnoreCase("hello")); //true - 대소문자 상관없이 구분
		
		 
		 //5. 문자열 치환 - 특정 문자열을 찾아서 특정 문자열로 변경한 결과값을 반환 :  .replace()
		 System.out.println(str1);  //현재 str1 값
		 System.out.println(str1.replace("He", "Ba"));
		 System.out.println(str1); // 객체에 저장되어 있는 값은 변경 안됨.
		 str1 = str1.replace("H", "B"); // 변경된 값을 변수로 새로 저장해줘벌임
		 System.out.println(str1);  // bello
		 		 
		 
		 // 6. 문자열 전체를 대문자로 변환해서 값 반환 :  .toUpperCase()
		 System.out.println(str1.toUpperCase());
		 
		 
		 //7. 문자열 전체를 소문자로 변환된 값 반환 :  .toLowerCase()
		 System.out.println(str1.toLowerCase());
		 
		 
		 
		 // 8. 특정 구분자를 기준으로 문자열을 분할해주는 메소드 :  .split()
		 String str2 = "Apple, Orange, Strawberry";
		 System.out.println(str2);
		 String [] arr = str2.split(", ");     // ", "을 기준으로 문자열을 나눠서 배열에 저장
		 for(int i = 0; i<arr.length; i++) {
			 System.out.println(arr[i]);
		 }
		 
		 
		 
		 
		 
	}
}
