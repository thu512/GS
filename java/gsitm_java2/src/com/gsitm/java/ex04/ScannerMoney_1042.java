package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1042.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 박소현
* @프로그램 설명           : 키도드에서 정수로 된 돈의 액수를 입력받아 변환
*/
public class ScannerMoney_1042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// 금액 입력받기
		System.out.print("금액을 입력해주세요 : ");
		int money = sc.nextInt();
		sc.close();
		
		// 입력받은 금액 쪼개기
		int check6 = money/50000;
		money = money%50000;
		int check5 = money/10000;
		money = money%10000;
		int check4 = money/1000;
		money = money%1000;
		int check3 = money/500;
		money = money%500;
		int check2 = money/100;
		money = money%100;
		int check1 = money/50;
		money = money%50;
		int check0 = money/10;
		money = money%10;
		
		// 금액 출력
		System.out.println("오만원권 : "+ check6 + "개, 만원권 : "+ check5 + "개, 천원권 : "
				+ check4 + "개, 100원짜리 동전 : "+ check2 + "개, 50원짜리 동전 : "+ check1 + "개,"
						+ " 10원짜리 동전 : "
				+ check0 + "개.");
		
		
		
	}

}
