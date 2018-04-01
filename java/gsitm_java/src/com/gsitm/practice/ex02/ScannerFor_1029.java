package com.gsitm.practice.ex02;
import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerFor_1029.java 
* @Project             : gsitm_java 
* @Date                : 2018. 3. 28. 
* @작성자                : 고하윤
* @프로그램 설명           : 실습 1번
*/
public class ScannerFor_1029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int inputNum = scanner.nextInt();
		
		for(int i=0; i<inputNum; i++) {
			System.out.print("#");
		}
		scanner.close();
	}
}
