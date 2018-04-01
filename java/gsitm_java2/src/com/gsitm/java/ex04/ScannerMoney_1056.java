package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: ScannerMoney_1056.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 3. 28. 
* @작성자					: 이상훈
* @프로그램 설명			: 과제4. 환전 프로그램
*/
public class ScannerMoney_1056 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		int[] won = {50000, 10000, 1000, 500, 100, 50, 10, 1};	// 5000원짜리는 없음
		int[] cntWon = new int[won.length];
		
		// 각 단위에 맞게 갯수 파악
		for (int i = 0; i < won.length; i++) {
			if (money >= won[i]) {
				cntWon[i] = money / won[i];
				money = money - (cntWon[i] * won[i]);
			}
		}
		
		// 출력
		for (int i = 0; i < cntWon.length; i++) {
			if (i == cntWon.length-1) {
				System.out.print(won[i] + "원은 " + cntWon[i] + "개 ");
				break;
			}
			System.out.print(won[i] + "원은 " + cntWon[i] + "개, ");
		}
		sc.close();
	}
}
