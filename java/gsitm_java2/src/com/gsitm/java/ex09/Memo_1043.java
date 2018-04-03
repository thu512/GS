package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Memo_1043.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 백기반
* @프로그램 설명           : 추상클래스 실습
*/
public abstract class Memo_1043 {
	
	public String Read(String a) {
	
		return a;
	}
	
	public String Write() {
		String write = "쓰기";
		return write;	
	}
	
	public abstract String addplus();
}
