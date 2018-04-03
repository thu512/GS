package com.gsitm.java.ex10;

/** 
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: Shoes_1072.java
 * @Project			: gsitm_java2
 * @Date			: 2018. 4. 3.
 * @작성자			: 차주현
 * @프로그램 설명	: 상수 사이즈, 던지는 추상 메소드, 구매하는 디폴트 메소드가 구현되어있다.
 */
public interface Shoes_1072 {
	int SHOES_SIZE = 260;
	void shoesThrow();
	default void buy() {
		System.out.println("신발을 구매했습니다.");
	}
}
