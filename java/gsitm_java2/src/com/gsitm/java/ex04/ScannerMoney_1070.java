package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1070.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 주형진
* @프로그램 설명           : 입력받은 금액의 지폐 및 동전의 개수를 구하는 프로그램
*/

public class ScannerMoney_1070 {
	public static void main(String[] args) {
		System.out.print("금액을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		try {
			int money = sc.nextInt();
			
			if(money / 50000 > 0)
				System.out.print("오만원권 " + (money / 50000) + "매");
			money %= 50000;
			if(money / 10000 > 0)
				System.out.print(", 만원권 " + (money / 10000) + "매");
			money %= 10000;
			if(money / 1000 > 0)
				System.out.print(", 천원권 " + (money / 1000) + "매");
			money %= 1000;
			if(money / 500 > 0)
				System.out.print(", 500원짜리 동전 " + (money / 500) + "개");
			money %= 500;
			if(money / 100 > 0)
				System.out.print(", 100원짜리 동전  " + (money / 100) + "개");
			money %= 100;
			if(money / 50 > 0)
				System.out.print(", 50원짜리 동전 " + (money / 50) + "개");
			money %= 50;
			if(money / 10 > 0)
				System.out.print(", 10원짜리 동전 " + (money / 10) + "개");
			money %= 10;
			if(money / 1 > 0)
				System.out.print(", 1원짜리 동전 " + (money / 1) + "개");
		}catch(Exception e) {
			System.out.println("정수를 입력해주세요!!");
		}
	}
}