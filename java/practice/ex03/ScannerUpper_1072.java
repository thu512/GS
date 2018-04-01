package com.gsitm.practice.ex03;

import java.util.Scanner;

/** 
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: ScannerUpper_1072.java
 * @Project			: gsitm_java
 * @Date			: 2018. 3. 28.
 * @작성자			: 차주현
 * @프로그램 설명	:
 */
public class ScannerUpper_1072 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String in = scanner.next();
		if(in.length() == 0 || in.length() > 1) {
			System.out.println("입력 범위를 초과했습니다.");
		}
		else {
			//정상 1문자 입력
			char ch = in.charAt(0);
			System.out.println("입력 : " + ch);
			if((ch >= 'a' && ch <= 'z')
					|| (ch >= 'A' && ch <= 'Z')) {
				System.out.println("출력 : " + Character.toUpperCase(ch));
			}
			else {
				System.out.println("영문자가 아닙니다.");
			}
		}
	}

}
