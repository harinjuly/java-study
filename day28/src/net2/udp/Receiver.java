package net2.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {

	public static void main(String[] args) throws IOException {
		//UDP 수신자 프로그램
		//편지받기(반복)
		
		//1. 사용할 포트 지정
		int port = 6262;
		
		//2. 소켓 생성
		DatagramSocket ds = new DatagramSocket(port);
		System.out.println("메시지를 받을 준비가 되었습니다.");
		
		//3. 보관함 생성
		byte[] buffer = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
		
		while(true) {
			//4. 메시지 받아오기
			ds.receive(dp);
			
			//5. 메시지 확인
			String msg = new String(dp.getData(),0,dp.getLength());
			System.out.println(dp.getAddress() + "내용 : " +msg);
			//exit 입력하면 종료
			if(msg.equals("exit")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
		}
		//6. 소켓 닫기
		ds.close();
		
	}

}
