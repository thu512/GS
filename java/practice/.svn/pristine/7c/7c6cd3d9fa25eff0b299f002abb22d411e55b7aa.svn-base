package com.gsitm.practice.ex03;

import java.util.Scanner;

public class ScannerUpper_1067 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString = null;
		
		try {
			System.out.println("-----영문자를 입력해주세요-----");
			inputString = scan.nextLine();
			
			if(inputString.charAt(0) < 65 || inputString.charAt(0) > 122) {
				throw new Exception("영문자가 아닙니다.");
			}
			
			// 여러 글자가 들어와도 한글자만 출력
			System.out.println(inputString.substring(0, 1).toUpperCase());
			
		} catch (Exception e) {
			System.out.println("Error: " + e);
		} finally {
			System.out.println("-----종료-----");
			scan.close();
		}
		
	}
}
