package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Shoes_1029.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 고하윤
* @프로그램 설명           : 신발 인터페이스 - 사이즈 상수, 디폴트 메소드, 추상메소드를 포함
*/
public interface Shoes_1029 {

	public int SIZE = 260;
	
	default void putOnShoes() {
		System.out.println("신발을 신습니다.");
	}
	
	void throwShoes();
}
