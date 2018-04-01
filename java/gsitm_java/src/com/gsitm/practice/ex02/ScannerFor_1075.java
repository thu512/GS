package com.gsitm.practice.ex02;

import java.util.Scanner;
/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: ScannerFor_1075.java 
* @Project			: gsitm_java 
* @Date				: 2018. 3. 28. 
* @작성자				: 최영롱
* @프로그램 설명		: 
*/
public class ScannerFor_1075 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print('#');
		}
		System.out.println();
	}
	
	

}
