package com.gsitm.java.ex04;

import java.util.Scanner;

/**
 *    @과목명                : GS ITM 인턴사원 자바교육  @FileName            :
 * ScannerMoney_1076.java   @Project             : gsitm_java2 
 *  @Date                : 2018. 3. 28.   @작성자                : 최준우
 *  @프로그램 설명         :  
 */
public class ScannerMoney_1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("금액을 입력하세요...");
		Scanner sc = new Scanner(System.in);

		int coin = sc.nextInt();

		System.out.println("손님이 입력한 금액은 " + coin + "원 입니다!");

		int result[] = new int[6]; // 값을 누적해서 -할 변수 배열 선언

		result[0] = coin / 50000; // 50000원권 나누기
		coin -= 50000 * result[0]; // 원래 금액에서 공제

		result[1] = coin / 10000; // 10000원권 나누기
		coin -= 10000 * result[1]; // 원래 금액에서 공제

		result[2] = coin / 1000; // 1000원권 나누기
		coin -= 1000 * result[2]; // 원래 금액에서 공제

		result[3] = coin / 100; // 100원권 나누기
		coin -= 100 * result[3]; // 원래 금액에서 공제

		result[4] = coin / 50; // 50원권 나누기
		coin -= 50 * result[4]; // 원래 금액에서 공제

		result[5] = coin / 10; // 10원권 나누기
		coin -= 10 * result[5]; // 원래 금액에서 공제

		// 출력 결과물
		System.out.println("*******************************************************************");
		System.out.println("5만원권:: "+result[0]+"매  1만원권:: "+result[1]+"매  1천원권:: "+result[2]
				 +"매  100원권:: "+result[3]+"개  50원권:: "+result[4]+"개  10원권:: "
				 +result[5]+"개");
		System.out.println("*******************************************************************");
		System.out.println();

	}

}
