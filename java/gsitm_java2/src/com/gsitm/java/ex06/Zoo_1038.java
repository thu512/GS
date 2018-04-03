package com.gsitm.java.ex06;

import java.util.Scanner;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Zoo_1038.java 
* @Project             : gsitm_java2 
* @Package             : com.gsitm.java.ex06
* @Date                : 2018. 3. 30. 오후 3:44:27
* @작성자                : it1038 Hyosang Kim
* @프로그램 설명           : 1. 사육사는 사자와 호랑이가 밥을 먹었는지 체크하는
						 2. 사자와 호랑이의 밥먹었는지 여부는 static
						 3. 사육사는 체크하고 체크한 값을 출력하라
						 4. ex06폴더에 클래스명_사번으로 생성
*/
public class Zoo_1038 {
	public static void main(String[] args) {
		
		lion_1038 lion = new lion_1038();
		tiger_1038 tiger = new tiger_1038();
		
		//상태확인
		boolean lionHungry = lion.check();
		boolean tigerHungry = tiger.check();
		
		System.out.println("밥 주려면 1을 누르시오.");
		
		Scanner scanner = new Scanner(System.in);
		
		if(scanner.nextInt() == 1) {
			//false일때 setEat true
			if(!lionHungry) {
				lion.setEat(true);
			}
			lion.check();
			
			if(!tigerHungry) {
				tiger.setEat(true);
			}
			tiger.check();
		}
		else {
			System.out.println("나는야 매정한 사육사");
		}
	}
}