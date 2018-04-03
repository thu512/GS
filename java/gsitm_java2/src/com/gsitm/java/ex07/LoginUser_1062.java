package com.gsitm.java.ex07;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName         : LoginUser_1062.java 
 * @Project            : gsitm_java2 
 * @Date            : 2018. 4. 2. 
 * @작성자            : 장동주
 * @프로그램 설명      :  싱글톤 형태의 Logiun User 객체입니다.
 */
public class LoginUser_1062 {
	
	private static LoginUser_1062 loginUser_1062= new LoginUser_1062();
	
	private String name;
	private int id;
	private boolean auth;
	
	private LoginUser_1062(){}
	
	static LoginUser_1062 getInstance() {
		return loginUser_1062;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAuth() {
		return auth;
	}

	public void setAuth(boolean auth) {
		this.auth = auth;
	}


}
