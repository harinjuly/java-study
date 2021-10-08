package collection1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 할 일 목록 입력받아서 저장 //중복가능 list
		// 개수와 목록 출력
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>(); 
		
		System.out.println(" - To Do List - ");
		while(true) {
			System.out.print("오늘 할 일을 작성해주세요.(종료는 9번): ");
			String str = sc.nextLine();
			if(str.equals("9")) {
			break;
			}
			list.add(str);
		}
		System.out.println("[할 일 개수]" + list.size());
		System.out.println(list);
		System.out.println("할 일 목록");
		//기본 for문
		for(int i=0; i<list.size(); i++) {
			System.out.println(i+1+" : " +list.get(i));
		}
		
		//리스트 내 데이터 확인 : .get()
		
/*		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2)); */
				
		//향상된 for문
		//for(데이터 타입  임시변수명 : 배열) {}
		//배열 내 데이터를 위에서부터 하나씩 빼서 변수에 저장 -> 모든 데이터를 사용하고나면 반복문 종료
		for(String str : list) {
			System.out.println(str);
		}
		
	}
}
