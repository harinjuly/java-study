package file1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test06 {
	
public static void main (String[] args) throws IOException {
		//fileInputStream
		
	FileInputStream fis = new FileInputStream("resources\\test03.txt");
	
//	File file = new File("resources\\\\test03.txt");
//	FileInputStream fis2 = new FileInputStream(file);
	
	// 읽기 작업
	System.out.println(fis.read());
	
	
	//두번째 읽을 값 리턴 -> char형으로 형변환해서 문자로 표현
	System.out.println((char)fis.read());
	
	
	//한번에 데이터를 읽어오기 위한 버퍼를 만들어서 읽어오기 가능
	
	// 읽어온 내용을 저장할 배열
	byte[] buffer = new byte[1024];
	//byte[] buffer = new byte[(int)file.length()];  ->크기만큼 지정
			
	//입력 스트림에 남은 내용을 버퍼 크기만큼 읽어와서 저장
	fis.read(buffer);
	
	// 버퍼 내용 확인1: 반복문 사용
	for(int i = 0; buffer[i] != 0; i++) {
		System.out.print((char)buffer[i]);
	}
	
	System.out.println("---------------------");
	
	// 버퍼 내용 확인2 : .wirte 메소드 사용
	System.out.write(buffer);
	
	// 버퍼 내용 확인3 
	System.out.println("--------------------");
	
	int i =0;
	for(; buffer[i] !=0; i++);
	byte[] buffer2 = new byte[i];
	for(int j =0; j<i; j++) {
		buffer2[j] = buffer[i];
	}
	System.out.write(buffer2);
	
	
	//3. 파일 스트림 닫기
	fis.close();
	
	
	
}
}