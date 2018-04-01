package com.gsitm.practice.ex02;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerFor_1061.java 
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자                : 임혜성
* @프로그램 설명           : 키보드로 정수(숫자)를 입력받고 Scanner와 for문을 활용하여 #을 출력하는 프로그램을 작성하라
*						 ex) 3을 입력받으면 => ###
*/
public class ScannerFor_1061 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int value = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < value; i++) {  
			System.out.print("#");
		}
	}  
}  
