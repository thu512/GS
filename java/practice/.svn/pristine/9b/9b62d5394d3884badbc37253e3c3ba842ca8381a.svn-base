package com.gsitm.practice.ex02;

import java.util.Scanner;

/** 
* @과목명			: GS ITM 인턴사원 자바교육 <br>
* @FileName		: ScannerFor_1054.java <br>
* @Project		: gsitm_java <br>
* @Date			: 2018. 3. 28. <br>
* @작성자			: 이경민 <br>
* @프로그램 설명	: 1. 키보드로 정수(숫자)를 입력받고 Scanner와 fro문을 활요하여 #을 출력하는 프로그램을 작성하라 3을 입력받으면 ###
*/
public class ScannerFor_1054 {

	
	public static void main(String[] args) {
		
		Scanner sc = null;
		int temp;
		boolean forFlag = false;
		
		while(!forFlag) {
			
			sc = new Scanner(System.in);
			
			System.out.println("숫자를 입력하세요");
			
			temp = sc.nextInt();
			
			if(temp == -1) {
				forFlag = !forFlag;
				System.out.println("프로그램 종료");
				break;
			}
			
			for( int i = 0; i < temp; i++ ) {
				System.out.print("#");
			}
			System.out.println();
			
		}
		
		
	}

	
}
