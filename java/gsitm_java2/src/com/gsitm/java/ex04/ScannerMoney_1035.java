package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1035.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 김주승
* @프로그램 설명           : 거스름돈 구하기
*/

public class ScannerMoney_1035 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		int oman;
		int man;
		int chun;
		int oback;
		int back;
		int osip;
		int sip;
		int il;
		String str="";
		
		oman = money/50000;
		money = money % 50000;
		
		man = money/10000;
		money = money%10000;
		
		chun = money/1000;
		money= money%1000;
		
		oback = money/500;
		money = money%500;
		
		back = money/100;
		money=money%100;
		
		osip = money/50;
		money=money%50;
		
		sip = money/10;
		money=money%10;	
		
		il = money;
		
		if(!(oman==0)){
			str += "오만원권 " + oman +"매  ,";
		}
		
		if(!(man==0)){
			str += "만원권 " + man +"매 , ";
		}
		
		if(!(chun==0)){
			str += "천원권 " + chun +"매 , ";
		}
		
		if(!(oback==0)){
			str += "오백원짜리 동전" + oback +"개 , ";
		}
	
		if(!(back==0)){
			str += "백원짜리 동전 " + back +"개 , ";
		}
		
		if(!(osip==0)){
			str += "오십원짜리 동전 " + osip +"개 , ";
		}

		if(!(sip==0)){
			str += "십원짜리 동전 " + sip+ "개 ";
		}
		
		if(!(il==0)){
			str += " , 일원짜리 동전 " + il +"개";
		}
		System.out.println(str);
	}
}
