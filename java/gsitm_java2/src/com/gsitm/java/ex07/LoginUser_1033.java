package com.gsitm.java.ex07;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : LoginUser_1033.java
 * @Project         : gsitm_java 
 * @Date            : 2018. 4. 2. 
 * @작성자            : 김윤지
 * @프로그램 설명                : 로그인 유저 싱글턴
 */
public class LoginUser_1033 {
	
	// 정적 필드
	private static LoginUser_1033 singleton = new LoginUser_1033();
	private String name = null;
	private String eid = null;
	private String authority = null;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	// 생성자
	private LoginUser_1033() {
		
	}
	
	// 정적 메소드
	static LoginUser_1033 getInstance() {
		return singleton;
	}
}
