package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Human_1052.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 박보미
* @프로그램 설명           : 클래스 활용 
*/
public class Human_1052 {

	public static void main(String[] args) {

		RemoteCon_1052 remote = new RemoteCon_1052();
		Tv_1052 tv = new Tv_1052(true);
		
		System.out.println("power : " + remote.onOff(tv));
		System.out.println("power : " + remote.onOff(tv));
		System.out.println("power : " + remote.onOff(tv));		
	}

}
