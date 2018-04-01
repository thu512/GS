package com.gsitm.java.ex04;

import java.util.Scanner;

/**
 *    @과목             : GS ITM 인턴사원 자바교육  @FileName        :
 * ScannerMoney_1048.java   @Project          : gsitm_java2   @Date            
 * : 2018. 3. 28.   @작성자    : 신종욱  @프로그램 설명       : 동전분할기
 */
public class ScannerMoney_1048 {

	public static void main(String[] args) {
		System.out.println("금액을 입력하시오");
	      Scanner s = new Scanner(System.in);
	      int money = s.nextInt();
	      System.out.println(money + "원 받았습니다.");
	      
	      int[] moneyUnit = {50000, 10000, 5000, 1000, 500, 100, 10, 1};
	      int[] moneyNum = new int[moneyUnit.length];
	      int rest = 0;
	      
	      for (int i = 0; i < moneyUnit.length; i++) {
	         moneyNum[i] = money/moneyUnit[i];
	         money = money - moneyUnit[i]*moneyNum[i];
	         System.out.println(moneyUnit[i] + "원 : " + moneyNum[i] + "개");
	      }
	}

}
