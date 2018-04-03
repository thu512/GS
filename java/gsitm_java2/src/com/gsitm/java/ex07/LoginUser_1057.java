package com.gsitm.java.ex07;

/** 
* @과목명                 : GS ITM 인턴사원 자바교육
* @FileName             : LoginUser_1057.java 
* @Project              : gsitm_java2 
* @Date                 : 2018. 4. 2. 
* @작성자                 : 이융성
* @프로그램 설명            :
*/
public class LoginUser_1057 {
	private static LoginUser_1057 singleton = new LoginUser_1057();
	private String name ="LEE";
	private int empNum = 1057;
	private boolean auth = false;
	
	public static LoginUser_1057 getSingleton() {
		return singleton;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	public boolean isAuth() {
		return auth;
	}

	public void setAuth(boolean auth) {
		this.auth = auth;
	}

	private LoginUser_1057() {
		
	}
	
	static LoginUser_1057 getInstance() {
		return singleton;
	}
	
}
