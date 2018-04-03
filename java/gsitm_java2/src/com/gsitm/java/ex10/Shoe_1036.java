package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Shoe_1036.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 김준혁
* @프로그램 설명         : 신발의 정보를 입력하는 인터페이스
*/
public interface Shoe_1036 {
	public int shoeSize = 250;
	
	public default void putOnShoes() {
		System.out.println("신발을 신었습니다.");
	}
	
	public void throwShoes();
	
}
