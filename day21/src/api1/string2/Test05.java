package api1.string2;

import java.util.StringTokenizer;

public class Test05 {

	public static void main(String[] args) {
		// - 저장된 토큰을 배열에 저장해서 사용
		
		String str = "홍길동 김길동 이길동 박길동";
		
		//str에 저장된 문자열을 공백을 기준으로 나누어서 저장
		StringTokenizer st = new StringTokenizer(str, " ");

		// 문자열 배열 생성 -
		String [] arr = new String[st.countTokens()];
		
		//각 배열에 토큰값 저장 (값을 넣는다)
		for(int i=0; st.hasMoreTokens(); i++) {
			arr[i] = st.nextToken();
			}
		
		//배열 내 저장된 테이터 확인
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}
