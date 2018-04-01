package com.gsitm.java.ex04;

import java.util.Scanner;

/**
* <pre>
* 1. 패키지명 : com.gsitm.java.ex04
* 2. 타입명 : ScannerMoney_1034.java
* 3. 작성일 : 2018. 3. 28. 
* 4. 작성자 : JongJoo
* 5. 설명 : 지폐 동전뽑기 게임. 인코딩 깨져서 재 커밋.
* </pre>
*/
public class ScannerMoney_1034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		int fiveM = money/50000;		// 오만원 
		int changeF = money%50000;		// 오만원 이외
		
		int oneM = changeF/10000;		//만원
		int changeM = changeF % 10000;	//만원 이외
		
		int oneC = changeM/1000;		//천원
		int changeC = changeM%1000;		//천원 이외
		
		int centF = changeC/500;		//500원
		int changeB = changeC%500;		//500원 이외
		
		int oneCent = changeB/100;		//100원
		int changeA = changeB%100;		//100원 이외
		
		int five_cent = changeA/50;		//50원
		int change = changeA%50;		//50원 이외
		
		int changeL = change/10;		//10원
		
		if(fiveM!=0) {
			System.out.print("오만원권 "+fiveM+"매 ");
		}
		if(oneM!=0) {
			System.out.print(",만원권 "+oneM+"매 ");
		}
		if(oneC!=0) {
			System.out.print(",천원권 "+oneC+"매 ");
		}
		if(centF!=0) {
			System.out.print(",500원짜리 동전 "+centF+"개 ");
		}
		if(oneCent!=0) {
			System.out.print(",100원짜리 동전 "+oneCent+"개 ");
		}
		if(five_cent!=0) {
			System.out.print(",50원짜리 동전 "+five_cent+"개 ");
		}
		if(changeL!=0) {
			System.out.print(",10원짜리 동전 "+changeL+"개 ");
		}
		sc.close();
	}

}
