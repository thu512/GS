package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : RemoteCon_1029.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 고하윤
* @프로그램 설명           : 전원을 키는 메소드
*/
public class RemoteCon_1029 {
	public boolean turnOn() {
		TV_1029 tv = new TV_1029();
		tv.setPower(true);
		return tv.isPower();
	}
}
