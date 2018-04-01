package com.gsitm.practice.ex01;

 /** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ExClass_1043.java 
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자                : 백기반
* @프로그램 설명           : 
*/
class ExClass_IT1043{

	public static void main(String[] args) {
		 //고양이라는 문자열을 출력하는 메소드입니다.
		 /* */
		 
		 System.out.println("고양이1");
		 System.out.println();
	 }
	int i = 0;
	
	double dd = 1.1; //기본형
	
	
	
	String var = "10";
	int var2 = Integer.parseInt(var);
	//Boxing / unBoxing 
	
	//boxing
	Double doubl = new Double(1.1); //래퍼 클래스
	
	//unboxing
	double ddd = doubl.doubleValue();
	
	//auto unboxing
	double dddd = doubl;
	
 }
