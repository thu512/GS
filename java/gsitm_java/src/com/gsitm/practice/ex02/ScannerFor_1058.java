package com.gsitm.practice.ex02;

import java.util.Scanner;

/** 
* @과목명    		: GS ITM 인턴사원 자바교육
* @FileName		: ScannerFor_1058.java 
* @Project  	: gsitm_java 
* @Date     	: 2018. 3. 28. 
* @작성자     	: 이인성
* @프로그램 설명	: 
*/
public class ScannerFor_1058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		for(int i=0; i<Integer.parseInt(inputString);i++) {
			System.out.print("#");
		}
		System.out.println();
	}
}