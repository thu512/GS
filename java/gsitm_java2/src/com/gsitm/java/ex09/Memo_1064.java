package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Memo_1064.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 장진영
* @프로그램 설명           : 추상 클래스 정의
*/
public abstract class Memo_1064 {
	private String str ="";
	public String read() {
		return str;
	}
	public void write(String str) {
		this.str = str;
	}
	public abstract void addFunc();
}
