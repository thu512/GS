package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Cat_1053.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 은종현
* @프로그램 설명           : 상속 실습 (cat class)
*/
public class Cat_1053 {
	private String hairColor;
	public boolean arm;
	public boolean leg;
	public boolean shoulder;

	public Cat_1053() {
		this.hairColor = "white";
		this.arm = true;
		this.leg = true;
		this.shoulder = true;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public boolean isArm() {
		return arm;
	}

	public void setArm(boolean arm) {
		this.arm = arm;
	}

	public boolean isLeg() {
		return leg;
	}

	public void setLeg(boolean leg) {
		this.leg = leg;
	}

	public boolean isShoulder() {
		return shoulder;
	}

	public void setShoulder(boolean shoulder) {
		this.shoulder = shoulder;
	}

	public void howl() {
		System.out.println("냐옹");
	}

	private void steel() {
		System.out.println("steel!");
	}
}
