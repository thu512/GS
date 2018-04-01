package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1061.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 임혜성
* @프로그램 설명           : 키보드에서 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전,
*							50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇개로 변환되는지 출력한다
*							ex) 65370 입력 : 오만원권 1개, 만원권 1매, 천원권 5매, 100원짜리 동전 3개, 50원짜리 동전 1개, 10원짜리 동전 2개
*/
public class ScannerMoney_1061 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		String [] unit = {"50원", "500원", "1000원", "50000원"};
		String [] unit2 = {"10원", "100원", "1000원", "10000원"};
		int unitVal = value.length()-2;		//5의 배수 금액 배열 초기값
		int unitVal2 = value.length()-2;	//5의 배수가 아닌 금액 배열 초기값
		for(int i = 0; i < value.length()-1; i++) {
			if(value.charAt(i)-48 == 0) continue;	//금액의 개수가 0이면 패스
			if(i == value.length()-4) {		//단위가 천원일 때
				System.out.println(unit[unitVal--] + (value.charAt(i)-48));
				unitVal2--;
				continue;
			}
			if((value.charAt(i)-48) > 4) {	//금액이 5보다 클 시
				System.out.println(unit[unitVal--] + (value.charAt(i)-48)/5);
				//정확히 5의 금액이면 1의 금액 배열도 내림
				if((value.charAt(i)-48) == 5) {
					unitVal2--;	//1의 금액 배열도 내림
					continue;
				}
				//5의 금액 계산 후 남은 금액
				System.out.println(unit2[unitVal2--] + ((value.charAt(i)-48) - ((value.charAt(i)-48)/5)*5));
			} else { //금액이 5보다 작을 시
				System.out.println(unit2[unitVal2--] + (value.charAt(i)));
				unitVal--;	//5의 금액 배열도 내림
			}
		}
	}
}
