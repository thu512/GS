package com.gsitm.practice.ex01;
// 도메인을 거꾸로 뒤집은게 패키지명이다.
// 기능단위로 패키지 명을 뽑기도 한다.

// 접근제한자
// public
// private: class에선 선언 불가(생성자는 가능).혼자 쓴다는 의미.
// protected: 다른 패키지에서 상속은 허용
// default: 같은 패키지에서 상속을 허용
// public > protected > default(선언 안한 것) > private

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ExClass_1067.java 
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자                : 조국
* @프로그램 설명           : 
*/
public class ExClass_1067 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 고양이라는 문자열을 출력하는 메소드입니다.
		System.out.println("고양이");
		System.out.println("");
		
		int i = 0;
		
		double dd = 1.1; // 기본형
		
		Double dd2 = new Double(1.1); // Wrapper Class
		String str = "10";
		int var2 = Integer.parseInt(str);
		
		// Boxing: 기본형 -> Wrapper 
		// unBoxing: Wrapper -> 기본형
//		Integer in = 10; // Auto Boxing
//		int ii = in; // Auto unBoxing	
		
		byte b1 = 10;
		char charValue = 'A';
		
//		short s1 = charValue;
//		int i212 = charValue;
//		System.out.println(s1);
		
		
		
		
	}
}