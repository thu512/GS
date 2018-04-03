package com.gsitm.java.ex08;

/**
 * @과목명 : GS ITM 인턴사원 자바교육
 * @FileName : MomCat_1062.java
 * @Project : gsitm_java2
 * @Date : 2018. 4. 3.
 * @작성자 : 장동주
 * @프로그램 설명 : 어미고양이는 "냐옹"이라고 웁니다.
 */
public class MomCat_1062 {
	private String color;

	public String arm;
	public String leg;
	public String shoulder;

	public void cry() {
		System.out.println("냐옹");
	}

	private void steal() {
		System.out.println("훔치다");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
