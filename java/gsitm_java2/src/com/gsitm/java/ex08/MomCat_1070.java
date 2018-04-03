package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : MomCat_1070.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 주형진
* @프로그램 설명           : 고양이 어미 클래스 정의
*/

public class MomCat_1070 {
	private String hairColor;
	public boolean arm;
	public boolean leg;
	public boolean shoulder;
	
	MomCat_1070(){
		setHairColor("Gray");
		arm = false;
		leg = true;
		shoulder = true;
	}
	
	public void cry() {
		System.out.println("냐옹");
	}
	
	private void steal() {
		System.out.println("훔치다.");
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
}