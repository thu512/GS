package com.gsitm.practice.ex02;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerFor_1032.java
* @Project             : gsitm_java
* @Date                : 2018. 3. 28.
* @작성자                : 김수진
* @프로그램 설명           : scanner로 숫자 받아서 숫자만큼 # 출력하는 프로그램
*/
public class ScannerFor_1032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scanner=new Scanner(System.in);
		int input = scanner.nextInt();
		
		for(int i=0; i<input;i++) {
			System.out.print("#");
		}
		
	}

}
