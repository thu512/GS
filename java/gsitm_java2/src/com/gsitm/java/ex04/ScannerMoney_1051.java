package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : ScannerMoney_1051.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 3. 28.
 * @�ۼ���            : �����
 * @���α׷� ����      		: 
 */
public class ScannerMoney_1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		String res = "";
		
		if(money>=50000) {
			res += "�������� " + money/50000 + "��, ";
			money = money%50000;
		}
		
		if(money>=10000) {
			res += "������ " + money/10000 + "��, ";
			money = money%10000;
		}
		
		if(money>=1000) {
			res += "õ���� " + money/1000 + "��, ";
			money = money%1000;
		}
		
		if(money>=500) {
			res += "500��¥�� ���� " + money/500 + "��,";
			money = money%500;
		}
		
		if(money>=100) {
			res += "100��¥�� ���� " + money/100 + "��,";
			money = money%100;
		}
		
		if(money>=50) {
			res += "50��¥�� ���� " + money/50 + "��,";
			money = money%50;
		}
		
		if(money>=10) {
			res += "10��¥�� ���� " + money/10 + "��,";
			money = money%10;
		}
		
		if(money!=0) {
			res += "1��¥�� ����" + money + "��";
		}
		
		System.out.println(res);
	}
}
