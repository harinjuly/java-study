package net3.tcp2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		//채팅 프로그램 만들기
		//메세지 주고받기.
		Scanner sc = new Scanner(System.in);
		
		int port = 8474;
		
		//소켓 참조변수
		ServerSocket ss = null;
		Socket cs = null;
		//스트링 참조변수
		InputStream in = null;
		OutputStream out = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
		ss = new ServerSocket(port);
		System.out.println("연결 요청을 기다리는 중....");
		
		cs = ss.accept();
		System.out.println(cs.getRemoteSocketAddress() + "사용자와 연결되었습니다.");
		in = cs.getInputStream();
		out = cs.getOutputStream();
		
		dis = new DataInputStream(in);
		dos = new DataOutputStream(out);
		
		while(true) {
			String msg = dis.readUTF();
			System.out.println("받은 메시지 : " +msg);
			if(msg.equals("exit")) {
				System.out.println("연결이 종료됩니다.");
				break;
			}
			System.out.print("보낼 메시지 : ");
			msg= sc.nextLine();
			dos.writeUTF(msg);
			}
		
		}catch(IOException e) {
			System.out.println("오류 발생!");
			
		}finally {
			try {
		sc.close();
		dos.close();
		dis.close();
		out.close();
		in.close();
		cs.close();
		ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	
		
	}

}
