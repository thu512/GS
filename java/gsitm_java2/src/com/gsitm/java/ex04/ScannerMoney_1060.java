package com.gsitm.java.ex04;

import java.util.InputMismatchException;
import java.util.Scanner;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1060.java
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자              : 이창주
* @프로그램 설명       : 
*/
public class ScannerMoney_1060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("금액을 입력해주세요: ");
		Scanner sc = new Scanner(System.in);  
		int m;
		int[][] money = new int[2][8];
		money[0] = new int[]{50000, 10000,1000,500,100,50,10,1};
		
		try {
			m = sc.nextInt();
			for(int i=0; i<money[0].length; i++) {
				money[1][i]=m/money[0][i];
				m%=money[0][i];
			}		
			System.out.println("오만원권 "+money[1][0]+"매, 만원권 "+money[1][1]+"매,"
					+ " 천원권 "+money[1][2]+"매, 500원짜리 동전 "+money[1][3]+"개, 100원짜리 동전 "+money[1][4]+"개,"
							+ " 50원짜리 동전 "+money[1][5]+"개, 10원짜리 동전 "+money[1][6]+"개, 1원짜리 동전 "+money[1][7]+"개");
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("올바른 금액을 입력해주세요.");
		}
		
	}

}
