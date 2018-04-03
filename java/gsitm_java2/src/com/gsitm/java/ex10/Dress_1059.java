package com.gsitm.java.ex10;

/**
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Dress_1059.java
* @Project             : gsitm_java2
* @Date                : 2018. 4. 3.
* @작성자              : 이종건
* @프로그램 설명       : 다중 인터페이스 구현 클래스 실습
*/
public interface Dress_1059 {
	String DRESS_SIZE = "XL";
	
	// static 메소드
	static void takeDress() {
		System.out.println("옷을 입다");
	}
	
	// 추상 메소드
	void tearDress();
	
}
