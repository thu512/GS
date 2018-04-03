package com.gsitm.java.ex10;

/** 
* @과목명                	: GS ITM 인턴사원 자바교육
* @FileName           	: Shoes_1030.java 
* @Project             	: gsitm_java2 
* @Date                	: 2018. 4. 3. 
* @작성자                	: 김동범
* @프로그램 설명			: 신발 인터페이스
*/
public interface Shoes_1030 {
	public int SHOE_SIZE = 260;
	public void throwShoe();
	default void wearShoe() {
		System.out.println("신발 신었다.");
	}
}
