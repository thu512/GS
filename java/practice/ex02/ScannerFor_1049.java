package com.gsitm.practice.ex02;

import java.util.Scanner;

public class ScannerFor_1049 {

	// 1. 키보드로 정수(숫자) 를 입력 받고 Scanner와 for문을 활용하여 #을 출력하는 프로그램을 작성하라
	// 예를 들어, 3을 입력 받았으면 그 결과는 다음과 같다.
	public static void main(String[] args) {// main start
		//스캐너는 키보드
		Scanner input = new Scanner(System.in);
		// 입력받은 값 저장
		int inputInt = input.nextInt();
		for (int i = 1; i <= inputInt; i++) {
			System.out.print("#");
		}
		input.close();
	}// end main

}// end class
