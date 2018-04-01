package com.gsitm.practice.ex02;

import java.util.Scanner;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: ScannerFor_1056.java 
* @Project				: gsitm_java 
* @Date					: 2018. 3. 28. 
* @작성자					: 이상훈
* @프로그램 설명			: 스캐너 객체와 for문 응용
*/
public class ScannerFor_1056 {
	public static void main(String[] args) {
		int in = new Scanner(System.in).nextInt();
		
		for (int i = 0; i < in; i++) {
			System.out.print("#");
		}
	}
}
