package file3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {

	public static void main(String[] args) throws IOException {
		
			
		String img ="C:\\Users\\user\\programming\\workspace\\day26\\rescources\\입출력설명.png";
		String copy = "rescources\\입출력설명2.png";
		
		FileInputStream fis = new FileInputStream(img);
		FileOutputStream fos = new FileOutputStream(copy);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		fos.flush();
		fis.close();
		fos.close();
		
		System.out.println("복사가 잘 되었습니다.");
	}

}
