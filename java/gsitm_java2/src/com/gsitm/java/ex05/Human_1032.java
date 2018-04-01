package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1032.java
* @Project             : gsitm_java2
* @Date                : 2018. 3. 30.
* @작성자                : 김수진
* @프로그램 설명           : 리모컨 전원을 키는 메소드 호출하는 프로그램입니다.
*/
public class Human_1032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteCon_1032 r1 = new RemoteCon_1032();  //리모컨 객체 생성
		r1.powerOn();  //전원키는 메소드 호출
		
		if(r1.powerOn() == true) {  //리턴값이 true 면 powerOn 출력
			System.out.println("powerOn");
		}
	}

}