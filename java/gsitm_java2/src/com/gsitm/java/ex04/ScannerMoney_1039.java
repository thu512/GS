package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1039.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 남동길
* @프로그램 설명           : 키보드에서 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전
*						,100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇 개로 변환되는지
*						출력 ex)65370 입력 > 오만원권 1개, 만원권 1매, 천원권 5매, 100원짜리 동전 3개,
*								50원짜리 동전 1개, 10원짜리 동전 2개
*/
public class ScannerMoney_1039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("돈을 입력하세요(정수로만) : "); // 입력가이드 출력
		Scanner scn = new Scanner(System.in); //스캐너 객체 생성
		int money = scn.nextInt(); // 돈 입력받기
		int originalMoney = money; // money변수는 계속해서 연산을 하기 때문에 처음값을 담아둠
		int fiveManWon = money/50000; //오만원권 수
		money = money - 50000 * fiveManWon; // 오만원권을 제외한 돈
		int oneManWon = money/10000; // 만원권 수
		money = money - 10000 * oneManWon; // 만원권을 제외한 돈
		int oneCheonWon = money/1000; // 천원권 수
		money = money - 1000 * oneCheonWon; // 천원권을 제외한 돈
		int fiveBaeckWon = money/500; // 오백원동전 수
		money = money - 500 * fiveBaeckWon; // 오백원동전을 제외한 돈
		int oneBaeckWon = money/100; // 백원동전 수
		money = money - 100 * oneBaeckWon; // 백원동전을 제외한 돈
		int fiveSipWon = money/50; // 오십원동전 수
		money = money - 50 * fiveSipWon; // 오십원동전을 제외한 돈
		int oneSipWon = money/10; // 십원동전 수
		money = money - 10 * oneSipWon; // 십원동전을 제외한 돈
		int oneWon = money/1; // 일원동전 수
		money = money - oneWon; // 일원동전을 제외한 돈 아마 0원
		System.out.print(originalMoney+" 입력 > "); //여기서부터는 결과값 출력, 지폐나 동전이수가 0이 아닌 돈들만 출력
		if(fiveManWon != 0) {
			System.out.print("오만원권 "+fiveManWon+"매 ");
		}
		if(oneManWon != 0) {
			System.out.print("만원권 "+oneManWon+"매  ");
		}
		if(oneCheonWon != 0) {
			System.out.print("천원권 "+oneCheonWon+"매 ");
		}
		if(fiveBaeckWon != 0) {
			System.out.print("오백원짜리 동전"+fiveBaeckWon+"개 ");
		}
		if(oneBaeckWon != 0) {
			System.out.print("백원짜리 동전 "+oneBaeckWon+"개 ");
		}
		if(fiveSipWon != 0) {
			System.out.print("오십원짜리 동전 "+fiveSipWon+"개 ");
		}
		if(oneSipWon != 0) {
			System.out.print("십원짜리 동전 "+oneSipWon+"개 ");
		}
		if(oneWon != 0) {
			System.out.println("일원짜리 동전 "+oneWon+"개");
		}
		scn.close(); // 스캐너 객체 클로즈
	}

}
