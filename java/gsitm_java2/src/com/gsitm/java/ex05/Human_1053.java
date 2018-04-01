package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1053.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 은종현
* @프로그램 설명           : 휴먼 클래스
*/
public class Human_1053 {

	public static void main(String[] args) {
		boolean turn = true;
		Tv_1053 tv = new Tv_1053();
		tv.setIsOn(turn);
		RemoteCon_1053 remote = new RemoteCon_1053();
		remote.turnTv(tv);
	}

}
