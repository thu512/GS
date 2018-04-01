package com.gsitm.practice.ex02;

import java.util.Scanner;

/**
 *  @과목명                : GS ITM 인턴사원 자바교육  
 * 	@FileName            : ScannerFor_1039.java
 *  @Project             : gsitm_java 
 *  @Date                : 2018. 3. 28.   
 * 	@작성자                : 남동길
 *  @프로그램 설명           : 키보드로 정수(숫자)를 입력받고 Scanner와 for문을 활용하여 #을 출력하는 프로그램을
 * 							작성하라. 예를 들어, 3을 입력받았으면 그 결과는 다음과 같다. ###
 */
public class ScannerFor_1039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수를 입력하세요!!:"); // 출력
		Scanner scn = new Scanner(System.in); // 스캐너 객체 생성
		try {
			int num1 = scn.nextInt(); // 키보드로 정수값 입력받기
			String result = ""; // 결과를 출력해주기 위한 변수 선언
			for (int i = 0; i < num1; i++) { // 입력받은 정수값 만큼 반복해서 result 변수에 # 누적
				result += '#';
			}
			System.out.println(result); // 결과값 출력
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (scn != null)
				scn.close(); // 스캐너 객체 close
		}

	}

}
