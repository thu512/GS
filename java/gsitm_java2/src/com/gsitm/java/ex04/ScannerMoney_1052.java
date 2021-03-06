package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1052.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 박보미
* @프로그램 설명           : 돈 반환 문제  
*/
public class ScannerMoney_1052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] money = { 50000, 10000, 1000, 500, 100, 50, 10, 1 }; // 금액의 단위
		int[] moneyCount = new int[8]; // 금액별 변환 갯수 
		
		String[] resultString = { "오만원권 ", "만원권 ", "천원권 ", "500원짜리 동전 ",
				"100원짜리 동전 ", "50원짜리 동전 ", "10원짜리 동전 ", "1원짜리 동전 " }; // 출력 문자열 

		int totalMoney = sc.nextInt();

		for (int i = 0; i < money.length; i++) {
			moneyCount[i] = totalMoney / money[i];
			resultString[i] += moneyCount[i] + "개, ";
			totalMoney %= money[i];
		}

		for (int i = 0; i < moneyCount.length; i++) {
			if (moneyCount[i] != 0) { // 1개 이상 변환되는 경우만 출력
				System.out.print(resultString[i]);
			}
		}

		sc.close();
	}

}
