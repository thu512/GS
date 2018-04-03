package com.gsitm.java.ex10;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: Shoes_1074.java 
* @Project			: gsitm_java2 
* @Date				: 2018. 4. 3. 
* @작성자				: 최규호
* @프로그램 설명		: 
*/
public interface Shoes_1074 {
	public int SIZE = 260;
	default void PutOnShoes() {
		System.out.println("신발 신음");
	}
	public void ThrowShoes();
}
