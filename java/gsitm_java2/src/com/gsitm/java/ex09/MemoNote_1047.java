package com.gsitm.java.ex09;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : MemoNote_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 4. 3. 
 * @작성자            : 송현석
 * @프로그램 설명                : 추상 클래스 실습. 제목과 내용을 가지는 String 타입 필드와, 생성자, 메소드를 가지고 있고, 추상메소드 addOnFeature를 정의하고있다.
 */
public abstract class MemoNote_1047 {
	String title,container;
	public MemoNote_1047() {
		this("","");
	}
	public MemoNote_1047(String title) {
		this(title,"");
	}
	public MemoNote_1047(String title, String contain) {
		this.title = title;
		this.container = contain;
	}
	public void read() {
		
	}
	
	public void write() {
		
	}
	
	public abstract void addOnFeature();//부가기능 추상 메소드 정의
}
