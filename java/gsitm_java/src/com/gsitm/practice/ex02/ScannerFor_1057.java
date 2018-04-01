package com.gsitm.practice.ex02;
import java.util.Scanner;
/** 
* @과목명                 : GS ITM 인턴사원 자바교육
* @FileName             : ScannerFor_1057.java 
* @Project              : gsitm_java 
* @Date                 : 2018. 3. 28. 
* @작성자                 : 이융성
* @프로그램 설명            : 숫자를 입력하면 그 수만큼 #이 출력되는 프로그램
*/
public class ScannerFor_1057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int inputInt = scanner.nextInt();
		for (int i=1;i<=inputInt;i++) {
			System.out.print("#");
		}
	}

}
