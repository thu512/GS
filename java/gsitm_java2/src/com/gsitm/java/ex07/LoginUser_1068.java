package com.gsitm.java.ex07;

/**
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : LoginUser_1068.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 4. 2.
 * @작성자            : 조은솔
 * @프로그램 설명            : 싱글턴 예제
 */
public class LoginUser_1068 {
	
	private String name = "조은솔";
	private int eId = 1068;
	private String authority = "인턴사원";
	private static LoginUser_1068 singleton = new LoginUser_1068();
	//생성자
	private LoginUser_1068() {
		super();
		// TODO Auto-generated constructor stub
	}
	//정적 메소드
	public static LoginUser_1068 getInstance() {
		return singleton;
	}
	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	
	

}
