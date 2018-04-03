package com.gsitm.java.ex10;

/** 
*    @과목명               : GS ITM 인턴사원 자바교육
*    @FileName            : Clothing_1075.java 
*    @Project             : gsitm_java2 
*    @Date                : 2018. 4. 3. 
*    @작성자                : 최영롱
*    @프로그램 설명          : 신발 클래스
*/
public interface Clothing_1075 {
	String SIZE = "XL"; // 인터페이스 필드 선언  -> 자동 public static final 형식
	static void wearClothing() { //Static 메소드
		System.out.println("옷을 입다.");
	}
	public void tearClothing(); //추상메소드 선언
}
