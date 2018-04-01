package com.gsitm.java.ex04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1045.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 손원락
* @프로그램 설명           : 키보드에서 정수로 된 돈의 액수를 받아 각 액수별 구분.
*/
public class ScannerMoney_1045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("액수를 입력해주세요 : ");
		int money = scan.nextInt();

//		int a = money / 50000; // 5만원 갯수
//		if (a > 0) {
//			System.out.println("5만원의 갯수는 : " + a);
//		}
//
//		int b = (money % 50000) / 10000; // 1만원갯수
//		if (b > 0) {
//			System.out.println("1만원의 갯수는 : " + b);
//		}
//
//		int c = (money % 50000) % 10000 / 1000; // 1천원갯수
//		if (c > 0) {
//			System.out.println("1천원의 갯수는 : " + c);
//		}
//
//		int d = (money % 50000) % 10000 % 1000 / 500; // 500원갯수
//		if (d > 0) {
//			System.out.println("500원의 갯수는 : " + d);
//		}
//
//		int e = (money % 50000) % 10000 % 1000 % 500 / 100;// 100원갯수
//		if (e > 0) {
//			System.out.println("100원의 갯수는 : " + e);
//		}
//
//		int f = (money % 50000) % 10000 % 1000 % 500 % 100 / 50; // 50원갯수
//		if (f > 0) {
//			System.out.println("50원의 갯수는 : " + f);
//		}
//
//		int g = (money % 50000) % 10000 % 1000 % 500 % 100 % 50 / 10; // 10원갯수
//		if (g > 0) {
//			System.out.println("10원의 갯수는 : " + g);
//		}

		 int[] moneyList = new int[] {50000, 10000, 1000, 500, 100, 50, 10};
		 int count = 0;
		 int nam = money;
		 int i = 0;
		 
//		 for (i=0; i < moneyList.length; i++) {			 			 
//				 count = nam/moneyList[i];
//				 System.out.println(moneyList[i]+"의 갯수는 "+count);
//				 nam = nam%moneyList[i];
//		 }		
//		 
		 for(int j : moneyList) {
			 count = money/j;
			 if(count > 0) {
			 System.out.println(j+"단위의 갯수는 : " + count);
			 }
			 money = money%j;
		 }

	}

}
