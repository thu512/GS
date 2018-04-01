package com.gsitm.practice.ex02;

import java.util.Scanner;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName         : ScannerFor_1062.java 
 * @Project            : gsitm_java 
 * @Date            : 2018. 3. 28. 
 * @작성자            : 장동주
 * @프로그램 설명      : #출력
 */
public class ScannerFor_1062 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int input=sc.nextInt();
		
		for (int i = 0; i < input; i++) {
			System.out.print("#");
		}
		

	}

}
