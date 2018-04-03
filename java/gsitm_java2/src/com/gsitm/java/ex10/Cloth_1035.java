package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Cloth_1035.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 김주승
* @프로그램 설명           : cloth 인터페이스 정의
*/
public interface Cloth_1035 {
	//인터페이스는 필드 정의시 public static final이 자동으로 붙는다
	String SIZE = "XL";
	
	//정적 메소드 정의
	static void wearCloth() {
		System.out.println("옷을 입습니다!!");
	}
	
	//추상 메소드 선언
	void breakCloth();

}
