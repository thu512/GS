package com.gsitm.practice.ex02;

import java.util.Scanner;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: ScannerFor_1074.java 
* @Project			: gsitm_java 
* @Date				: 2018. 3. 28. 
* @작성자				: 최규호
* @프로그램 설명		: 
*/
public class ScannerFor_1074 {

	public static void main(String[] args) {
		System.out.print("숫자 입력:");
		Scanner scanner = new Scanner(System.in);
		String inputString;
		inputString = scanner.nextLine();
		int i = 0;
		for(i=Integer.parseInt(inputString); i>0; i--) {
			System.out.print("#"); 
		}
		scanner.close();
	}
 
}
