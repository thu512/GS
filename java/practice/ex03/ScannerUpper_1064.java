package com.gsitm.practice.ex03;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerUpper_1064.java 
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자                : 장진영
* @프로그램 설명           : Scanner 클래스를 이용하여 키보드에서 영문자 한 자를 입력받아 소문자를 대문자로 변환하여 출력하는 프로그램
*/
public class ScannerUpper_1064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputStr = scanner.next();
		char inputChar = inputStr.charAt(0);
		if ((inputChar >= 'a' && inputChar <= 'z') || (inputChar >= 'A' && inputChar <= 'Z')) {
			System.out.println(inputStr.toUpperCase());
		} else {
			System.out.println("영문자가 아닙니다.");
		}
	}
}
