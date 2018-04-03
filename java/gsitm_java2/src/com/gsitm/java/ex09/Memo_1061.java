package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Memo_1061.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 임혜성
* @프로그램 설명           : 메모장 클래스는 일반 메소드인 읽기, 쓰기를 갖는다.
						   메모장 클래스는 추상메소드인 부가기능 메소드를 갖는다.
*/
public abstract class Memo_1061 {
	private String memo;
	public void read() {
		System.out.println("읽음 : " + this.memo);
	}
	
	public void write(String str) {
		this.memo = str;
		System.out.println("쓴값 : " + memo);
	}
	
	public abstract void additional();
}
