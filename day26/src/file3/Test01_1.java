package file3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test01_1 {

	public static void main(String[] args) {
		
		//파일에 내용을 입력받아서 새로 만들기.
		
		
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try {
		File file = new File("rescources\\exam2.txt"); //파일생성
		fos = new FileOutputStream(file,true);
		while(true) {
		System.out.print("내용을 입력하세요. (종료 exit): ");
		String str = sc.nextLine(); //입력 받을 내용 .
				if(str.equals("exit")) {
				System.out.println("종료합니다.");
				break; }
		fos.write(str.getBytes());
		fos.write("\n".getBytes());
		// 입력한 내용을 문자로 변환해준다.
		}
			fis = new FileInputStream(file);
			byte[] buffer = new byte[(int) file.length()];
			fis.read(buffer);
			System.out.write(buffer);
		}catch (IOException e){
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
			
		
}

}
