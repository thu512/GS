package com.gsitm.java.ex10;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Shoes_1051.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 4. 3.
 * @작성자            : 위재원
 * @프로그램 설명      		: 신발 인터페이스 입니다. 상수 선언, 디폴트 메소드 선언, 추상메소드 선언
 */
public interface Shoes_1051 {
	int SIZE_SHOES = 260;
	
	default void shoesWear () {
		System.out.println("신발신다.");
	}
	
	void shoesThrow();
}
