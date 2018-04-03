package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Meno_1032.java
* @Project             : gsitm_java2
* @Date                : 2018. 4. 3.
* @작성자                : 김수진
* @프로그램 설명           : 추상클래스인 메모장 클래스 (일반메소드 - 읽기,쓰기 / 추상메소드 - 부가기능)
*/
public abstract class Memo_1032 {
	public void read() {
		System.out.println("읽기 ");
	}
	public void write() {
		System.out.println("쓰기 ");
	}
	public abstract void addFunc();  //추상메소드
}
