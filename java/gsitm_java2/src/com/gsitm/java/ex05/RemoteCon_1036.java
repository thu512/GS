package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : RemoteCon_1036.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 김준혁
* @프로그램 설명         : 리모컨기능
*/
public class RemoteCon_1036 {
	private Tv_1036 tv;

	public Tv_1036 getTv() {
		return tv;
	}

	public void setTv(Tv_1036 tv) {
		this.tv = tv;
	}

	public void powerOn() {
		tv.setPower(true);
	}

	public void powerOff() {
		tv.setPower(false);
	}
}
