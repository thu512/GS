package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1053.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 은종현
* @프로그램 설명           : 
*/
public class ScannerMoney_1053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tmp = num;
		while (tmp >= 1) {
			if (tmp >= 50000) {
				System.out.print("오만원권 " + (tmp / 50000) + "매");
				tmp = tmp % 50000;
			} else if (tmp >= 10000) {
				System.out.print("만원권 " + (tmp / 10000) + "매");
				tmp = tmp % 10000;
			} else if (tmp >= 1000) {
				System.out.print("천원권 " + (tmp / 1000) + "매");
				tmp = tmp % 1000;
			} else if (tmp >= 500) {
				System.out.print("500원 짜리 동전 " + (tmp / 500) + "개");
				tmp = tmp % 500;
			} else if (tmp >= 100) {
				System.out.print("100원 짜리 동전 " + (tmp / 100) + "개");
				tmp = tmp % 100;
			} else if (tmp >= 50) {
				System.out.print("50원 짜리 동전 " + (tmp / 50) + "개");
				tmp = tmp % 50;
			} else if (tmp >= 10) {
				System.out.print("10원 짜리 동전 " + (tmp / 10) + "개");
				tmp = tmp % 10;
			} else if (tmp >= 1) {
				System.out.print("10원 짜리 동전 " + (tmp / 1) + "개");
				tmp = tmp % 1;
			}
			if (tmp != 0) {
				System.out.print(", ");
			}
		}
	}
}
