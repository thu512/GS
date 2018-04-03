package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : MomCat_1052.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 박보미
* @프로그램 설명           : 오버라이딩 구현 
*/
public class MomCat_1052 {

	public String arm;
	public String leg;
	public String shoulder;
	private String hairColor;

	public void crying() {
		System.out.println("냐옹");
	}

	private void steal() {
		System.out.println("steal");
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public String getArm() {
		return arm;
	}

	public void setArm(String arm) {
		this.arm = arm;
	}

	public String getLeg() {
		return leg;
	}

	public void setLeg(String leg) {
		this.leg = leg;
	}

	public String getShoulder() {
		return shoulder;
	}

	public void setShoulder(String shoulder) {
		this.shoulder = shoulder;
	}

}
