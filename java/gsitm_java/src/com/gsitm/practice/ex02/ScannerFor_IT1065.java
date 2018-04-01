package com.gsitm.practice.ex02;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerFor_IT1065.java 
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자                : 정광수
* @프로그램 설명           : for문 이용 예제1
*
*/
public class ScannerFor_IT1065 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n=0;
		try {
			n = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력해주세요");
		}

		scan.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append("#");
		}
		sb.append("\n");
		System.out.println(sb.toString());
	}

}
