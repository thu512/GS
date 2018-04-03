package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1029.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 고하윤
* @프로그램 설명           : 이름, 사번, 권한을 갖는 클래스
*/
public class LoginUser_1029 {
	private String name;
	private int employeeNum;
	private boolean authority;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}

	public boolean isAuthority() {
		return authority;
	}

	public void setAuthority(boolean authority) {
		this.authority = authority;
	}

	private static LoginUser_1029 user = new LoginUser_1029();
	
	private LoginUser_1029() {
		this.name = "하윤";
		this.employeeNum = 1029;
		this.authority = true;
	}
	
	static LoginUser_1029 getInstance() {
		return user;
	}
}
