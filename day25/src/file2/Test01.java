package file2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) throws IOException {
		
		//기반 스트림 생성
		FileWriter fw = new FileWriter("resources\\test11.txt",true);		
		//보조 스트림 생성
		// - 보조스트림 생성하면서 기반스트림과 연결
		BufferedWriter bw = new BufferedWriter(fw);
		
		// 출력 작업
		bw.write("Hello");
		bw.write("hihi");

		//스트림 닫기
		bw.close();
		fw.close();
		
	}
}
