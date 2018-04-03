package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Shoes_1070.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 주형진
* @프로그램 설명           : Shoes_1070 인터페이스
*/
public interface Shoes_1070 {
	public int SIZE = 260;
	
	default void wearShoes() {
		System.out.println("신발을 신어요.");
	}
	public void throwShoes();
}
