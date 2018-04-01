package com.gsitm.practice.ex02;
/*키보드로 정수 (숫자)를 입력받고 Scanner 와 for 문을 활용하여 #을 출력하는 프로그램을 작성*/

import java.util.Scanner;

public class ScannerFor_1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		
		//System.out.println(val);
		
		for(int i = 0 ; i < val; i++ ) {
			System.out.print("#");
		}
		

	}

}
