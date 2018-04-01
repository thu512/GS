package com.gsitm.java.ex05;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : RemoteCon_1032.java
* @Project             : gsitm_java2
* @Date                : 2018. 3. 30.
* @작성자                : 김수진
* @프로그램 설명           : 전원을 키는 메소드가 정의 되어 있는 프로그램입니다.
*/
public class RemoteCon_1032 {

	boolean powerOn(){
		Tv_1032 tv1 = new Tv_1032();  //Tv 객체 생성
		tv1.isPowerOn =true;  
		return tv1.isPowerOn;  //리턴값은 Boolean
	}

}
