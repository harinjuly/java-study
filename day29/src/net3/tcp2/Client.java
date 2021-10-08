package net3.tcp2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		String sip = "127.0.0.1";
		int port = 8474;
		
		Socket s = null;
		InputStream in = null;
		OutputStream out =null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
		s = new Socket(sip,port);
				
		out = s.getOutputStream();
		in = s.getInputStream();
		
		dos = new DataOutputStream(out);
		dis = new DataInputStream(in);

		String msg = null;
		while(true) {
		System.out.print("요청 메시지 : ");
		msg = sc.nextLine();
		dos.writeUTF(msg); //출력
		if(msg.equals("exit")) {
			System.out.println("연결이 종료됩니다.");
			break;
		}
		msg = dis.readUTF();
		System.out.println("받은 메시지 : " + msg);
		}
		
		
		} catch(IOException e) {
			System.out.println("오류 발생!");
		}
		finally { 
		try {
		dos.close();
		dis.close();
		in.close();
		out.close();
		s.close();
		sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	}
}
