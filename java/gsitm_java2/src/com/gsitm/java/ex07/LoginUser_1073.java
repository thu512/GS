package com.gsitm.java.ex07;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LoginUser_1073.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 2. 
* @작성자                : 채유진
* @프로그램 설명           : 싱글톤 예제
*/
public class LoginUser_1073 {
	private static LoginUser_1073 singleton = new LoginUser_1073();
	
	private String name = "채유진";
	private int empNum = 1073;
	private String right = "사원";
	
	static LoginUser_1073 getInstance() {
		return singleton;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public String getRight() {
		return right;
	}
	public void setRight(String right) {
		this.right = right;
	}
	
}
