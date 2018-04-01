package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1037.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 김진우
* @프로그램 설명                          : 
*/
public class ScannerMoney_1037 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		if (money >= 50000) {
			System.out.print("오만원권 " + money / 50000 + "개");
			money = money % 50000;
			if (money != 0) {
				System.out.print(", ");
			}
		} 
		
		if (money >= 10000) {
			System.out.print("만원권 " + money / 10000 + "개");
			money = money % 10000;
			if (money != 0) {
				System.out.print(", ");
			}
		} 
		
		if (money >= 5000) {
			System.out.print("오천원권 " + money / 5000 + "개");
			money = money % 5000;
			if (money != 0) {
				System.out.print(", ");
			}
		} 
		if (money >= 1000) {
			System.out.print("천원권 " + money / 1000 + "개");
			money = money % 1000;
			if (money != 0) {
				System.out.print(", ");
			}
		}
		
		if (money >= 500) {
			System.out.print("500원짜리 동전 " + money / 500 + "개");
			money = money % 500;
			if (money != 0) {
				System.out.print(", ");
			}
		} 
		
		if (money >= 100) {
			System.out.print("100원짜리 동전 " + money / 100 + "개");
			money = money % 100;
			if (money != 0) {
				System.out.print(", ");
			}
		}
		
		if (money >= 50) {
			System.out.print("50원짜리 동전 " + money / 50 + "개");
			money = money % 50;
			if (money != 0) {
				System.out.print(", ");
			}
		}
		
		if (money >= 10) {
			System.out.print("10원짜리 동전 " + money / 10 + "개");
			money = money % 10;
			if (money != 0) {
				System.out.print(", ");
			}
		} 
		
		if (money >= 5) {
			System.out.print("오원짜리 동전 " + money / 5 + "개");
			money = money % 5;
			if (money != 0) {
				System.out.print(", ");
			}
		} 
		
		if (money > 0){
			System.out.print("1원짜리 동전 " + money + "개");
		}
	}
}
