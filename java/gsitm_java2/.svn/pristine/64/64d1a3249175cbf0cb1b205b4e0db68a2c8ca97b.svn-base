package com.gsitm.java.ex07;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: LoginUser_1074.java 
* @Project			: gsitm_java2 
* @Date				: 2018. 4. 2. 
* @작성자				: 최규호
* @프로그램 설명		: 싱글톤 관련 프로그램
*/
public class LoginUser_1074 {
	
	private String name;
	private int num;
	private boolean allow;
	
	private static LoginUser_1074 loginUser = new LoginUser_1074();
	
	private LoginUser_1074() {}
	
	static LoginUser_1074 getInstance() {
		return loginUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isAllow() {
		return allow;
	}

	public void setAllow(boolean allow) {
		this.allow = allow;
	}
	
}
