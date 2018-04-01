package com.gsitm.practice.ex03;

import java.util.Scanner;

/**   @과목명 : GS ITM 인턴사원 자바교육  @FileName : ScannerUpper_1050.java   @Project :
 * gsitm_java   @Date : 2018. 3. 28.   @작성자 : 우연찬  @프로그램 설명 : Scanner 클래스를 이용하여
 * 키보드에서 영문자 한 자를 입력받아 소문자를 대문자로 변환하여 출력하는 프로그램을 작성하라, 영문자가 아니면 아님을 나타내라. 입력: s
 * > 출력 : S
 */
public class ScannerUpper_1050 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		String str = scanner.next();
//65 , 90 //97 122
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>=65&&str.charAt(i)<=90)||(str.charAt(i)>=97&&str.charAt(i)<=122)) {
				System.out.print(Character.toUpperCase(str.charAt(i)));
			}else {
				System.out.println("영문자가 아닙니다.");
				break;
			}
		}
	}
}
