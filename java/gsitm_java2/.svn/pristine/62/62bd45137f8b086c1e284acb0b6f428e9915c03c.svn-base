package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1036.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 김준혁
* @프로그램 설명         : 싱글톤 객체 만들기
*/
public class LoginUser_1036 {
	private static LoginUser_1036 singleton = new LoginUser_1036();	
	private String name;
	private String number;
	private boolean authority;
	
	private LoginUser_1036() {}
	
	static LoginUser_1036 getInstance() {
		return singleton;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public boolean getAuthority() {
		return authority;
	}

	public void setAuthority(boolean authority) {
		this.authority = authority;
	}
}
