package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Keeper_1039.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 남동길
* @프로그램 설명           : 사육사 클래스, 호랑이와 사자가 밥을 먹었는지 체크하기
*/
public class Keeper_1039 {
	public static boolean checkEat(Object animal) {
		boolean result = false;
		if(animal instanceof Tiger_1039) {
			result = Tiger_1039.isEat;
			if(!result) {
				result = true;
				System.out.println("호랑이가 밥을 안먹어서 밥을 줬습니다.");
			}else {
				System.out.println("호랑이가 밥을 먹었네요.");
			}
		}else if(animal instanceof Lion_1039) {
			result = Lion_1039.isEat;
			if(!result) {
				result = true;
				System.out.println("사자가 밥을 안먹어서 밥을 줬습니다.");
			}else {
				System.out.println("사자가 밥을 먹었네요.");
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Tiger_1039 tiger = new Tiger_1039();
		Lion_1039 lion = new Lion_1039();
		System.out.println(checkEat(lion));
		System.out.println(checkEat(tiger));
		Tiger_1039.isEat = true;
		Lion_1039.isEat = true;
		System.out.println(checkEat(lion));
		System.out.println(checkEat(tiger));
	}
}
