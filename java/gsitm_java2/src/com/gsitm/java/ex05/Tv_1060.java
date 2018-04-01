package com.gsitm.java.ex05;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Tv_1060.java
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자              : 이창주
* @프로그램 설명       : TV클래스
*/
public class Tv_1060 {
	private boolean power;
	private static Tv_1060 tv;
	private Tv_1060() {
	}
	public static Tv_1060 getInstance() {
		if (tv == null) 

			tv = new Tv_1060();  

			return tv; 
	}
	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
}
