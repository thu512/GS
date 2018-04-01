/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerUpper_1038.java 
* @Project             : gsitm_java 
* @Package             : com.gsitm.practice.ex03
* @Date                : 2018. 3. 28. 오후 2:58:53
* @작성자                : it1038 Hyosang Kim
* @프로그램 설명           : 
*/
package com.gsitm.practice.ex03;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerUpper_1038.java 
* @Project             : gsitm_java 
* @Package             : com.gsitm.practice.ex03
* @Date                : 2018. 3. 28. 오후 2:58:53
* @작성자                : it1038 Hyosang Kim
* @프로그램 설명           : Scanner 클래스를 이용하여 키보드에서 영문자 한 자를 입력받아 소문자를 대문자로 변환하여 출력하는 프로그램을 작성하라.
*						 ex) 입력 : s > 출력 : S
*/
public class ScannerUpper_1038 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		//int i = Integer.parseInt(inputString);
		System.out.println("입력된 소문자 = " + inputString);
		System.out.println("변환된 대문자 = " + inputString.toUpperCase());
		
	}

}
