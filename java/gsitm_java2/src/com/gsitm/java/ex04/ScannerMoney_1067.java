package com.gsitm.java.ex04;

import java.util.Scanner;

/**
 * @과목명                : GS ITM 인턴사원 자바교육  
 * @FileName            : ScannerMoney_1067.java   
 * @Project             : gsitm_java2 
 * @Date                : 2018. 3. 28.   
 * @작성자                : 조국
 * @프로그램 설명           : 
 */
public class ScannerMoney_1067 {
	public static void main(String[] args) {
		// 입력을 위한 Scanner 변수
		Scanner scan = new Scanner(System.in);
		// 정수 값을 입력받을 변수
		int inputInt = 0;
		// 해당 개수를 저장할 변수
		int fiveMan = 0;
		int oneMan = 0;
		int oneCheon = 0;
		int fiveBaek = 0;
		int oneBaek = 0;
		int fiveSip = 0;
		int oneSip = 0;
		int one = 0;

		try {
			System.out.println("====정수를 입력하세요====");
			inputInt = scan.nextInt();

			fiveMan = inputInt / 50000;
			oneMan = (inputInt % 50000) / 10000;
			oneCheon = ((inputInt % 50000) % 10000) / 1000;
			fiveBaek = (((inputInt % 50000) % 10000) % 1000) / 500;
			oneBaek = ((((inputInt % 50000) % 10000) % 1000) % 500) / 100;
			fiveSip = (((((inputInt % 50000) % 10000) % 1000) % 500) % 100) / 50;
			oneSip = ((((((inputInt % 50000) % 10000) % 1000) % 500) % 100) % 50) / 10;
			one = ((((((inputInt % 50000) % 10000) % 1000) % 500) % 100) % 50) % 10;

			System.out.println("오만원권 " + fiveMan + "개, 만원권 " + oneMan + "개, 천원권 " + oneCheon + "개, 500원짜리 동전 "
					+ fiveBaek + "개, 100원짜리 동전 " + oneBaek + "개, 50원짜리 동전 " + fiveSip + "개, 10원짜리 동전 " + oneSip
					+ "개, 1원짜리 동전 " + one + "개");

		} catch (Exception e) {
			System.out.println("Error: " + e);
		} finally {
			System.out.println("====종료====");
			scan.close();
		}
	}
}
