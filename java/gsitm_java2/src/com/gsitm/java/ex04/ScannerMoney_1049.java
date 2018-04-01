package com.gsitm.java.ex04;

import java.util.Scanner;

/**
 *    @과목명                : GS ITM 인턴사원 자바교육  @FileName            :
 * ScannerMoney_1049.java   @Project             : gsitm_java2 
 *  @Date                : 2018. 3. 28.   @작성자                : 오병준
 *  @프로그램 설명           :
 */
/*
 * 3. 키보드에서 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 50원짜리동전,
 * 10원짜리 동전, 1원짜리 동전 각 몇개로 변환되는지 출력한다. ex) 65370 입력> 오만원권 1매, 만원권 1매, 천원권 5매,
 * 100원짜리 동전 3개, 50원짜리 동전 1개, 10원짜리 동전 2개
 */
public class ScannerMoney_1049 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		//지폐 및 동전 수
		int num50000 = 0;
		int num10000 = 0;
		int num5000 = 0;
		int num1000 = 0;
		int num500 = 0;
		int num100 = 0;
		int num50 = 0;
		int num10 = 0;
		int num1 = 0;
		System.out.print(money+"입력> ");
		//확인된 금액 제외 하며 0원 만들기
		while (money != 0) {
			if (money >= 50000) {
				num50000 = money / 50000;
				money = money - (50000 * num50000);

			} else if (money >= 10000) {
				num10000 = money / 10000;
				money = money - (10000 * num10000);

			} else if (money >= 5000) {
				num5000 = money / 5000;
				money = money - (5000 * num5000);

			} else if (money >= 1000) {
				num1000 = money / 1000;
				money = money - (1000 * num1000);

			} else if (money >= 500) {
				num500 = money / 500;
				money = money - (500 * num500);

			} else if (money >= 100) {
				num100 = money / 100;
				money = money - (100 * num100);

			} else if (money >= 50) {
				num50 = money / 50;
				money = money - (50 * num50);

			} else if (money >= 10) {
				num10 = money / 10;
				money = money - (10 * num10);

			} else if (money >= 1) {
				num1 = money / 1;
				money = money - (1 * num1);

			}
		}
		System.out.println("오만원권" + num50000 + "매, " + "만원권" + num10000 + "매, " + "오천원권" + num5000 + "매, " + "천원권"
				+ num1000 + "매, " + "오백원" + num500 + "개, " + "백원" + num100 + "개, " + "오십원" + num50 + "개, " + "십원"
				+ num10 + "개, " + "일원" + num1 + "개");
		input.close();

	}// end main()

}// end class()
