package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1053.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 은종현
* @프로그램 설명           : 싱글턴 실습 LoginUser
*/
public class LoginUser_1053 {
	private String name;
	private int sabun;
	private boolean authority;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public boolean isAuthority() {
		return authority;
	}

	public void setAuthority(boolean authority) {
		this.authority = authority;
	}

	private LoginUser_1053() {

	}
	
	private static LoginUser_1053 loginUser = new LoginUser_1053();
	
	public static LoginUser_1053 getInstance() {
		return loginUser;
	}

	@Override
	public String toString() {
		return "LoginUser_1053 [name=" + name + ", sabun=" + sabun + ", authority=" + authority + "]";
	}


}
