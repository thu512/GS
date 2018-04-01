package com.gsitm.practice.ex02;

import java.util.Scanner;

/** 
* @과목	            : GS ITM 인턴사원 자바교육
* @FileName         : ScannerFor_1048.java 
* @Project          : gsitm_java 
* @Date             : 2018. 3. 28. 
* @작성자			    : 신종욱
* @프로그램 설명       : 
*/
public class ScannerFor_1048 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
//		int Num = s.nextInt();
		String inputSting = s.nextLine();
		int Num = Integer.parseInt(inputSting);
		
		for(int i = 0; i<Num; i++) {
			System.out.print("#");
		}
		

	}

}
