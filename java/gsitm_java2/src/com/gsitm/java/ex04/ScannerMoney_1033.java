package com.gsitm.java.ex04;
import java.util.*;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : ScannerUpper_1033.java 
 * @Project         : gsitm_java 
 * @Date            : 2018. 3. 28. 
 * @작성자            : 김윤지
 * @프로그램 설명                : 액수를 입력받아 각 지폐 및 동전이 몇 매(개) 필요한지 표시하는 프로그램 작성
 */
public class ScannerMoney_1033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		System.out.print("오만원권 ");
		System.out.print(money/50000);
		money = money%50000;
		System.out.print("매, 만원권 ");
		System.out.print(money/10000);
		money = money%10000;
		System.out.print("매, 천원권 ");
		System.out.print(money/1000);
		money = money%1000;
		System.out.print("매, 500원짜리 동전 ");
		System.out.print(money/500);
		money = money%500;
		System.out.print("개, 100원짜리 동전 ");
		System.out.print(money/100);
		money = money%100;
		System.out.print("개, 50원짜리 동전 ");
		System.out.print(money/50);
		money = money%50;
		System.out.print("개, 10원짜리 동전 ");
		System.out.print(money/10);
		money = money%10;
		System.out.println("개, 1원짜리 동전 " + money + "개");
	}
}
