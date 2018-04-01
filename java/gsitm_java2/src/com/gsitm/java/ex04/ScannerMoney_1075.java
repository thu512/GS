package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1075.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 최영롱
* @프로그램 설명           : 입력받은 금액의 지폐 및 동전의 개수를 구하는 프로그램
*/
public class ScannerMoney_1075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*키보드에서 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리동전,100원짜리 동전, 50원짜리동전,10원짜리동전 각 몇개로 반환되는지 출력한다.
		 *Ex) 65370 입력 > 오만원권 1매, 만원권 1매, 천원권 5매, 100원짜리동전 3개, 50원짜리동전 1개, 10원짜리동전 2개
		 */
		Scanner sc = new Scanner(System.in);//스캐너 선언
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};//돈액수
		int initMoney = sc.nextInt();//입력받아옴
		
		System.out.print("> ");
		for(int i = 0; i < money.length; i++) {
			if(initMoney/money[i] !=0) {// i번째 money요소의 화폐가 0개가 아닐때만
				if(i!=0) {//처음에 출력안되도록 하기위해 0번째 아니면 무조건 반점 출력
					System.out.print(", ");
				}
				if(money[i]>500) {//500원 이상이면 종이화폐 -> '매'로 출력
					System.out.print(money[i] + "원권 " + (initMoney/money[i]) + "매");
				}else {// 500원 이하이면 동전화폐 -> '개'로 출력
					System.out.print(money[i] + "원짜리 동전 " + (initMoney/money[i]) + "개");
				}
			}
			initMoney = initMoney%money[i];// 현재 남은 화폐를 업데이트
		}
	}

}
