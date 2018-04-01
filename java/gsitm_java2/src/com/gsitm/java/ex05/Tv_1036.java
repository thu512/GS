package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Tv_1036.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 김준혁
* @프로그램 설명         : 티비기능
*/
public class Tv_1036 {
	private boolean power;

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;

		if (power) {
			System.out.println("TV가 켜졌습니다..");
		} else {
			System.out.println("TV가 꺼졌습니다.");
		}
	}
}
