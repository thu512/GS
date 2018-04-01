package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: ScannerMoney_1050.java
* @Project				: gsitm_java 
* @Date					: 2018. 3. 28. 
* @작성자					: 우연찬
* @프로그램 설명			: 키보드에서 정수로 된 돈의 액수를  입력받아 오만원권, 만원권, 천원권, 500원짜리 동전
*						  100원짜리 동전, 50원짜리 동전, 10원짜리 동전 각 몇 개로 반환되는지 출력한다.
* 	 ex) 65370 입력 -> 오만원권 1매, 만원권 1매, 천원권 5매, 100원짜리 동전 3개, 50원짜리 동전 1개, 10원짜리 동전 2개
*/

public class ScannerMoney_1050 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("돈을 입력해주세요 : ");
		int money = scanner.nextInt(); // 입력받은 돈
		if ((money / 50000) >= 1) {
			System.out.println("5만원권 " + (money / 50000) + "매");
			money = money % 50000;
		}
		if ((money / 10000) >= 1) {
			System.out.println("1만원권 " + (money / 10000) + "매");
			money = money % 10000;
		}
		if ((money / 1000) >= 1) {
			System.out.println("1천원권 " + (money / 1000) + "매");
			money = money % 1000;
		}
		if ((money / 500) >= 1) {
			System.out.println("500원짜리 동전 " + (money / 500) + "개");
			money = money % 500;
		}
		if ((money / 100) >= 1) {
			System.out.println("100원짜리 동전 " + (money / 100) + "개");
			money = money % 100;
		}
		if ((money / 50) >= 1) {
			System.out.println("50원짜리 동전 " + (money / 50) + "개");
			money = money % 50;
		}
		if ((money / 10) >= 1) {
			System.out.println("10원짜리 동전 " + (money / 10) + "개");
			money = money % 10;
		}
		if ((money / 1) >= 1) {
			System.out.println("1원짜리 동전 " + (money / 1) + "개");
			money = 0;
		}
	}
}
