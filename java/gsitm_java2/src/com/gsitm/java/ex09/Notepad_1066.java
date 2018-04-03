package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Notepad_1066.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 정진
* @프로그램 설명           : 노트 패드(추상 클래스)
*/
public abstract class Notepad_1066 {
	
	public void read() {
		System.out.println("파일 읽기");
	}
	
	public void write() {
		System.out.println("파일 쓰기");
	}
	
	public abstract void additionalMethod();
}
