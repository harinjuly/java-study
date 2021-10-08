package net3.tcp1;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01 {

	public static void main(String[] args) throws IOException {
		// TCP - 연결 요청을 받아주는 프로그램(server)

		//1. 서버에서 사용할 포트번호 지정
		int port = 6262;
		
		//2. 서버용 소켓 객체 생성(클라이언트로부터 요청을 받아줄 객체)
		ServerSocket sSocket = new ServerSocket(port);
		
		//3. 연결 요청이 오면 요청 수락 후 해당 클라이언트 소켓 객체 생성
		Socket cSocket = sSocket.accept();
		
		//4. 클라이언트와 데이터를 주고받을 입출력 스트림 생성
		InputStream in = cSocket.getInputStream();
		
		//5. (필요시) 기반스트림 을 도와줄 보조스트림 생성
		DataInputStream dis = new DataInputStream(in);
		
		//6. 가져온 데이터 사용(출력)
		System.out.println(dis.readUTF());
		
		//7. 소켓 닫기
		dis.close();
		in.close();
		cSocket.close();
		sSocket.close();
				
		
		
	}

}
