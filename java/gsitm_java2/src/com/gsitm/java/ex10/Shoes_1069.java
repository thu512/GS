/**
 * 
 */
package com.gsitm.java.ex10;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: Shoes_1069.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 4. 3. 
* @작성자					: 조현우
* @프로그램 설명			: 신발, 옷 인터페이스 다중상속 실습
*/
public interface Shoes_1069 {
	int shoesSize = 260;
	
	default void putShoes() {
		System.out.println("신발을 신는다.");
	}
	public abstract void throwShoes();
}
