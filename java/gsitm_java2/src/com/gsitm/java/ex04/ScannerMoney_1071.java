package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
*	 @과목명                : GS ITM 인턴사원 자바교육
*	 @FileName            : ScannerMoney_1071.java 
*	 @Project             : gsitm_java2 
*	 @Date                : 2018. 3. 28. 
*	 @작성자                : 진민영
* 	 @프로그램 설명           : 키보드에서 정수로 된 동의 액수를 입력받아 오만원 만원 천원 500원 100원 50원 10원 1원짜리 동전 각 몇개로 변환되는지 출력
*/
public class ScannerMoney_1071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String sMoney = sc.nextLine();
		
		//입력받은 숫자를 int형으로 형변환한다.
		int money = Integer.parseInt(sMoney);
		//각 지폐가 몇개씩 출력되는지 count
		int count = 0;
		
		//50000원권이 출력되는 갯수
		if(money>=50000) {
			count = (int) Math.floor(money/50000);
			money = money - 50000*count;
			System.out.println("5만원권 : "+ count);
		}
		//10000원권이 출력되는 갯수
		if(money>=10000) {
			count =  (int) Math.floor(money/10000);
			money = money - 10000*count;
			System.out.println("1만원권 : "+ count);
		}
		//1000원권이 출력되는 갯수
		if(money>=1000) {
			count =  (int) Math.floor(money/1000);
			money = money - 1000*count;
			System.out.println("1천원권 : "+ count);
		}
		//500원이 출력되는 갯수
		if(money>=500) {
			count =  (int) Math.floor(money/500);
			money = money - 500*count;
			System.out.println("5백원 짜리 동전 : "+ count);
		}
		//100원이 출력되는 갯수
		if(money>=100) {
			count = (int) Math.floor(money/100);
			money = money - 100*count;
			System.out.println("1백원 짜리 동전 : "+ count);
		}
		//50원이 출력되는 갯수
		if(money>=50) {
			count =  (int) Math.floor(money/50);
			money = money - 50*count;
			System.out.println("50원 짜리 동전 : "+ count);
		}
		//10원이 출력되는 갯수
		if(money>=10) {
			count =  (int) Math.floor(money/10);
			money = money - 10*count;
			System.out.println("10원 짜리 동전 : "+ count);
		}
		//1원이 출력되는 갯수
		if(money<10&&money>0){
			System.out.println("1원짜리 동전 : " + money);
		}
	}
}
