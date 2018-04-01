package com.gsitm.practice.ex03;

import java.util.Scanner;

public class ScannerUpper_1075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Scanner클래스를 이용하여 키보드에서 영문자 한 자를 입력받아 소문자를 대문자로 변환하여 출력하는 프로그램을 작성하라.
		 * 입력된 문자가 영문자가 아니면, "영문자가 아닙니다."를 출력하라.
		 * Ex) 입력 : s > 출력 : S
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String a_str = sc.nextLine();
		char a_ch = a_str.charAt(0);
		int a_asc = a_ch;
		
		if(a_asc >= 65 && a_asc <= 122) {
			a_str = a_str.toUpperCase();
			System.out.println("> 출력 : " + a_str);
		}else {
			System.out.println("영문자가 아닙니다");
		}
	}
}
