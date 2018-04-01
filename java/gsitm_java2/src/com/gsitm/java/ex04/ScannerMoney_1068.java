package com.gsitm.java.ex04;

import java.util.Scanner;

public class ScannerMoney_1068 {

	/** 
	* @과목명                	: GS ITM 인턴사원 자바교육
	* @FileName           	: ScannerUpper_1068.java 
	* @Project             	: gsitm_java 
	* @Date                	: 2018. 3. 28. 
	* @작성자                	: 조은솔
	* @프로그램 설명			: 
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int change = money;

		int[] won = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for(int i: won) {
			
			if(change/i != 0) {
				System.out.println(i + "원권은 " + change/i + "개");
				change = change - i*(change/i);				
			}
			
		}
		
	}

}
