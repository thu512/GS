package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1052.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 박보미
* @프로그램 설명           : 싱글톤 구현 
*/
public class LoginUser_1052 {

	private static LoginUser_1052 login = null;
	
	private String name;
	private int number;
	private String auth;

	private LoginUser_1052() {
	}

	public static synchronized LoginUser_1052 getInstance() {
		if(login == null) {
			login = new LoginUser_1052();
		}
		return login;
	}
	
	public void init(String name, int number, String auth){
		setName(name);
		setNumber(number);
		setAuth(auth);
	}

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
