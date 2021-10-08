package poly1.basic2;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Phone p[] = new Phone[5];
		Scanner sc = new Scanner(System.in);
		p[0] = new Note20("삼성","SGN-01","SKT","01012345678","블루");
		p[1] = new Note20("삼성","SGN-02","KT","01011112222","블랙");
		p[2] = new Iphone12("애플","AP12-01","LGU","01023234545","화이트");
		p[3] = new Iphone12("애플","AP12-02","KT","01052524587","블루");
		p[4] = new Fold2("삼성","SGP-01","SKT","01025874563","골드");
		
		
		System.out.println("#######  휴대폰 목록  #######");
		
		for(int i = 1; i<=p.length; i++)
			{
			System.out.println(i +"\t" + p[i-1].getMaking() +"\t "+ p[i-1].getSerial()
			+"\t"+ p[i-1].getTelecom() + "\t" +	p[i-1].getColor());
			}

		System.out.println("휴대폰을 선택하세요.");
		int select = sc.nextInt();
		
		if(select>0 && select <= p.length) {
		p[select-1].call();
		p[select-1].msg();
		p[select-1].pic();
		if(p[select-1] instanceof Note20) {
			((Note20)p[select-1]).pay();
		} else if(p[select-1] instanceof Fold2) {
			((Fold2)p[select-1]).display();
		}else if(p[select-1] instanceof Iphone12) {
			((Iphone12)p[select-1]).gesture();
		}		
		}
		
		
//		switch(select) {
//		case 1 :
//			p[0].call();
//			p[0].msg();
//			p[0].pic();
//			((Note20)p[0]).pay();
//			break;
//		case 2 :
//			p[1].call();
//			p[1].msg();
//			p[1].pic();
//			((Note20)p[1]).pay();
//			break;
//		case 3 :
//			p[2].call();
//			p[2].msg();
//			p[2].pic();
//			((Iphone12)p[2]).gesture();
//			break;
//		case 4 :
//			p[3].call();
//			p[3].msg();
//			p[3].pic();
//			((Iphone12)p[3]).gesture();
//			break;
//		case 5 :
//			p[4].call();
//			p[4].msg();
//			p[4].pic();
//			((Fold2)p[4]).display();
//			break;
//		
//		}
		
		
		
	}

}
