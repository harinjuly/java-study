package net1.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Test02 {

	public static void main(String[] args) throws IOException {
		// UDP - 메시지를 받는 프로그램(수신자)
		//편지 받기.
		System.out.println("수신자 (test02)");
		//1. 메시지 받을 포트 지정
		int port = 34054;
		
		//2. 메시지를 받아줄 DatagramSocket 객체 생성(우체국)
		//메시지를 받아줄 포트번호를 지정해줘야함.
		DatagramSocket ds = new DatagramSocket(port);
		
		//3. 메시지를 받아서 저장할 객체 생성(편지 보관함)
		//얼만큼 받아서 어디에 저장할지 미리 지정.
		byte[] buffer = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
		
		//4. 메시지 받기
		// 소켓(우체국)으로 메시지를 전송받아서 패킷(편지보관함)에 저장
		ds.receive(dp);
		
		//5.메시지 확인
		// byte[]로 전달받은 데이터 -> 문자열로 변환해서 확인
		//String msg = new String(dp.getData());
		// 데이터 전체 저장시 byte[] 크기만큼 공백이 생김.
		// new String(데이터, 시작위치, 개수);
		String msg = new String(dp.getData(),0,dp.getLength());
		System.out.println(msg);
		
		//소켓닫기
		ds.close();
				
		

	}

}
