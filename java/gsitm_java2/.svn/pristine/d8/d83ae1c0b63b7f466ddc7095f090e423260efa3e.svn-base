package com.gsitm.java.ex07;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1070.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 주형진
* @프로그램 설명           : 로그인 유저 클래스 싱글톤 패턴
*/
public class LoginUser_1070 {
	private static LoginUser_1070 singleton = new LoginUser_1070();
	private String m_name;
	private int m_empNo;
	private String m_auth;
	
	private LoginUser_1070() {}
	
	private LoginUser_1070(String name, int empNo, String auth) {
		this.setM_name(name);
		this.setM_empNo(empNo);
		this.setM_auth(auth);
	}
	
	public static LoginUser_1070 getInstance() {
		return singleton;
	}

	public static void setSingleton(LoginUser_1070 singleton) {
		LoginUser_1070.singleton = singleton;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public int getM_empNo() {
		return m_empNo;
	}

	public void setM_empNo(int m_empNo) {
		this.m_empNo = m_empNo;
	}

	public String getM_auth() {
		return m_auth;
	}

	public void setM_auth(String m_auth) {
		this.m_auth = m_auth;
	}
}