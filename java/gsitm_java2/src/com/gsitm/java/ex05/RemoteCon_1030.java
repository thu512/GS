package com.gsitm.java.ex05;

/** 
* @과목명                	: GS ITM 인턴사원 자바교육
* @FileName           	: RemoteCon_1030.java 
* @Project             	: gsitm_java2 
* @Date                	: 2018. 3. 30. 
* @작성자                	: 김동범
* @프로그램 설명			: 기능 구현
*/
public class RemoteCon_1030 {
	
	Tv_1030 tv = new Tv_1030();
	void turnOn() {
		tv.setPower(true);
		System.out.println(tv.isPower());
	}
	void turnOff() {
		tv.setPower(false);
		System.out.println(tv.isPower());
	}
}
