package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : ScannerMoney_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 3. 28. 
 * @작성자            : 송현석
 * @프로그램 설명                : 
 */
class ScannerMoney_1047 {
	int input = 0;	
	public static void main (String args[]) {
		ScannerMoney_1047 obj = new ScannerMoney_1047();
		
			
		Scanner sc = new Scanner(System.in);
		System.out.println("액수를 입력하세요. : ");
		try {
			obj.input = sc.nextInt();
		}catch (Exception e) {
			System.out.println("잘못된 입력입니다.");
		}
		obj.coins(50000);
		obj.coins(10000);
		obj.coins(1000);
		obj.coins(500);
		obj.coins(100);
		obj.coins(50);
		obj.coins(10);
		obj.coins(1);
	}
	void coins(int per) {
		System.out.println(per + "원 짜리 수 : "+(input/per));
		input = input % per;
	}
}