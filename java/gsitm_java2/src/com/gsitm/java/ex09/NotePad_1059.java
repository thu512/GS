package com.gsitm.java.ex09;

/**
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : NotePad_1059.java
* @Project             : gsitm_java2
* @Date                : 2018. 4. 3.
* @작성자              : 이종건
* @프로그램 설명       : 추상클래스 실습
*/
public abstract class NotePad_1059 {
	public void read() {
		System.out.println("읽기");
	}
	public void write() {
		System.out.println("쓰기");
	}
	
	public abstract void moreFunction();
	
}
