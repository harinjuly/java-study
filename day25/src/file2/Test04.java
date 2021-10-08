package file2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test04 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//파일에 저장된 객체 읽어오기
		//- 보조 스트림 : ObjectInputStream
		
		//파일 입력 기반 스트림 객체 생성
		FileInputStream fis = new FileInputStream("resources\\student.txt");
		
		//객체 입력 보조 스트림 객체 생성
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//파일에 저장된 객체 데이터 읽어오기
		Student st = (Student) ois.readObject();
		
		System.out.println("파일 불러오기 완료");
		
		//스트림 닫기
		ois.close();
		fis.close();
		
		System.out.println(st);
	}

}
