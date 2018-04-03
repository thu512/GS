package com.gsitm.java.ex06;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Keeper_1076.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 최준우
* @프로그램 설명           : 사육사가 동물들의 식사여부를 체크하고 먹이를 주는 메인 클래스 
*/
public class Keeper_1076 {
	
	static boolean eatting = false;  // 먹이여부를 static으로 생성
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) {

				System.out.println("동물을 선택하세요...(사자 1/ 호랑이2)");  //동물을 선택(1번이면 사자, 2번이면 호랑이)
				Scanner sc = new Scanner(System.in); //입력 
				Animal_1076 animal = new Animal_1076(); //animal 객체 생성
				Eat_1076 eat = new Eat_1076(); // 먹이를 주기위해 eat 객체 생성
				
				if(sc.nextInt() == 1) {
					System.out.println("사자야 밥 먹었니?");
					if(eatting == false) {
						animal.setLion("밥을 먹지 않았습니다..."); //lion에 밥을 먹지 않았음을 주입
						System.out.println(animal.getLion()); //lion 호출
						eat.Feed(); //먹이를 주는 feed() 호출
						eatting = true; // 먹이를 먹이면 eatting을 true로 변환
					}
					else {
						animal.setLion("밥을 먹었습니다...");
						System.out.println(animal.getLion());				
					}
					
				}
				
				else if(sc.nextInt() == 2) {
					System.out.println("호랑이야 밥 먹었니?");
					if(eatting == false) {
						animal.setTiger("밥을 먹지 않았습니다...");
						System.out.println(animal.getTiger());
						eat.Feed(); //먹이를 주는 feed() 호출
						eatting = true;	// 먹이를 먹이면 eatting을 true로 변환
					}
					else {
						animal.setTiger("밥을 먹었습니다...");
						System.out.println(animal.getTiger());
					}
				}
				else { // 1,2이외의 것을 눌렀을때 다시 입력하라는 메세지 전송
					System.out.println("다시입력하세요...");
				}
		
		}
		
		

	}

}
