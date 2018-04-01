package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : ScannerMoney_1051.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 3. 28.
 * @작성자            : 위재원
 * @프로그램 설명      		: 
 */
public class ScannerMoney_1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		String res = "";
		
		if(money>=50000) {
			res += "오만원권 " + money/50000 + "매, ";
			money = money%50000;
		}
		
		if(money>=10000) {
			res += "만원권 " + money/10000 + "매, ";
			money = money%10000;
		}
		
		if(money>=1000) {
			res += "천원권 " + money/1000 + "매, ";
			money = money%1000;
		}
		
		if(money>=500) {
			res += "500원짜리 동전 " + money/500 + "개,";
			money = money%500;
		}
		
		if(money>=100) {
			res += "100원짜리 동전 " + money/100 + "개,";
			money = money%100;
		}
		
		if(money>=50) {
			res += "50원짜리 동전 " + money/50 + "개,";
			money = money%50;
		}
		
		if(money>=10) {
			res += "10원짜리 동전 " + money/10 + "개,";
			money = money%10;
		}
		
		if(money!=0) {
			res += "1원짜리 동전" + money + "개";
		}
		
		System.out.println(res);
	}
}
