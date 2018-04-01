package com.gsitm.java.ex04;

import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : ScannerMoney_1065.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 28. 
* @작성자                : 정광수
* @프로그램 설명           : 실습 3번 문제
*/
public class ScannerMoney_1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int money = scan.nextInt();
			int divideArr[] = { 50000, 10000, 1000, 100, 50, 10 ,1};
			Object resultArr[] = new Object[7];
			String msg = "50,000원권:{0}개 \n10,000원권:{1}개  \n1,000원권:{2}개  \n100원:{3}개 \n50원:{4}개 \n10원:{5}개 \n1원:{6}개 ";
			for (int i = 0; i < divideArr.length; i++) {
				resultArr[i] = money / divideArr[i];
				money %= divideArr[i];
			}
			String result = new String();
			result = MessageFormat.format(msg, resultArr);
			System.out.println(result);
			
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력해주세요");

		} finally {
			scan.close();
		}

	}
}
