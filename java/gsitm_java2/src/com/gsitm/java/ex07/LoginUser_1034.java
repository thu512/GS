package com.gsitm.java.ex07;

/**
 * <pre>
* 1. 패키지명 : com.gsitm.java.ex07
* 2. 타입명 : LoginUser_1034.java
* 3. 작성일 : 2018. 4. 2. 오전 9:51:48
* 4. 작성자 : JongJoo
* 5. 설명 : 싱글톤 만들기.
 * </pre>
 */
public class LoginUser_1034 {

	private String name;
	private int c_num;
	private boolean auth;

	private LoginUser_1034() {
		this.name = "김종주";
		this.c_num = 1034;
		this.auth = true;
	}

	private static LoginUser_1034 singleton = new LoginUser_1034();

	public static LoginUser_1034 getSingleton() {
		return singleton;
	}

	public static void setSingleton(LoginUser_1034 singleton) {
		LoginUser_1034.singleton = singleton;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getC_num() {
		return c_num;
	}

	public void setC_num(int c_num) {
		this.c_num = c_num;
	}

	public boolean isAuth() {
		return auth;
	}

	public void setAuth(boolean auth) {
		this.auth = auth;
	}

}
