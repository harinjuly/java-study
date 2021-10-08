package file1;

import java.io.File;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
		//파일 생성하기(file 클래스 사용)
		
		//D:\\test01.txt -> 절대경로
		File file = new File("resources\\test01.txt");		//상대경로
		
		if(!file.exists()) {  	//파일이 없다면
			try {
				file.createNewFile();
				System.out.println("새로운 파일 생성");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("파일이 생성되지 않았다");
			}  
		}
		
		System.out.println("파일명: " + file.getName());
		System.out.println("파일경로(상대): " + file.getPath());
		System.out.println("파일경로(절대): " + file.getAbsolutePath());
		System.out.println("파일크기: " + file.length());
		
		
	}
}
