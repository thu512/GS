package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1043.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 백기반
* @프로그램 설명           : singleton 예제
*/
public class LoginUser_1043 {
	
	private String name = "백기반";
	private int number = 1043;
	private String pub = "관리자";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	
	private static LoginUser_1043 singleton = new LoginUser_1043();
	
	private LoginUser_1043() {
		
	}
	
	static LoginUser_1043 getInstance() {
		return singleton;
	}
	
}
