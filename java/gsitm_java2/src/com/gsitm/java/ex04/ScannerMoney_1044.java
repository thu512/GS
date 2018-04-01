/**
 * 
 */
package com.gsitm.java.ex04;

import java.util.Scanner;

/**
 *    @과목명 : GS ITM 인턴사원 자바교육 @FileName : ScannerMoney_1044.java  @Project :
 * gsitm_java2  @Date : 2018. 3. 28.   @작성자 : 성동원  @프로그램 설명 : 실습과제
 */
public class ScannerMoney_1044 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();

		// 지폐 및 동전 개수 저장 변수.
		int sum_50000 = 0;
		int sum_10000 = 0;
		int sum_1000 = 0;
		int sum_500 = 0;
		int sum_100 = 0;
		int sum_50 = 0;
		int sum_10 = 0;

		while (true) {
			if (money == 0) {
				break;
			}
			if (money >= 50000) {
				money = money - 50000;
				sum_50000++;
			} else if (money >= 10000) {
				money = money - 10000;
				sum_10000++;
			} else if (money >= 1000) {
				money = money - 1000;
				sum_1000++;
			} else if (money >= 500) {
				money = money - 500;
				sum_500++;
			} else if (money >= 100) {
				money = money - 100;
				sum_100++;
			} else if (money >= 50) {
				money = money - 50;
				sum_50++;
			} else if (money >= 10) {
				money = money - 10;
				sum_10++;
			}
			System.out.println(money);
		}

		System.out.println("오만원권 " + sum_50000 + "개, 만원권 " + sum_10000 + "개, 천원권 " + sum_1000 + "매, 500원짜리 동전" + sum_500
				+ "개, 100원짜리 동전 " + sum_100 + "개, 50원짜리 동전 " + sum_50 + "개, 10원짜리 동전 " + sum_10 + "개");

		scanner.close();
	}

}
