package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: Scannermoney_1074.java 
* @Project			: gsitm_java2 
* @Date				: 2018. 3. 28. 
* @작성자				: 최규호
* @프로그램 설명		: 키보드에서 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지 출력한다.
*/
public class ScannerMoney_1074 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputString;
		System.out.print("돈의 액수를 입력해주세요 : ");
		inputString = scanner.nextLine();
		
		int ohManWon = 50000;
		int manWon = 10000;
		int chonWon = 1000;
		int ohBagWon = 500;
		int BagWon = 100;
		int ohTenWon = 50;
		int tenWon = 10;
		int oneWon = 1;
		int temp = 0; // 큰 금액의 개수만큼 빠진 나머지 금액
		/*
		System.out.println("오만원권 : " + Integer.parseInt(inputString)/ohManWon + " 개");
		System.out.println("만원권 : " + Integer.parseInt(inputString)/manWon + " 개");
		System.out.println("천원권 : " + Integer.parseInt(inputString)/chonWon + " 개");
		System.out.println("500원권 : " + Integer.parseInt(inputString)/ohBagWon + " 개");
		System.out.println("100원권 : " + Integer.parseInt(inputString)/BagWon + " 개");
		System.out.println("50원권 : " + Integer.parseInt(inputString)/ohTenWon + " 개");
		System.out.println("10원권 : " + Integer.parseInt(inputString)/tenWon + " 개");
		System.out.println("1원권 : " + Integer.parseInt(inputString)/oneWon + " 개");
		*/
		System.out.println("오만원권 : " + Integer.parseInt(inputString)/ohManWon + " 개");
		temp = Integer.parseInt(inputString) - (Integer.parseInt(inputString)/ohManWon * ohManWon);
		
		System.out.println("만원권 : " + temp/manWon + " 개");
		temp = temp - (temp/manWon * manWon);
		
		System.out.println("천원권 : " + temp/chonWon + " 개");
		temp = temp - (temp/chonWon * chonWon);
		
		System.out.println("500원권 : " + temp/ohBagWon + " 개");
		temp = temp - (temp/ohBagWon * ohBagWon);
		
		System.out.println("100원권 : " + temp/BagWon + " 개");
		temp = temp - (temp/BagWon * BagWon);
		
		System.out.println("50원권 : " + temp/ohTenWon + " 개");
		temp = temp - (temp/ohTenWon * ohTenWon);
		
		System.out.println("10원권 : " + temp/tenWon + " 개");
		temp = temp - (temp/tenWon * tenWon);
		
		System.out.println("1원권 : " + temp/oneWon + " 개");
		temp = temp - (temp/oneWon * oneWon);
		
		scanner.close();
	}

}
