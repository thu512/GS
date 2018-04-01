package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1036.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 김준혁
* @프로그램 설명         : 돈 환산
*/
public class ScannerMoney_1036 {

	public static void main(String[] args) {
		System.out.println("돈을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int man5 = money / 50000;		//5만원짜리 개수
		money -= man5 * 50000;		//5만원 빼기
		int man = money / 10000;			//1만원짜리 개수
		money -= man * 10000;		//1만원 빼기
		int chan = money / 1000;
		money -= chan * 1000;
		int obak = money / 500;
		money -= obak * 500;
		int bak = money / 100;
		money -= bak * 100;
		int osip = money / 50;
		money -= osip * 50;
		int sip = money / 10;
		money -= sip * 10;
		int il = money;
		
		if(man5 != 0) {
			System.out.println("오만원권: "+man5);
		}
		if(man != 0) {
			System.out.println("만원권: "+man);
		}
		if(chan != 0) {
			System.out.println("천원권: "+chan);
		}
		if(obak != 0) {
			System.out.println("오백원동전: "+obak);
		}
		if(bak != 0) {
			System.out.println("백원동전: "+bak);
		}
		if(osip != 0) {
			System.out.println("오십원동전: "+osip);
		}
		if(sip != 0) {
			System.out.println("십원동전: "+sip);
		}
		if(il != 0) {
			System.out.println("일원동전: "+il);
		}
	}
}
