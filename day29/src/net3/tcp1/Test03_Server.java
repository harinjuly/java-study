package net3.tcp1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test03_Server {

	public static void main(String[] args) throws IOException {
		//서버
		int port = 8888; 		
		
		ServerSocket ss = new ServerSocket(port);
		System.out.println("연결 요청을 기다리는 중 ...");
		
		//클라이언트 소켓
		Socket cs = ss.accept();
		System.out.println(cs.getRemoteSocketAddress() + " 사용자와 연결되었습니다.");
		InputStream in = cs.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		
		while(true) {
			String msg = dis.readUTF();
			System.out.println(msg);
			if(msg.equals("exit")) {
				break;
			}
		}
		
		
		//닫기
		dis.close();
		in.close();
		cs.close();
		ss.close();
		
		
		
	}

}
