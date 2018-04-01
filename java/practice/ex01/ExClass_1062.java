package com.gsitm.practice.ex01;


/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName         : ExClass_1062.java 
 * @Project            : gsitm_java 
 * @Date            : 2018. 3. 28. 
 * @작성자            : 장동주
 * @프로그램 설명      : 
 */
class ExClass_1062{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		고양이라는 문자열을 출력하는 메소드입니다.
		/*고양이라는 문자열을 출력  하는 메소드입니다.*/
		
		System.out.println("hello");
		
		int i=0;
		double dd= 1.1;//기본형
		
		Double doubl=new Double(1.1); //래퍼클래스
		String var="10"; 
		int var2=Integer.parseInt(var);
		
		//Boxing
		doubl= new Double(1.1);
		//unboxing
		double ddd=doubl.doubleValue();
		
		//auto unboxing
		double dddd= doubl;
		
		int in=10; //Auto Boxing
		int ii=in; //Auto Unboxing
		Object o=10; //Auto Boxing
		
		
	}
}