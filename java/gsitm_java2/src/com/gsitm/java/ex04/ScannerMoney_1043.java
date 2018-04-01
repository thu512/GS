package com.gsitm.java.ex04;
import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1043.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 백기반
* @프로그램 설명           : 돈계산
*/
public class ScannerMoney_1043 {
	public static void main(String[] args) {
		int FT = 0;
		int TT = 0;
		int T = 0;
		int Fh =0;
		int h = 0;
		int fts = 0;
		int ts = 0;
		int result = 0;
		System.out.println("액수를 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		FT = money / 50000;		
		money -= FT * 50000;		
		TT = money / 10000;			
		money -= TT * 10000;		
		T = money / 1000;
		money -= T * 1000;
		Fh = money / 500;
		money -= Fh * 500;
		h = money / 100;
		money -= h * 100;
		fts = money / 50;
		money -= fts * 50;
		ts = money / 10;
		money -= ts * 10;
		
		System.out.println("오만원권:"+FT);
		System.out.println("만원권:"+TT);
		System.out.println("천원권:"+T);
		System.out.println("오백원:"+Fh);
		System.out.println("백원:"+h);
		System.out.println("오십원:"+fts);
		System.out.println("십원:"+ts);
		System.out.println("일원:"+money);
	
	}
}
