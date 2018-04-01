package com.gsitm.java.ex05;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: Human_1056.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 3. 30. 
* @작성자					: 이상훈
* @프로그램 설명			: Human 객체가 컨트롤하는 리모컨 객체로 Tv 객체의 값을 변경
*/
public class Human_1056 {
	public static void main(String[] args) {
		RemoteCon_1056 remoteCon = new RemoteCon_1056();
		Tv_1056 tv = new Tv_1056();
		
		System.out.println(tv.power);	// 켜기 전
		tv.power = remoteCon.turnOnTv();
		System.out.println(tv.power);	// 켠 후
	}
}
