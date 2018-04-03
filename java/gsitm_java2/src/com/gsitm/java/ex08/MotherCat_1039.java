package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : MotherCat_1039.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 남동길
* @프로그램 설명           : 어미고양이클래스
*/
public class MotherCat_1039 {
	private String purColor;
	public String arm;
	public String leg;
	public String shoulder;
	
	public MotherCat_1039(String purColor, String arm, String leg, String shoulder) {
		super();
		this.purColor = purColor;
		this.arm = arm;
		this.leg = leg;
		this.shoulder = shoulder;
	}
	public MotherCat_1039(String arm, String leg, String shoulder) {
		this.arm = arm;
		this.leg = leg;
		this.shoulder = shoulder;
	}
	
	public void cry() {
		System.out.println("냐옹");
	}
	
	private void stealSomthing() {
		System.out.println("어미 고양이 훔치기 시전");
	}

	public String getPurColor() {
		return purColor;
	}

	public void setPurColor(String purColor) {
		this.purColor = purColor;
	}
	
	
	
}
