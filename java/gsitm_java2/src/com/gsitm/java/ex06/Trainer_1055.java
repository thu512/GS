package com.gsitm.java.ex06;

import com.gsitm.java.ex05.RemoteCon_1055;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Trainer_1055.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 이경화
* @프로그램 설명           : 사육사 클래스. 사자와 호랑이의 밥먹었는지 체크하고 값을 출력. 
*						   밥안먹었으면 밥주는 행동까지
*/
public class Trainer_1055 {
	

	public static void main(String[] args) {
		
		Lion_1055 lion = new Lion_1055();
		Tiger_1055 tiger = new Tiger_1055();
		
		printfood(lion,tiger);
		feedAnimal(lion,tiger);
		printfood(lion,tiger);
		
	}

	private static void printfood(Lion_1055 lion, Tiger_1055 tiger) {
		System.out.println("사자밥 : " + lion.food);
		System.out.println("호랑이밥 : " + tiger.food);
		
	}

	private static void feedAnimal(Lion_1055 lion, Tiger_1055 tiger) {
		if(!lion.food) lion.food = true;
		if(!tiger.food) tiger.food = true;
		
	}

}
