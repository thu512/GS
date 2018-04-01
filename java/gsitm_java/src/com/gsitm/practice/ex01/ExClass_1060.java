package com.gsitm.practice.ex01;

import java.util.Scanner;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : ExClass_1060.java
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자              : 이창주
* @프로그램 설명       : 
*/
class ExClass_1060{
	public static void main(String[] args) {
		//		
		System.out.println("고양이");
		System.out.println();
		
		String i="10";
		int var = Integer.parseInt(i);
		
		double d= 1.1;
		//박싱
		Double dd = new Double(1.1);
		//auto언박싱
		d=dd;
		//언박싱
		d=dd.doubleValue();
		byte v1 = 10;
		
		int j = 0;
		j+=1;
		User u = new User();
		
		System.out.println(u instanceof User);
		
		Scanner sc = new Scanner(System.in);
		
	}
}
class User{
	
}