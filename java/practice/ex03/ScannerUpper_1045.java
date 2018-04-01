package com.gsitm.practice.ex03;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerUpper_1045.java 
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자                : 손원락
* @프로그램 설명           : 
*/
public class ScannerUpper_1045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("영문자 한 자를 입력하세요 : ");
		
		String str = scan.next();	
		String upperStr = str.toUpperCase();
		char charStr = upperStr.charAt(0);
		
		int result = charStr;
		
		if(result>=65 && result<=90) {			
			System.out.println(charStr);
			
		}else {			
			System.out.println("영문자가 아닙니다.");
		}
		
	}

}
