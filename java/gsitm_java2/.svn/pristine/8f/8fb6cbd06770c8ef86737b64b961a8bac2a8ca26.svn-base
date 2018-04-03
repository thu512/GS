package com.gsitm.java.ex07;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1060.java
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자              : 이창주
* @프로그램 설명       : 싱글턴 실습
*/
public class LoginUser_1060 {
	private String name="이창주";
	private String sabun="IT1060";
	private String authority="관리자";
	
	private static LoginUser_1060 lu = new LoginUser_1060();
	private LoginUser_1060() {}
	static LoginUser_1060 getInstance() {
		return lu;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSabun() {
		return sabun;
	}
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
}
