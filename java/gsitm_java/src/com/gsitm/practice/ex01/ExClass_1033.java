package com.gsitm.practice.ex01;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : ExClass_1033.java
 * @Project         : gsitm_java
 * @Date            : 2018. 3. 28.
 * @작성자            : 김윤지
 * @프로그램 설명                :
 */

public class ExClass_1033 {
	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println(); //sysout + ctrl + space
		
		String var = "10";
		int var2 = Integer.parseInt(var);
		
		//boxing
		Double db = new Double(1.1);
		//unboxing
		double db2 = db.doubleValue();
		//auto unboxing
		double db3 = db2;
		
	}
}