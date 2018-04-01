package com.gsitm.java.ex05;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Human_1077.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자              : 허빛찬샘
* @프로그램 설명       : 리모컨 전원을 키는 메소드를 호출한다.
*/
public class Human_1077 {
	public static void main(String[] args) {
		RemoteCon_1077 remote = new RemoteCon_1077();
		System.out.println(remote.turn_on());
		System.out.println(remote.turn_off());
	}
}
