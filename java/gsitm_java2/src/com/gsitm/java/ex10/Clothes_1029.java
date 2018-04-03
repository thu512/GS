package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Clothes_1029.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 고하윤
* @프로그램 설명           : 옷 인터페이스 - 사이즈 상수, 스태틱 메소드, 추상메소드를 포함
*/
public interface Clothes_1029 {

	public String SIZE = "XL";
	
	static void putOnClothes() {
		System.out.println("옷을 입습니다.");
	}
	
	void tearClothes();
}
