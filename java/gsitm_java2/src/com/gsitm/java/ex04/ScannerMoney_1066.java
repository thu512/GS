package com.gsitm.java.ex04;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1066.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 정진
* @프로그램 설명           : 돈 변환
*/
public class ScannerMoney_1066 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int num_temp = num;

		int[] numofMoney = new int[8];
		numofMoney[0] = num_temp / 50000;
		num_temp -= numofMoney[0] * 50000;

		numofMoney[1] = num_temp / 10000;
		num_temp -= numofMoney[1] * 10000;

		numofMoney[2] = num_temp / 1000;
		num_temp -= numofMoney[2] * 1000;

		numofMoney[3] = num_temp / 500;
		num_temp -= numofMoney[3] * 500;

		numofMoney[4] = num_temp / 100;
		num_temp -= numofMoney[4] * 100;

		numofMoney[5] = num_temp / 50;
		num_temp -= numofMoney[5] * 50;

		numofMoney[6] = num_temp / 10;
		num_temp -= numofMoney[6] * 10;

		numofMoney[7] = num_temp % 10;

		String string = "";
		for (int i = 0; i < numofMoney.length; i++) {
			int count = numofMoney[i];
			if (count != 0) {
				switch (i) {
				case 0:
					string += "오만원권  " + count + "개, ";
					break;
				case 1:
					string += "만원권  " + count + "매, ";
					break;
				case 2:
					string += "천원권  " + count + "매, ";
					break;
				case 3:
					string += "500원짜리 동전  " + count + "개, ";
					break;
				case 4:
					string += "100원짜리 동전  " + count + "개, ";
					break;
				case 5:
					string += "50원짜리 동전  " + count + "개, ";
					break;
				case 6:
					string += "10원짜리 동전  " + count + "개, ";
					break;
				case 7:
					string += "1원짜리 동전  " + count + "개, ";
					break;
				}
			}
		}
		string = string.substring(0, string.length() - 2);
		System.out.println(num + " 입력 > " + string);
		scanner.close();

	}

}
