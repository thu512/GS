package com.gsitm.java.ex09;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Notepad_1077.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자              : 허빛찬샘
* @프로그램 설명       : read, write 일반메소드 / additionalFunc() 추상메소드로 구성된 추상클래스. 
*/
public abstract class Notepad_1077 {
	public void read() {
		System.out.println("메모장 읽기");
	}//read
	
	public void write() {
		System.out.println("메모장 쓰기");
	}//write
	
	public abstract void additionalFunc();	//부가기능 추상 메소드
}//class
