package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Tv_1066.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 정진
* @프로그램 설명           : TV 클래스
*/
public class Tv_1066 {
	private boolean power;

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;

		if (power) {
			System.out.println("TV가 켜집니다.");
		} else {
			System.out.println("TV가 꺼집니다.");
		}
	}

}
