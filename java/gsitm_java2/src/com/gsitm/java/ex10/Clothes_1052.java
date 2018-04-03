package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Clothes_1052.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 박보미
* @프로그램 설명           : 인터페이스 구현 
*/
public interface Clothes_1052 {

	public static final String SIZE = "XL";

	public static void wearClothes() {
		System.out.println("옷 입습니다.");
	}

	public abstract void tearClothes();
}
