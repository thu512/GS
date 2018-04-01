package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: ScannerMoney_1069.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 3. 28. 
* @작성자					: 조현우
* @프로그램 설명			: 돈의 액수를 받아 오만원, 만원, 천원, 500원 100원 50원 10원 1원
*							의 갯수를 출력하라
*/
public class ScannerMoney_1069 {
	/**
	 * @param money
	 * @param result
	 */
	public static void main(String[] args) {
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		// 키보드로부터 숫자 입력받아 money변수가 참조
		int money = sc.nextInt();
		// write함수에 write(출력할 지폐값, 결과적인 매수 혹은 개수)실행
		write(50000, money / 50000);
		write(10000, (money % 50000) / 10000);
		write(1000, ((money % 50000) % 10000) / 1000);
		write(500, (((money % 50000) % 10000) % 1000) / 500);
		write(100, ((((money % 50000) % 10000) % 1000) % 500) / 100);
		write(50, (((((money % 50000) % 10000) % 1000) % 500) % 100) / 50);
		write(10, ((((((money % 50000) % 10000) % 1000) % 500) % 100) % 50) / 10);
		write(1, ((((((money % 50000) % 10000) % 1000) % 500) % 100) % 50) % 10);
	}
	// 지폐값과 해당 결과 맷수, 갯수를 출력해주는 함수 0개가 필요하면 출력하지 않는다.
	public static void write(int money, int result) {
		if(money == 50000 && result != 0) {
			System.out.print("오만원권 : " + result + "매, ");
		} else if(money == 10000 && result != 0) {
			System.out.print("만원권 : " + result + "매, ");
		} else if(money == 1000 && result != 0) {
			System.out.print("천원권 : " + result + "매, ");
		} else if(money == 500 && result != 0) {
			System.out.print("오백원 : " + result + "개, ");
		} else if(money == 100 && result != 0) {
			System.out.print("백원 : " + result + "개, ");
		} else if(money == 50 && result != 0) {
			System.out.print("오십원 : " + result + "개, ");
		} else if(money == 10 && result != 0) {
			System.out.print("십원 : " + result + "개, ");
		} else if(money == 1 && result != 0) {
			System.out.println("일원 : " + result + "개");
		} 
	}
}
