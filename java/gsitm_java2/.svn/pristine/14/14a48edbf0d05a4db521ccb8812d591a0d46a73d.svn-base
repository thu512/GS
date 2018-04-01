package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1055.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 이경화
* @프로그램 설명           : 돈 지폐 변환
*/

public class ScannerMoney_1055 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		int dollar[]= {50000,10000,1000,500,100,50,10,1};
		int count[]= {0,0,0,0,0,0,0,0};
		
		for(int i=0;i<8;i++) {
			count[i]=money/dollar[i];
			money=money%dollar[i];
		}
		
		System.out.println("오만원권 "+count[0]+"매");
		System.out.println("만원권"+count[1]+"매");
		System.out.println("천원권"+count[2]+"매");
		System.out.println("500원짜리 동전"+count[3]+"개");
		System.out.println("100원짜리 동전"+count[4]+"개");
		System.out.println("50원짜리 동전 " +count[5]+"개");
		System.out.println("10원짜리 동전 " +count[6]+"개");
		System.out.println("1원짜리 동전 " +count[7]+"개");
	}
}
