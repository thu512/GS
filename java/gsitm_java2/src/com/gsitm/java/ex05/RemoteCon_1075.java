package com.gsitm.java.ex05;

/**
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: ScannerUpper_1075.java
 * @Project			: gsitm_java
 * @Date			: 2018. 3. 30.
 * @작성자			: 최영롱
 * @프로그램 설명	: 리모컨 전원을 키는 메소드를 정의한 클래스
 */
public class RemoteCon_1075 { //리모콘을 만든 것
	
	public boolean powerSwitch(Tv_1075 tv) { //Tv의 전원을 끄거나 키는 메소드
		if(tv.isPower()) {
			tv.setPower(false);
		}else {
			tv.setPower(true);
		}
		return tv.isPower();
	}
}
