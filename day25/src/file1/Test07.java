package file1;

import java.io.FileWriter;
import java.io.IOException;

public class Test07 {

	public static void main(String[] args) {
		//파일 출력 2 : FileWriter(*****)
		//그림,오디오,비디오 등의 파일은 저장 불가능
		//파일 이어쓰기를 할 경우, 두번재 인자로 true 지정
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("resources\\test07.txt",true);
			fw.write("HIHI\n");
			fw.write("안녕하세요~!");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
