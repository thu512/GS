package com.gsitm.java.ex07;

/** 
* @과목명    		: GS ITM 인턴사원 자바교육
* @FileName		: LoginUser_1058.java 
* @Project  	: gsitm_java2 
* @Date     	: 2018. 4. 2. 
* @작성자     	: 이인성
* @프로그램 설명	: 
*/
public class LoginUser_1058 {

	private static LoginUser_1058 singleton = new LoginUser_1058();

	private String name = "이인성";
	private String id = "IT1058";
	private String authority = "인턴";
	
	private LoginUser_1058() {}
	
	static LoginUser_1058 getInstance() {
		return singleton;
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
