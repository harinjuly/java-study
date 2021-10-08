package net3.tcp1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Test02 {

	public static void main(String[] args) throws IOException {
		// TCP - 연결 요청을 보내는 프로그램 (Client)
		
		//1. 연결한 서버의 IP주소와 port 지정
		String serverIp = "127.0.0.1";  //우선 나한테 연결
		int port = 6262;
		
		//2. 서버와 연결할 클라이언트 소켓 객체 생성 ->연결 요청
		Socket socket = new Socket(serverIp, port);
		// -객체 생성시 서버와 자동으로 연결 요청함.
		// -연결 실패시  null 리턴
		// -연결을 끊고나서 다시 연결을 하고 싶은 경우 .connect() 메소드 사용
		System.out.println(socket.getRemoteSocketAddress() + " 서버와 연결되었습니다.");
		
		//3. 서버와 데이터를 주고받을 입출력 스트림 생성
		OutputStream out = socket.getOutputStream();
				
		//4. 기반 스트림을 도와줄 보조 스트림 생성
		DataOutputStream dos = new DataOutputStream(out);
				
		//5. 데이터 사용(서버로 데이터 보내기)
		dos.writeUTF("안녕하세요~!");
		
		//6. 소켓 닫기
		dos.close();
		out.close();
		socket.close();
		

	}

}
