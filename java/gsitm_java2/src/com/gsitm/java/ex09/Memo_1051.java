package com.gsitm.java.ex09;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Memo_1051.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 4. 3.
 * @작성자            : 위재원
 * @프로그램 설명      		: EditPlus의 추상클래스로 부모클래스 입니다.
 */
public abstract class Memo_1051 {
	public void write() {
		System.out.println("쓰기");
	}
	public void read() {
		System.out.println("읽기");
	}
	
	public abstract void additional();
}
