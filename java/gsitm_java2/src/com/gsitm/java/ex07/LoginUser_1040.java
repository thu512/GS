package com.gsitm.java.ex07;
/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1040.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 노종범
* @프로그램 설명           : 싱글턴 구현 클래스
*/

public class LoginUser_1040 {
	
	private static LoginUser_1040 singleton = new LoginUser_1040();
	
	private String name= "";
	private int no = 0;
	private String power = "";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}

	
	private LoginUser_1040() {}
	static LoginUser_1040 getInstance() {
		return singleton;
	}
	

	

}
