/**
 * 
 */
package com.gsitm.practice.ex02;

import java.util.Scanner;

/**
 *    @과목명 : GS ITM 인턴사원 자바교육  @FileName : ScannerFor_1044.java  @Project :
 * gsitm_java  @Date : 2018. 3. 28.   @작성자 : 성동원  @프로그램 설명 : 
 */
public class ScannerFor_1044 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		 문자열입력받는 nextLine()을 사용할 경우
		 String strNum = scanner.nextLine();
		 int num1 = Integer.parseInt(strNum);
		 for(int i=0;i<num1;i++) {
		 System.out.print("#");
		 }

		// System.out.println();

		// 정수를 입력받는 nextInt()를 사용할 경우
		// int num = scanner.nextInt();
		// for(int i=0;i<num;i++) {
		// System.out.print("#");
		// }

//		char c = '#';
//		String result = "";
//		int length = scanner.nextInt();
//		for (int i = 0; i < length; i++) {
//			result += c;
//		}
//		System.out.println(result);

		scanner.close();
	}

}
