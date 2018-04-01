package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1066.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 정진
* @프로그램 설명           : TV조작하는 사람
*/
public class Human_1066 {

	public static void main(String[] args) {
		RemoteCon_1066 remoteCon_1066 = new RemoteCon_1066();
		Tv_1066 tv_1066 = new Tv_1066();
		remoteCon_1066.setTv(tv_1066);

		remoteCon_1066.powerOn();
		// remoteCon_1066.powerOff();
	}

}
