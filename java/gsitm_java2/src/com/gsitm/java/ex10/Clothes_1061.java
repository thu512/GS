package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Clothes_1061.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 임혜성
* @프로그램 설명           : 옷 인터페이스는 상수 사이즈 XL를 갖고,
						   디폴트 메소드인 옷 입다를 구현한다.
						   추상메소드인 옷을 찢다를 구현한다
*/
public interface Clothes_1061 {
	//상수
	String CLOTHES_SIZE = "XL";
	//추상메소드
	void tearClothes();
	//디폴트 메소드
	default void wearClothes() {
		System.out.println("옷을 입는다");
	}
}
