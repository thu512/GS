package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName         : ScannerMoney_1062.java 
 * @Project            : gsitm_java2 
 * @Date            : 2018. 3. 28. 
 * @작성자            : 장동주
 * @프로그램 설명      : 
 */
public class ScannerMoney_1062 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int moneyInput = scan.nextInt();
		int firstMoney=moneyInput;
		System.out.print(firstMoney + "원 입력 > ");
		
		String output="";
		

		int n50000 = moneyInput / 50000;
		if (isZero(n50000)) {
			String a="오만원권 " + n50000 + "매 ,";
			moneyInput = moneyInput % 50000;
			output+=a;
		}
		int n10000 = (moneyInput) / 10000;
		if (isZero(n10000)) {
			String b="만원권 " + n10000 + "매 ,";
			moneyInput = moneyInput % 10000;
			output+=b;
		}
		int n1000 = moneyInput / 1000;
		if (isZero(n1000)) {
			String c="천원권 " + n1000+ "매 ,";
			moneyInput = moneyInput % 1000;
			output+=c;
		}
		int n500 = moneyInput / 500;
		if (isZero(n500)) {
			String d="500원짜리 동전 " + n500+ "개 ,";
			moneyInput = moneyInput % 500;
			output+=d;
		}
		int n100 = moneyInput / 100;
		if (isZero(n100)) {
			String e="100원짜리 동전 " + n100+ "개 ,";
			moneyInput = moneyInput % 100;
			output+=e;
		}
		int n50 = moneyInput / 50;
		if (isZero(n50)) {
			String f="50원짜리 동전 " + n50+ "개 ,";
			moneyInput = moneyInput % 50;
			output+=f;
		}
		int n10 = moneyInput / 10;
		if (isZero(n10)) {
			String g="10원짜리 동전 " + n10+ "개";
			moneyInput = moneyInput % 10;
			output+=g;
		}
		
		System.out.println(output);

	}
	
	public static boolean isZero(int input) {
		return input==0?false:true;
	}

}
