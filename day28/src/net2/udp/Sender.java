package net2.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Sender {

	public static void main(String[] args) throws IOException {
		//발신자 프로그램
		//메시지 보내기 (반복)
		//사용자에게 입력받아서 메시지를 반복해서 보내기
		//사용자가 exit를 입력하면 메시지 그만 보내기
		Scanner sc= new Scanner(System.in);
		
		InetAddress ip = InetAddress.getByName("211.250.113.45");
		int port = 6262;
		
		DatagramSocket ds = new DatagramSocket();
		
		while (true) {
		System.out.print("메시지를 입력하세요. : ");
		String msg = sc.nextLine();
		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, ip, port );
		ds.send(dp);
			if(msg.equals("exit")) {
			System.out.println("메시지 입력을 종료합니다.");
			break;
		}
		}
		ds.close();
		
	}

}
