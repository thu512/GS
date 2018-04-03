package com.gsitm.java.ex06;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : 호랑이_1066.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 정진
* @프로그램 설명           : 먹이 먹는 호랑이
*/
public class 호랑이_1066 {
	private static boolean eatFlag = false;

	public static void checkEat() {
		if (eatFlag) {
			System.out.println("호랑이가 밥을 먹었습니다.");
		} else {
			System.out.println("호랑이가 밥을 안먹었습니다.");
			Scanner scanner = new Scanner(System.in);
			System.out.print("밥을 주시겠습니까?(y/n) ");
			if (scanner.nextLine().equals("y")) {
				feed();
			}
		}
	}

	public static void feed() {
		eatFlag = true;
		System.out.println("호랑이에게 밥을 주었습니다.");
	}
}
