package com.gsitm.practice.ex02;

import java.util.Scanner;

public class ScannerFor_1071 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner를 이용해 숫자를 입력받는다
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		
		//입력받은 숫자를 int형으로 변환해준다
		int inputInt=Integer.parseInt(inputString);
		
		//입력받은 숫자만큼 for문을 이용해 #를 출력한다.
		for(int i=0;i<inputInt;i++) {
			System.out.print("#");
		}
	}

}
