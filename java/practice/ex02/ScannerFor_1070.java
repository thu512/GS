package com.gsitm.practice.ex02;

import java.util.InputMismatchException;
import java.util.Scanner;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerFor_1070.java 
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자                : 주형진
* @프로그램 설명           : 정수를 입력받아 입력받은 정수개수만큼 #을 출력하는 프로그램
*/

public class ScannerFor_1070 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		try {
			int num = scanner.nextInt();
			for(int i = 0; i < num; i++) {
				System.out.print("#");
			}
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력해주세요!!!");
		}
		finally {
			System.out.println();
		}		
	}
}
