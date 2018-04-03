package com.gsitm.java.ex08;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ParentCat_1035.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 김주승
* @프로그램 설명           : 
*/
public class ParentCat_1035 {
	private String hair = "blue";
	public boolean arm = true;
	public boolean leg = true;
	public boolean shoulder = true;

	public String getHair() {
		return hair;
	}

	public void setHair(String hair) {
		this.hair = hair;
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

	public void cry() {
		System.out.println("냐옹");
	}
	
	private void steal() {
		System.out.println("마음을 훔쳐버렸다");
	}
}
