package com.gsitm.java.ex07;

/** 
* @과목명                	: GS ITM 인턴사원 자바교육
* @FileName           	: LoginUser_1030.java 
* @Project             	: gsitm_java2 
* @Date                	: 2018. 4. 2. 
* @작성자                	: 김동범
* @프로그램 설명			: 싱클톤 생성
*/
public class LoginUser_1030 {
	private int idNum = 0;
	private String eName = "";
	private String auth = "";
	
	private static LoginUser_1030 singleton = new LoginUser_1030();
	
	private LoginUser_1030() {};

	public static LoginUser_1030 getInstance() {
		return singleton;
	}

	public int getIdNum() {
		return idNum;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

}
