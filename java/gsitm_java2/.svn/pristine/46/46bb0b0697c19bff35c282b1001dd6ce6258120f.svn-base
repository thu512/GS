package com.gsitm.java.ex07;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: LoginUser_1069.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 4. 2. 
* @작성자					: 조현우
* @프로그램 설명			: 싱글톤 및 private 설정후 getter/setter를 이용한 사번, 이름, 권한 출력문제
*/
public class LoginUser_1069 {
	private static LoginUser_1069 singleton = new LoginUser_1069();
	private String name;
	private String deptNum;
	private boolean auth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptNum() {
		return deptNum;
	}

	public void setDeptNum(String deptNum) {
		this.deptNum = deptNum;
	}

	public boolean isAuth() {
		return auth;
	}

	public void setAuth(boolean auth) {
		this.auth = auth;
	}

	public static LoginUser_1069 getSingleton() {
		return singleton;
	}

	public static void setSingleton(LoginUser_1069 singleton) {
		LoginUser_1069.singleton = singleton;
	}

}
