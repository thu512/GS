package com.gsitm.java.ex10;

/** 
*    @과목명               : GS ITM 인턴사원 자바교육
*    @FileName            : Shoes_1075.java 
*    @Project             : gsitm_java2 
*    @Date                : 2018. 4. 3. 
*    @작성자                : 최영롱
*    @프로그램 설명          : 신발 클래스
*/
public interface Shoes_1075 {
	int SIZE = 160;// 인터페이스 필드 선언  -> 자동 public static final 형식
	default void wearShoes() {//디폴트 메소드 선언
		System.out.println("신발을 신다.");
	}
	public void throwShoes();//추상 메소드 선언
}
