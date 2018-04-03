package com.gsitm.java.ex10;

/** 
* @과목명    		: GS ITM 인턴사원 자바교육
* @FileName		: shoes_1058.java 
* @Project  	: gsitm_java2 
* @Date     	: 2018. 4. 3. 
* @작성자     	: 이인성
* @프로그램 설명	: 
*/
public interface shoes_1058 {
	int size = 260;
	default void put() {
		System.out.println("신발을 신다.");
	}
	void draw();
}
