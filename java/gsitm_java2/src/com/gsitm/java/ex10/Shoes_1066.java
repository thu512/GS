package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Shoes_1066.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 정진
* @프로그램 설명           : 신발 인터페이스
*/
public interface Shoes_1066 {
	public int sizeOfShoes = 260;

	public default void putOnShoes() {
		System.out.println("신발을 신다.");
	}

	public abstract void cast();
}
