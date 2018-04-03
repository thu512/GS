package com.gsitm.java.ex06;
import java.util.Scanner;
/** 
* @과목명                 : GS ITM 인턴사원 자바교육
* @FileName             : Person_1057.java 
* @Project              : gsitm_java2 
* @Date                 : 2018. 3. 30. 
* @작성자                 : 이융성
* @프로그램 설명            : 사육사 클래스
*/
public class Person_1057 {

	static void checkFeed() {
		System.out.println("--------현재 동물들의 식사 상태-------");
		System.out.println("1. 호랑이 : "+Tiger_1057.tigerFeed);
		System.out.println("2. 사자 : "+Lion_1057.lionFeed);
		System.out.println("먹이를 주려면 해당 동물의 번호를 입력하세요.");
	}
	
	static void feeding(int animalNum,boolean tiger,boolean lion) {
		
		

		if (animalNum==1) {
			if (tiger) {
				System.out.println("호랑이는 이미 밥을 먹었습니다.");
			}
			else {
				Tiger_1057.tigerFeed=true;
				System.out.println("호랑이는 밥을 먹고있습니다..");
				System.out.println("호랑이의 식사 상태 : "+Tiger_1057.tigerFeed);
			}
			
		}
		else if (animalNum==2) {
			if (lion) {
				System.out.println("사자는 이미 밥을 먹었습니다.");
			}
			else {
				Lion_1057.lionFeed=true;
				System.out.println("사자는 밥을 먹고있습니다..");
				System.out.println("사자의 식사 상태 : "+Lion_1057.lionFeed);
			}		
		}
	}
	public static void main(String[] args) {
		while (true) {
			checkFeed();
			Scanner scanner = new Scanner(System.in);
			int selection = scanner.nextInt();
			feeding(selection,Tiger_1057.tigerFeed,Lion_1057.lionFeed);
			if (Tiger_1057.tigerFeed&&Lion_1057.lionFeed) {
				System.out.println("동물들이 식사를 마쳤습니다.");
				break;
			}
		}
	}
}
