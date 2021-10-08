package array;

public class Test07_1 {
public static void main(String[] args) {
		
//		1. 데이터를 배열에 저장
		int[] data = new int[] {30, 50, 20, 10, 40};
		
//		2. 데이터 회전(1칸, 반복문 사용)
		int distance = 3;
		
		for(int k=1; k<=3; k++) {
		int temp = data[0];//	가장 좌측에 있는 데이터를 임시 변수에 저장
		
		for(int i=0; i < data.length-1; i++) {
			data[i] = data[i+1];
		}
		
		data[data.length-1] = temp;//마지막 자리에 임시 변수에 저장해둔 데이터를 대입
		
		}
//		4. 결과 출력
		for(int i=0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
		System.out.println();
		
	}
}

