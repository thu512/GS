package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : ScannerMoney_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 3. 28. 
 * @�ۼ���            : ������
 * @���α׷� ����                : 
 */
class ScannerMoney_1047 {
	int input = 0;	
	public static void main (String args[]) {
		ScannerMoney_1047 obj = new ScannerMoney_1047();
		
			
		Scanner sc = new Scanner(System.in);
		System.out.println("�׼��� �Է��ϼ���. : ");
		try {
			obj.input = sc.nextInt();
		}catch (Exception e) {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		obj.coins(50000);
		obj.coins(10000);
		obj.coins(1000);
		obj.coins(500);
		obj.coins(100);
		obj.coins(50);
		obj.coins(10);
		obj.coins(1);
	}
	void coins(int per) {
		System.out.println(per + "�� ¥�� �� : "+(input/per));
		input = input % per;
	}
}