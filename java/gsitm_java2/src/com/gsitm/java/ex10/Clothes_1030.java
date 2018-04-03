package com.gsitm.java.ex10;

/** 
* @과목명                	: GS ITM 인턴사원 자바교육
* @FileName           	: Clothes_1030.java 
* @Project             	: gsitm_java2 
* @Date                	: 2018. 4. 3. 
* @작성자                	: 김동범
* @프로그램 설명			: 옷 인터페이스
*/
public interface Clothes_1030 {
	public String CLOTHES_SIZE = "XL";
	public void tearCloth();
	public static void wearCloth() {
		System.out.println("옷을 입다.");
	}
}
