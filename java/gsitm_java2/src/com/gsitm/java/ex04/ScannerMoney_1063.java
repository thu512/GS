package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1063.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 유희수
* @프로그램 설명           : 키보드에서 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리동전,100원짜리 동전, 50원짜리동전,10원짜리동전 각 몇개로 반환되는지 출력한다.
*/
public class ScannerMoney_1063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int result;
		if(money>=50000) {
			result = money/50000;
			System.out.print("오만원권 "+result+"매");
			money = money-(50000*result);
		}
		if(money>=10000) {
			result = money/10000;
			System.out.print(", 만원권 "+result+"매");
			money = money-(10000*result);
		}
		if(money>=1000) {
			result = money/1000;
			System.out.print(", 천원권 "+result+"매");
			money = money-(1000*result);
		}
		if(money>=500) {
			result = money/500;
			System.out.print(", 500원짜리 동전 "+result+"개");
			money = money-(500*result);
		}
		if(money>=100) {
			result = money/100;
			System.out.print(", 100원짜리 동전 "+result+"개");
			money = money-(100*result);
		}
		if(money>=50) {
			result = money/50;
			System.out.print(", 50원짜리 동전 "+result+"개");
			money = money-(50*result);
		}
		if(money>=10) {
			result = money/10;
			System.out.print(", 10원짜리 동전 "+result+"개");
			money = money-(10*result);
		}
		if(money>=1) {
			System.out.print(", 1원짜리 동전 "+money+"개");
		}
	}

}
