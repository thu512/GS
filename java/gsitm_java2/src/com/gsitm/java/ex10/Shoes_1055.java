package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Shoes_1055.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 이경화
* @프로그램 설명           : 신발
*/
public interface Shoes_1055 {
	
	final int shoesize = 260;
	
	public default void wearshoes() {
		System.out.println("신발신다");
	}
	
	public void throwShoes();
}
