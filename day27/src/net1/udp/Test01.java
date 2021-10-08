package net1.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Test01 {

	public static void main(String[] args) throws IOException  {
	
			//UDP
			//편지보내기.
		System.out.println("발신자 (test01)");
		//1. 메시지를 받는 수신자의 주소 지정(친구 집주소 알아내기)
		//InetAddress 자바에서 네트워크 주소를 다루기 위해 제공하는 클래스(new로 객체 생성 불가, static 메소드로 객체 생성)
		InetAddress ip = InetAddress.getByName("211.219.119.87");	//내 컴퓨터 아이피 주소 지정
		int port = 9292;
		
		//2. 메시지를 보내줄 DatagramSocket 객체 생성(우체국)
		DatagramSocket ds = new DatagramSocket();
		
		//3. 보내고 싶은 메시지 생성(편지지)
		String msg = "안녕하세요~!";
		
		//4. DatagramPacket 객체를 생성해서 담아줌 (편지봉투)
		//메시지, 메시지크기, 수신자 Ip주소, 수신자의 port주소
		//byte[] 형태로 변환해줘야한다
		//ip주소는 InetAddress 클래스 타입으로 지정
		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ip, port);
		
		//5. 메시지 전송
		// 소켓(우체국)에 패킷(편지봉투) 전달해서 메시지 전송
		ds.send(dp);
		
		//6. 소켓 닫기
		ds.close();
		
		
		
		
	}

}
// IPv4 주소 . . . . . . . . . : 211.219.119.87