package com.gsitm.java.ex10;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : Shoes_1077.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자              : 허빛찬샘
* @프로그램 설명       : 신발 인터페이스
*						 상수 사이즈 변수를 갖고, 디폴트 메소드, 추상메소드를 갖는다.
*/
public interface Shoes_1077 {
	
	int size = 260;	// 상수 사이즈 정의, public static final 을 생략 해도 된다.
	
	default void wearShoes() {
		System.out.println("신발을 신다.");
	}//default 메소드 신발신다.
	
	void throwShoes(); 	//추상메소드인 신발을 던지다.
	
}//class
