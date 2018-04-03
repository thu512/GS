package com.gsitm.java.ex09;

/**
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Memo_1068.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 4. 3.
 * @작성자            : 조은솔
 * @프로그램 설명            : 추상클래스 
 */
public abstract class Memo_1068 {

	public void read() {
		System.out.println("읽기");
	}
	
	public void write() {
		System.out.println("쓰기");
	}
	
	public abstract void etc();
}
