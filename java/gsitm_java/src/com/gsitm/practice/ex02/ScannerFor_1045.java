package com.gsitm.practice.ex02;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerFor_1045.java 
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자                : 손원락
* @프로그램 설명           : scanner를 이용한 # 찍기
*/
public class ScannerFor_1045 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int scnNum = scanner.nextInt();
		
		for(int i = 0 ; i < scnNum ; i++) {
			System.out.println("#");
		} // for end

	} //main end

} //class end
