package com.gsitm.java.ex04;

import java.util.Scanner;

/**
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1059.java
* @Project             : gsitm_java2
* @Date                : 2018. 3. 28.
* @작성자              : 이종건
* @프로그램 설명       :
*/
public class ScannerMoney_1059 {

	public static void main(String[] args) {
		System.out.println("돈을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		long money = sc.nextLong();
		
		long count_50000 = 0; 
		long count_10000 = 0; 
		long count_1000 = 0; 
		long count_100 = 0; 
		long count_50 = 0; 
		long count_10 = 0; 
		
		count_50000 = money / 50000;
		money -= 50000 * count_50000 ;
		
		count_10000 = money / 10000;
		money -= 10000 * count_10000;
				
		count_1000 = money / 1000;
		money -= 1000 * count_1000;
		
		count_100 = money / 100;
		money -= 100 * count_100;
		
		count_50 = money / 50;
		money -= 50 * count_50;
		
		count_10 = money / 10;
		
		System.out.println("오만원권 " +  count_50000 + "개 ");
		System.out.println("만원권 " +  count_10000 + "개 ");
		System.out.println("천원권 " +  count_1000 + "개 ");
		System.out.println("100원짜리 동전 " +  count_100 + "개 ");
		System.out.println("50원짜리 동전 " +  count_50 + "개 ");
		System.out.println("10원짜리 동전 " +  count_10 + "개 ");

		
		sc.close();
	}

}
