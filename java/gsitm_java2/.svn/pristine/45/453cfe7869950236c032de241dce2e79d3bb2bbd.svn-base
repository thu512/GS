package com.gsitm.java.ex07;
/** 
* @과목	            : GS ITM 인턴사원 자바교육
* @FileName         : Menu_1048.java 
* @Project          : gsitm_java2 
* @Date             : 2018. 4. 2. 
* @작성자			    : 신종욱
* @프로그램 설명       : 싱글톤을 디자인 패턴을 이용한 로그인 연습 프로그램
*/
public class LoginUser_1048 {
//	정적 필드선언
	private static LoginUser_1048 login = new LoginUser_1048();
//	변수
	private String name;
	private int eNum;
	private String auth;
	
//	setter, getter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int geteNum() {
		return eNum;
	}

	public void seteNum(int eNum) {
		this.eNum = eNum;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}
//	private 생성자를 통해 다른 클래스에서 new못하게 막음
	private LoginUser_1048() {
	}
//	정적 메소드를 사용하여 어디에서든 사용할 수 있도록 리턴값은 처음 생성한 클래스의 값
	static LoginUser_1048 getInstance() {
		return login;
	}
}
