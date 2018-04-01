package com.gsitm.java.ex04;

import java.util.Scanner;


/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1032.java
* @Project             : gsitm_java2
* @Date                : 2018. 3. 28.
* @작성자                : 김수진
* @프로그램 설명           : 키보드에서 정수로 된 돈의 액수를 입력받아 오만원권, 만, 천, 500, 100, 50, 10, 1 동전 몇개로 변환되는지 출력하는 프로그램
*/
public class ScannerMoney_1032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("입력 : ");
		Scanner scanner = new Scanner(System.in);
		int inputMoney = scanner.nextInt();
		int[] count = new int[8];  //돈 개수 저장
		int[] money = {50000, 10000, 1000, 500, 100, 50, 10, 1};  //돈 단위
		String[] arr = { "5만", "1만", "1천", "100", "50", "10", "1" };  //나중에 출력에서 보여줄 때 몇 만원인가 확인
		for(int i=0;i<count.length;i++) {
			count[i]=inputMoney/money[i];  //돈 개수를 count에 저장
			inputMoney=inputMoney%money[i];  //남은 돈
		}
		for (int i = 0; i < count.length; i++) {  //돈 개수 출력하기
			if (count[i] != 0) {
				System.out.println(arr[i] + " : " + count[i]);
			}
		}
		scanner.close();
	}

}
