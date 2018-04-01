package com.gsitm.java.ex04;

import java.util.Scanner;

/**
 *    @과목명                : GS ITM 인턴사원 자바교육  @FileName            :
 * ScannerMoney_1040.java   @Project             : gsitm_java2 
 *  @Date                : 2018. 3. 28.   @작성자                : 노종범
 *  @프로그램 설명           : 실습3
 */
public class ScannerMoney_1040 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //svn 수정 테스트
		System.out.println("가진 돈을 입력하세요: ");
		int a = scanner.nextInt();
		int allA = a;
		
		int count50000 = 0;
		int count10000 = 0;
		int count1000 = 0;
		int count100 = 0;
		int count50 = 0;
		int count10 = 0;
		int count1 =0;
		
		if (a >= 50000) {
			while (a >=50000) {
				a = a - 50000;
				count50000++;
			}
		} 
		if (a >= 10000) {
			while (a >= 10000) {
				a = a - 10000;
				count10000++;
			}
		} if (a >= 1000) {
			while (a >= 1000) {
				a = a - 1000;
				count1000++;
			}
		} if (a >= 100) {
			while (a >= 100) {
				a = a - 100;
				count100++;
			}
		} if (a >= 50) {
			while (a >= 50) {
				a = a - 50;
				count50++;
			}
		} if (a >= 10) {
			while (a >= 10) {
				a = a - 10;
				count10++;
			}
		}  if (a >= 1) {
			while (a >= 1) {
				a = a - 1;
				count1++;
			}
		}			
		System.out.print(allA+"원은 5만원권: "+count50000);
		System.out.print("장, 만원권: "+count10000);		
		System.out.print("장, 천원권: "+count1000);		
		System.out.print("장, 100원동전: "+count100);		
		System.out.print("개, 50원동전: "+count50);		
		System.out.print("개, 10원동전: "+count10);		
		System.out.println("개, 1원동전: "+count1+"개로 구성되어있습니다.");		
	}

}
