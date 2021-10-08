package file3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02_1 {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("C:\\Users\\user\\programming\\workspace\\day26\\rescources\\입출력설명.png");
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream("rescources\\입출력설명_복사본.png");
		
		
		//임시 버퍼 생성
		byte[] buffer = new byte[100];
		
		while(true) {
		int count = fis.read(buffer);
		System.out.println(count);
		// fis.available(): 읽어올 데이터가 얼마나 남았는지를 반환
		System.out.println(fis.available()+"/"+file.length());
		if(count == -1) {
			break;
		}
		if(count >= buffer.length) {
			fos.write(buffer);
		}else { 
			fos.write(buffer, 0, count);
		}
		
		
		}
		
		
	}

}
