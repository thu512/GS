package com.gsitm.practice.ex02;

import java.util.Scanner;

/** 
* @과목명                	: GS ITM 인턴사원 자바교육
* @FileName           	: ScannerFor_1030.java 
* @Project             	: gsitm_java 
* @Date                	: 2018. 3. 28. 
* @작성자                	: 김동범
* @프로그램 설명			: scanner
*/
public class ScannerFor_1030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i=0; i<count; i++) {
			System.out.print("#");
		}
		sc.close();
	}

}