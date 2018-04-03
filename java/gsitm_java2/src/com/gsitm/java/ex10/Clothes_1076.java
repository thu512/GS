package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Clothes_1076.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 최준우
* @프로그램 설명           : static 메소드, 추상메소드를 포함하는 clothes 인터페이스 
*/
public interface Clothes_1076 {
	
	public String CLOTHES_SIZE = "XL"; // 신발 사이즈 상수정의
	
	static void wearClothes() {  // 정적 메소드 구현
		System.out.println("옷입다");
	}
	
	public abstract void Tearing(); //옷을 찢다로 재정의 할 추상 메소드 구현

}
