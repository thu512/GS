package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1066.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 정진
* @프로그램 설명           : 로그인 객체
*/
public class LoginUser_1066 {
	private static LoginUser_1066 singleton = null;
	
	private String name = "정진";
	private String id = "1066";
	private boolean authorization = true;
	
	private LoginUser_1066() {
		
	}
	
	public static LoginUser_1066 getInstance() {
		if (singleton == null) {
			singleton = new LoginUser_1066();
		}

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

	public boolean isAuthorization() {
		return authorization;
	}

	public void setAuthorization(boolean authorization) {
		this.authorization = authorization;
	}

}
