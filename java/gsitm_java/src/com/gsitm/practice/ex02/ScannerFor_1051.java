package com.gsitm.practice.ex02;

import java.util.Scanner;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : ScannerFor_1051.java
 * @Project         : gsitm_java
 * @Date            : 2018. 3. 28.
 * @작성자            : 위재원
 * @프로그램 설명      		: 
 */
public class ScannerFor_1051 {

	public static void main(String[] args) {
		// Scanner 선언
		Scanner sc = new Scanner(System.in);
		// Scanner로 입력받아 int형으로 바꿔준 뒤 num이라는 변수에 넣어준다.
		int num = Integer.parseInt(sc.nextLine());
		
		// for문을 돌려 Scanner로 받은 만큼 #을 출력해준다.
		for(int i=0; i<num; i++) {
			System.out.print("#");
		}
	}
}
