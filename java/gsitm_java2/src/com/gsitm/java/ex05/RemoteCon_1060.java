package com.gsitm.java.ex05;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : RemoteCon_1060.java
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자              : 이창주
* @프로그램 설명       : 리모컨 클래스
*/
public class RemoteCon_1060 {
	
	public boolean powerOnOff(Tv_1060 tv) {
		if(tv.isPower()) {
			tv.setPower(false);
			System.out.print("Tv전원이 꺼졌습니다.");
		}else {
			tv.setPower(true);
			System.out.print("Tv전원이 켜졌습니다.");
		}
		return tv.isPower();
	}
}
