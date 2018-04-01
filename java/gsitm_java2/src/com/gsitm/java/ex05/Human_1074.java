package com.gsitm.java.ex05;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: Human_1074.java 
* @Project			: gsitm_java2 
* @Date				: 2018. 3. 30. 
* @작성자				: 최규호
* @프로그램 설명		: 사람이 작동
*/
public class Human_1074 {

	public static void main(String[] args) {
		RemoteCon_1074 remo = new RemoteCon_1074();
		Tv_1074 tv = new Tv_1074();
		
		remo.setTv(tv);
		remo.powerOn();
	
	}

}
