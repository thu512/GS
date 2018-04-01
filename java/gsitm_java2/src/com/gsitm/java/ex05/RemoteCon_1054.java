package com.gsitm.java.ex05;

/** 
* @과목명			: GS ITM 인턴사원 자바교육 <br>
* @FileName		: RemoteCon_1054.java <br>
* @Project		: gsitm_java2 <br>
* @Date			: 2018. 3. 30. <br>
* @작성자			: 이경민 <br>
* @프로그램 설명	: 전원을 키다 메소드를 통해 Tv 전원 켜기
*/
public class RemoteCon_1054 {

	Tv_1054 tv;
	
	/**
	 * 
	 */
	public RemoteCon_1054() {
		super();
		this.tv = new Tv_1054();
	}

	/**
	 * @param tv
	 */
	public RemoteCon_1054(Tv_1054 tv) {
		super();
		this.tv = tv;
	}

	public boolean turnOnTv() {
		return tv.turnOnPower();
		
	}
	
	public boolean turnOffTv() {
		return tv.turnOffPower();
	}
	
}
