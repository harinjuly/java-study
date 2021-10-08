package file3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in); 
			
			FileOutputStream fos = null;
			FileInputStream fis = null;
			
			try {
				File file = new File("rescources\\exam1.txt");
				fos = new FileOutputStream(file,true);
				while(true) {
					System.out.print("문자열을 입력하세요(종료exit):  ");
					String str = sc.nextLine();
						if(str.equals("exit"))
						break;
					fos.write(str.getBytes());
					fos.write("\n".getBytes());
								}
			//저장된 내용 불러와서 출력하기
				fis = new FileInputStream(file);
				byte [] buffer = new byte[(int) file.length()];
				fis.read(buffer);
				System.out.write(buffer);
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			
			
		

}
	} 
