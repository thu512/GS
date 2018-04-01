package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1029.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 고하윤
* @프로그램 설명           : 지폐, 동전 개수 출력
*/
public class ScannerMoney_1029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 0;
		Scanner c = new Scanner(System.in);
		money = c.nextInt();
		int money50000 = 0;
		int money10000 = 0;
		int money1000 = 0;
		int money500 = 0;
		int money100 = 0;
		int money50 = 0;
		int money10 = 0;
		int money1 = 0;
		
		while (money != 0) {
			if(money >= 50000) {
				money50000++;
				money = money - 50000;
			}
			else if(money >= 10000 && money < 50000) {
				money10000++;
				money = money - 10000;
			}
			else if (money >= 1000 && money < 10000) {
				money1000++;
				money = money - 1000;
			}
			else if (money >= 500 && money < 1000) {
				money500++;
				money = money - 500;
			}
			else if (money >= 100 && money < 500) {
				money100++;
				money = money - 100;
			}
			else if (money >= 50 && money < 100) {
				money50++;
				money = money - 50;
			}
			else if (money >= 10 && money < 50) {
				money10++;
				money = money - 10;
			}
			else if (money >= 1 && money < 10) {
				money1++;
				money = money - 1;
			}
		}
		String result = "";
		result += ("오만원권 " + money50000 + "매, ");
		result += ("만원권 " + money10000 + "매, ");
		result += ("천원권 " + money1000 + "매, ");
		result += ("500원짜리 동전 " + money500 + "개, ");
		result += ("100원짜리 동전 " + money100 + "개, ");
		result += ("50원짜리 동전 " + money50 + "개, ");
		result += ("10원짜리 동전 " + money10 + "개, ");
		result += ("1원짜리 동전 " + money1 + "개");
		
		System.out.println(result);
		c.close();
	}

}
