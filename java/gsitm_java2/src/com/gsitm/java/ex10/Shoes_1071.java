package com.gsitm.java.ex10;

/** 
*	 @과목명                : GS ITM 인턴사원 자바교육
*	 @FileName            : Shoes_1071.java 
*	 @Project             : gsitm_java2 
*	 @Date                : 2018. 4. 3. 
*	 @작성자                : 진민영
* 	 @프로그램 설명           : 신발을 신다 옷을 입다 인터페이스 사용 익히기
*/
public interface Shoes_1071 {
	public int SIZE= 260;
	
	default void putOnShoes() {
		System.out.println("신발을 신다.");
		
	}
	
	abstract void throwShoes();

}
