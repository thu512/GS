package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Shoes_1039.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 남동길
* @프로그램 설명           : 신발 인터페이스
*/
public interface Shoes_1039 {
	public int shoeSize =260;
	
	default void wearShoes() {
		System.out.println("신발신다");
	}
	
	void throwShoes();
}
