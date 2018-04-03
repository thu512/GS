package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1042.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 박소현
* @프로그램 설명           : 싱글톤 객체 구현
*/
public class LoginUser_1042 {
	
	private static LoginUser_1042 login = new LoginUser_1042();
	
	private String name = null;
	private String id = null;
	private String authority = null;
	
	private LoginUser_1042() {
		setName("박소현");
		setId("IT1042");
		setAuthority("RRW");
	}
	
	static LoginUser_1042 getInstance() {
		return login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
}
