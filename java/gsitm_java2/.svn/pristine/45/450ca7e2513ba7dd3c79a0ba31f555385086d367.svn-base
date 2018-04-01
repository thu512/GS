package com.gsitm.java.ex05;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Tv_1065.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 정광수
* @프로그램 설명           :  TV클래스
*/
public class Tv_1065 {

	private boolean tvState;

	private static Tv_1065 tv = new Tv_1065();
	private Tv_1065() {}
	public static Tv_1065 getInstance() {
		return tv;
	}

	public void setTvState(boolean tvState) {
		this.tvState = tvState;
		System.out.println("tv가 켜졌어요");
	}

	public void turnOnTv(boolean state) {
		this.tvState = state;
		System.out.println("tv가 켜졌어요");
	}

	public void turnOffTv(boolean state) {
		this.tvState = state;
		System.out.println("tv가 꺼졌어요");
	}

}
