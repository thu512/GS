package com.gsitm.practice.ex02;

import java.util.Scanner;

public class ScannerFor_1067 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inputInt = 0;
		
		try {
			System.out.println("====정수(숫자)를 입력하세요====");
			inputInt = scan.nextInt();
		} catch (Exception e) {
			System.out.println("정수만 입력하세요.");
			System.out.println("error: " + e);
		} finally {
			for(int i = 1 ; i <= inputInt ; i++) {
				System.out.print('#');
			}
			System.out.println();
			System.out.println("====종료====");
			scan.close();
		}
	}
}
