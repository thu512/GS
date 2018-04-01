package com.gsitm.java.ex05;

/** 
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: Tv_1072.java
 * @Project			: gsitm_java2
 * @Date			: 2018. 3. 30.
 * @작성자			: 차주현
 * @프로그램 설명		: 멤버변수 power를 갖고있고, 상태 변화에 따라 콘솔에 로그를 남기는 클래스
 * 					
 */
public class Tv_1072 {
	private boolean power;
	public Tv_1072() {
		// TODO Auto-generated constructor stub
		this.power = false;
	}
	/**
	 * @param power
	 * @return
	 */
	public boolean setPower(boolean power) {
		this.power = power;
		printPowerState();
		return this.power;
	}
	public void printPowerState() {
		System.out.println("Tv가 "+(this.power?"켜졌습니다.":"꺼졌습니다."));
	}
}
