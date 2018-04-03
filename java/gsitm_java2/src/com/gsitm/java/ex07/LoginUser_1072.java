package com.gsitm.java.ex07;

/** 
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: LoginUser_1072.java
 * @Project			: gsitm_java2
 * @Date			: 2018. 4. 2.
 * @작성자			: 차주현
 * @프로그램 설명	: 유저의 싱글턴 클래스로 이름, 사번, 권한 멤버변수를 갖습니다.
 */
public class LoginUser_1072 {
	private static LoginUser_1072 loginUser = new LoginUser_1072();
	
	private String name;
	private String idNum;
	private String auth;
	
	private LoginUser_1072() {}
	
	public static LoginUser_1072 getInstance() {
		return loginUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}
	
}
