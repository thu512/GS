package com.gsitm.java.ex05;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : RemoteCon_1065.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 정광수
* @프로그램 설명           : 리모컨클래스
*/
public class RemoteCon_1065 {

	public static RemoteCon_1065 remote = new RemoteCon_1065();
	public Tv_1065 tv= Tv_1065.getInstance();
	
	private RemoteCon_1065() {}

	public static RemoteCon_1065 getInstance() {
		return remote;
	}

	public void turnOn() {
		tv.turnOnTv(true);
	}

	public void turnOff() {
		tv.turnOffTv(false);
	}

}
