package com.gsitm.practice;

 /** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Hello_1041.java 
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자                : 박민주
* @프로그램 설명           : 
*/
class Hello_1041 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		double dd = 1.1; // 기본형
		
		Double doubl = new Double(1.1); // 래퍼클래스
		
		String var = "10";
		int var2 = Integer.parseInt(var);

	
		//Boxing / unBoxing
		//기본형타입을 래퍼클래스로 , 
		Double doubl1 = new Double(1.1); // 박싱
		double ddd = doubl.doubleValue();// 언박
		
		double dddd = doubl; // auto unboxing
		Integer in = 10; //auto Boxing
		Object o = 10; // Auto Boxing
	}

}
