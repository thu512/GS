package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Cloth_1037.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 김진우
* @프로그램 설명           : Cloth 인터페이스 
*/
public interface Cloth_1037 {
	String CLOTH_SIZE = "XL";
	static void putOnCloth() {
		System.out.println("옷을 입다!");
	}
	abstract void tearCloth();
}
