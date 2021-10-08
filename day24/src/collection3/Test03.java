package collection3;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 문제 : 싱어게인 투표 프로그램 (map으로 구현)
		// 사용자에게 투표할 가수를 입력 받기.
		// 처음 투표하는 가수는 map에 추가하고 카운트는 1
		// 기존에 투표되어 있는 가수는 기존 카운트 +1
		// exit를 입력받으면 전체 투표득수 출력하고 프로그램 종료
		
		HashMap<String, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {		
			System.out.print("투표할 가수의 번호를 입력하세요 (종료 exit) : ");
			String vote = sc.next();
				if(vote.equals("exit")){
					System.out.println("종료합니다.");
					break;
				}
				if(!map.containsKey(vote)) {
					map.put(vote, 1);
				}else {
					map.put(vote, map.get(vote)+1);
				}
				
			System.out.println("### 현재 득표수 ###");
			for(Entry<String, Integer> e : map.entrySet()) {
				System.out.println(e.getKey()+ " : " + e.getValue());
			}

		
		}
		
	
		
		

	}

}
