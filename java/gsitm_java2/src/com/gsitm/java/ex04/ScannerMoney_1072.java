package com.gsitm.java.ex04;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @과목명			: GS ITM 인턴사원 자바교육
 * @FileName		: ScannerMoney_1072.java
 * @Project			: gsitm_java2
 * @Date			: 2018. 3. 28.
 * @작성자			: 차주현
 * @프로그램 설명	:
 */
public class ScannerMoney_1072 {
	public static final int MONEY_DIV = 50000;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		boolean toggle = true; //테스트
		
		ArrayList<Integer> mount = new ArrayList<Integer>(); // 화폐 단위별 개수 저장 리스트
		
//		화폐 단위와 개수 계산 부분
		int div = MONEY_DIV; // 지폐 단위
		while(money > 0) {
			int m = money / div; // 몫
			money = money - (div * m); // 해당 지폐 수 * 값만큼 빼준 값
			mount.add(m);
			if(toggle) {
				div /= 5;
				toggle = !toggle;
			}
			else {
				div /= 2;
				toggle = !toggle;
			}
		}
//		화폐 단위와 개수 출력 부분
		toggle = true;
		div = MONEY_DIV;
		for (Integer integer : mount) {
			if(integer != 0) {
				System.out.println(getMoneyString(div, integer));
			}
			if(toggle) {
				div /= 5;
				toggle = !toggle;
			}
			else {
				div /= 2;
				toggle = !toggle;
			}
		}
	}
	public static String getMoneyString(int div, int value) {
		String str = String.valueOf(div);
		if(div >= 1000) {
			str += "원권 " + value + "매";
		}
		else {
			str += "원짜리 " + value + "개";
		}
		return str;
	}

}
