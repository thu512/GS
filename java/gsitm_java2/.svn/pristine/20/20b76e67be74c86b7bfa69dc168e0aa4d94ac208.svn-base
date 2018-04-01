package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                	: GS ITM 인턴사원 자바교육
* @FileName           	: ScannerMoney_1030.java 
* @Project             	: gsitm_java2 
* @Date                	: 2018. 3. 28. 
* @작성자                	: 김동범
* @프로그램 설명			: 
*/
public class ScannerMoney_1030 {
	// static int. money
	static int aa = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Insert Money : ");
		Scanner sc = new Scanner(System.in);
		// money Array
		int[] mm = {50000,10000,5000,1000,500,100,50,10,1};
		int money = sc.nextInt();
		aa = money;
		String msg = "";
		ScannerMoney_1030 tt = new ScannerMoney_1030();
		for(int mmm : mm) {
			msg += tt.moneyMethod(mmm);
		}
		System.out.println(msg);
		sc.close();
	}
	String moneyMethod(int b) {
		String res = "";
		if((aa/b)!=0) {
			res += b+" : "+(aa/b)+"\n";
			aa = aa - b*(aa/b);
		}
		return res;
	}
}
