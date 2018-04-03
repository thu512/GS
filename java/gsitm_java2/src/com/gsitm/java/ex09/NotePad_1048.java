package com.gsitm.java.ex09;
/** 
* @과목	            : GS ITM 인턴사원 자바교육
* @FileName         : EditPlus_1048.java 
* @Project          : gsitm_java2 
* @Date             : 2018. 4. 3. 
* @작성자			    : 신종욱
* @프로그램 설명       : 추상메소드를 상속하고, 재정의하는 클래스
*/
public abstract class NotePad_1048 {
	//일반 메소드 정의
	public void read() {
		System.out.println("읽기"); 
	}
	public void write() {
		System.out.println("쓰기");
	}
	//추상 메소드 정의
	public abstract void additionalFunction();
}
