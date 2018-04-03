package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1055.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 이경화
* @프로그램 설명           : 싱글턴을 구현한 클래스. 이름, 사번, 권한을 가진다
*/

public class LoginUser_1055 {
	
	private static LoginUser_1055 singleton = new LoginUser_1055();
	
	private LoginUser_1055() {}
	
	static LoginUser_1055 getInstance() {
		return singleton;
	}
	
	private String name;
	private int number;
	private String auth;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	
	

}
