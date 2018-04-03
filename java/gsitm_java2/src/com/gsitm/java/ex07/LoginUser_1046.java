package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1046.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 손혜성
* @프로그램 설명           : 싱글톤연습(로그인유저) 
*/
public class LoginUser_1046 {
	private static LoginUser_1046 singleton = new LoginUser_1046();
	private String name;
	private String id;
	private String right;
	
	public String getRight() {
		return right;
	}
	public void setRight(String right) {
		this.right = right;
	}
	private LoginUser_1046() {}
	static LoginUser_1046 getInstance() {
		return singleton;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
