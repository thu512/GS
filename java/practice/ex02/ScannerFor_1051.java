package com.gsitm.practice.ex02;

import java.util.Scanner;

/** 
 * @�����            : GS ITM ���ϻ�� �ڹٱ���
 * @FileName        : ScannerFor_1051.java
 * @Project         : gsitm_java
 * @Date            : 2018. 3. 28.
 * @�ۼ���            : �����
 * @���α׷� ����      		: 
 */
public class ScannerFor_1051 {

	public static void main(String[] args) {
		// Scanner ����
		Scanner sc = new Scanner(System.in);
		// Scanner�� �Է¹޾� int������ �ٲ��� �� num�̶�� ������ �־��ش�.
		int num = Integer.parseInt(sc.nextLine());
		
		// for���� ���� Scanner�� ���� ��ŭ #�� ������ش�.
		for(int i=0; i<num; i++) {
			System.out.print("#");
		}
	}
}
