package com.gsitm.java.ex07;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName         : LoginUser_1065.java 
* @Project          : gsitm_java2 
* @Date           	: 2018. 4. 2. 
* @작성자           	: 정광수
* @프로그램 설명       : User객체 싱글톤으로 구현
*/
public class LoginUser_1065 {
	/**이름*/
	private String name;
	/**사번*/
	private int sabun;
	/**권한*/
	private int privilege;

	private static LoginUser_1065 loginUser_1065=new LoginUser_1065();
	/**기본생성자 -pivate*/
	private LoginUser_1065() {}
	
	public static LoginUser_1065 getInstance() {
		return loginUser_1065;
	}

	/**Getter Setter*/
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

	public int getPrivilege() {
		return privilege;
	}

	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}

	public static LoginUser_1065 getLoginUser_1065() {
		return loginUser_1065;
	}

	public static void setLoginUser_1065(LoginUser_1065 loginUser_1065) {
		LoginUser_1065.loginUser_1065 = loginUser_1065;
	}

	@Override
	public String toString() {
		return "LoginUser_1065 [name=" + name + ", sabun=" + sabun + ", privilege=" + privilege + "]";
	}
	
	

}
