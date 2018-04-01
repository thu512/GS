package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : RemoteCon_1061.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 임혜성
* @프로그램 설명           : 리모컨 전원을 키는 메소드 정의
*/
public class RemoteCon_1061 {
	public boolean powerOn(Tv_1061 tv) {
		//Tv_1061 tv = new Tv_1061();
		tv.setPower(true);
		return tv.isPower();
	}
}
