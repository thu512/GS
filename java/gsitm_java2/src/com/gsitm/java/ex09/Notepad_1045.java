package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Notepad_1045.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 손원락
* @프로그램 설명           : addOption이라는 추상메소드를 넣은 추상클래스
*/
public abstract class Notepad_1045 {
	private String text;
	
	Notepad_1045(){
		this.text = "비밀";
	}
	
	public abstract void addOption();
	
	public String read(){
		return this.text;
		
	}
	public void write(String abc){
		this.text = abc;
	}
	
}
