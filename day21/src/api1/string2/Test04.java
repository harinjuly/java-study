package api1.string2;

import java.util.StringTokenizer;

public class Test04 {
	public static void main(String[] args) {
	
			String str = "AA,BB,CC,DD,EE,FF,GG";
			
			
			//콤마 기준으로 나누어서 저장
			StringTokenizer st = new StringTokenizer(str,",");
			
			
			//저장된 토큰의 개수 확인
			System.out.println(st.countTokens()); //7
			
			
			//저장된 값 확인
//			for(int i =0; i<st.countTokens(); i++) {
//			System.out.println(st.nextToken());
//			}
			
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());
			}
			
			
	}

}
