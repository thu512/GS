package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1046.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 손혜성
* @프로그램 설명           : 지폐세기
*/
public class ScannerMoney_1046 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		
		total = howMoney(total, 50000);
		total = howMoney(total, 10000);
		total = howMoney(total, 1000);
		total = howMoney(total, 500);
		total = howMoney(total, 100);
		total = howMoney(total, 50);
		total = howMoney(total, 10);
		total = howMoney(total, 1);
		System.out.println("dddd" + 2.000000);
		scanner.close();
	}
	public static int howMoney(int total, int unit) {
		int count = 0;
		if(total == 0) {
			return 0;
		}
		while(true) {
			if(total >= unit) {
				count++;
				total -=unit;
			}
			else {
				break;
			}
		}
		System.out.println(unit + "원 :  " + count + "개");
		if(total == 0) {
			System.out.println("계산완료.");
		}
		return total;
	}
}
