package oop.modifier3;

//회원정보 = 아이디 + 비번 + 닉네임
// 아이디는 변경 불가, 비번 닉네임은 변경 가능
// 변경 불가 키워드인 final 사용.

public class Member {
	
	private final String id;
	private String password;
	private String nickname;

	public Member(String id,String password,String nickname) {
		this.id=id;
		this.password = password;
		this.nickname=nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getId() {
		return id;
	}
	
	
// final 항목은 setter 메소드 생성 불가
//	final 항목을 초기화 할 수 없다.
// public void setId(String id) {
//		this.id=id;
//	}
//		
	
	
}
