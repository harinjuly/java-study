package oop.basic1;

public class Test02 {
		public static void main(String[] args) {
	
			//메세지 생성
			
			Message a= new Message();
			Message b = new Message();
			
			//초기화
			a.sender="호기심천국";
			a.content="카메라 팔렸나요?";
			a.time="1:35";
			
			b.sender="호기심천국";
			b.content="왜요?";
			b.time="1:35";
			
			//출력
			System.out.println(a.sender);
			System.out.println(a.content);
			System.out.println(a.time);
			
			System.out.println(b.sender);
			System.out.println(b.content);
			System.out.println(b.time);
			
			
			
			}
}
