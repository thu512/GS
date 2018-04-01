package com.gsitm.java.ex05;

/** 
 * @과목명			: GS ITM 인턴사원 자바교육 <br>
 * @FileName		: Tv_1054.java <br>
 * @Project		: gsitm_java2 <br>
 * @Date			: 2018. 3. 30. <br>
 * @작성자			: 이경민 <br>
 * @프로그램 설명	: 전원 상태를 나타내는 boolean값
 */
public class Tv_1054 {

	private boolean tvPower;

	/**
	 * 
	 */
	public Tv_1054() {
		super();
		this.tvPower = false;
	}

	/**
	 * @param tvPower
	 */
	public Tv_1054(boolean tvPower) {
		super();
		this.tvPower = tvPower;
	}

	public boolean turnOnPower() {
		this.tvPower = true;
		return this.tvPower;
	}

	public boolean turnOffPower() {
		this.tvPower = false;
		return this.tvPower;
	}
	/**
	 * tv전원 토글 메소드
	 * @return 상태값 반전
	 */
	public boolean togglePower() {

		this.tvPower = !this.tvPower;

		return this.tvPower;
	}


}
