package com.gsitm.practice.ex01;


/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName         : ExClass_1051.java
 * @Project            : gsitm_java
 * @Date            : 2018. 3. 28.
 * @작성자            : 위재원
 * @프로그램 설명      :
 */

public class ExClass_1051 {
	/**
	 * @param args
	 * alt + shift + j 단축키를 쓰면 바로 주석이 가능하다.
	 */
	public static void main(String[] args) {
		// 하이하이라는 문자열을 출력하는 메소드입니다.
		/* 고양이라는 문자열을 출력하는 메소드입니다. */
		
		System.out.println("하이하이하이 ");
		
		int i = 0;
//		double dd = 1.1; // 기본형
//		Double doubl = new Double(1.1); // 래퍼클래스
		String var = "10";
		int var2 = Integer.parseInt(var);
		
		// Boxing
		Double doubl = new Double(1.1); // 래퍼클래스
		// unBoxing
		double ddd = doubl.doubleValue();
		
		// auto boxing
		double dddd = doubl;
		
//		Integer in = 10; // Auto Boxing
//		int ii = in; // Auto Unboxing
		Object o = 10; // Auto Boxing
	}
}
// wrapper 클래스 : 기본형 타입을 관리하기 위해서 설정해 놓은 것?
//
//class Integer {
//	int i=0;
//}