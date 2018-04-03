package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Shoes_1053.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 은종현
* @프로그램 설명           : 인터페이스 실습 (Shoes 클래스)
*/
public interface Shoes_1053 {
	public static final int shoeSize = 260;

	default void shoesPutOn() {
		System.out.println("신발 신다");
	}

	void throwUp();
}
