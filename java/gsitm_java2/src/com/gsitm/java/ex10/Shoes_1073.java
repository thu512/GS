package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Shoes_1073.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 채유진
* @프로그램 설명           : 다중인터페이스 실습 
*/
public interface Shoes_1073 {
	int size = 260;
	default void shoesWear() {
		System.out.println("신발신다");
	}
	void shoesThrow();
}
