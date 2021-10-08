package net3.tcp1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Test04_Cilent {

	public static void main(String[] args) throws IOException {
		//클라이언트
		
		String sip = "112.221.47.69";
		int port = 6262;
		
		Socket socket = new Socket(sip,port);
		System.out.println(socket.getRemoteSocketAddress() + " 서버와 연결되었습니다.");
		
		OutputStream out = socket.getOutputStream();
		
		DataOutputStream dos = new DataOutputStream(out);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메시지를 입력하세요.");
		while(true) {
		String str = sc.nextLine();
		dos.writeUTF(str);
			if(str.equals("exit")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
		}
			
		dos.close();
		out.close();
		socket.close();
				
		
	}

}
