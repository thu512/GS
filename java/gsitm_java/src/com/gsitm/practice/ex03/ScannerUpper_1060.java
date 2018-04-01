package com.gsitm.practice.ex03;

import java.util.Scanner;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : ScannerUpper_1060.java
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자              : 이창주
* @프로그램 설명       : 
*/
public class ScannerUpper_1060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if((65<=c && 90>=c)||(95<=c && 122>=c)) {
			System.out.println(Character.toUpperCase(c));
		}else {
			System.out.println("영문자가 아닙니다.");
		}
	}

}
