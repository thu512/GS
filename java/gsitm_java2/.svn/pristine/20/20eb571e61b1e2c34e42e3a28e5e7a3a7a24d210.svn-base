package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명    		: GS ITM 인턴사원 자바교육
* @FileName		: ScannerMoney_1058.java 
* @Project  	: gsitm_java2 
* @Date     	: 2018. 3. 28. 
* @작성자     	: 이인성
* @프로그램 설명	: 
*/

public class ScannerMoney_1058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		int total = Integer.parseInt(inputString);
		int count = 0;
		while(total >= 50000) {
			count++;
			total -= 50000;
		}
		System.out.print("오만원권 " + count + "개, ");
		count = 0;
		while(total >= 10000) {
			count++;
			total -= 10000;
		}
		System.out.print("만원권 " + count + "개, ");
		count = 0;
		while(total >= 1000) {
			count++;
			total -= 1000;
		}
		System.out.print("천원권 " + count + "개, ");
		count = 0;
		while(total >= 500) {
			count++;
			total -= 500;
		}
		System.out.print("500원 짜리 동전 " + count + "개, ");
		count = 0;
		while(total >= 100) {
			count++;
			total -= 100;
		}
		System.out.print("100원짜리 동전 " + count + "개, ");
		count = 0;
		while(total >= 50) {
			count++;
			total -= 50;
		}
		System.out.print("50원짜리 동전 " + count + "개, ");
		count = 0;
		while(total >= 10) {
			count++;
			total -= 10;
		}
		System.out.print("10원짜리 동전 " + count + "개, ");
		System.out.print("1원짜리 동전 " + total + "개");
	}
}
