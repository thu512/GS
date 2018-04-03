package com.gsitm.java.ex10;

/**
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Shoe_1068.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 4. 3.
 * @작성자            : 조은솔
 * @프로그램 설명            : 인터페이스 예제
 */
public interface Shoe_1068 {
	
	public int SHOE_SIZE = 160;

	default void putOnShoe() {
		System.out.println("신발 신다.");
	}
	
	void throwShoe();
}
