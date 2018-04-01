package com.gsitm.java.ex05;

/** 
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: RemoteCon_1072.java
 * @Project			: gsitm_java2
 * @Date			: 2018. 3. 30.
 * @작성자			: 차주현
 * @프로그램 설명		: Tv_1072 객체를 멤버 변수로 갖고 있고, Tv를 켜고 끄는 객체이다.
 */
public class RemoteCon_1072 {
	private Tv_1072 tv;
	/**
	 * 매개변수가 없으면, Tv_1072 클래스를 인스턴스화한다.
	 */
	public RemoteCon_1072() {
		this.tv = new Tv_1072();
	}
	/**
	 * @param tv
	 */
	public RemoteCon_1072(Tv_1072 tv) {
		// TODO Auto-generated constructor stub
		this.tv = tv;
	}
	public boolean turnOnTv() {
		return tv.setPower(true);
	}
	public boolean turnOffTv() {
		return tv.setPower(false);
	}
}
