package com.gsitm.java.ex10;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Shoes_1033.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 4. 3. 
 * @작성자            : 김윤지
 * @프로그램 설명                : 신발 인터페이스
 */
public interface Shoes_1033 {
	
	int SHOES_SIZE = 260; //상수 선언
	
	default void putOnTheShoes() {
		System.out.println("신발 신음");
	} //디폴트 메소드
	
	void throwTheShoes(); //추상 메소드
	
}
