package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Trainer_1052.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 박보미
* @프로그램 설명           : 사자와 호랑이가 밥 먹었는지 확인하고, 안먹었다면 밥을 준다  
*/
public class Trainer_1052 {

	static void haveMeals(Lion_1052 lion, Tiger_1052 tiger) {

		if (lion.isMeal() && tiger.isMeal()) { // 둘 다 밥 먹은 경우
			System.out.println("호랑이 사자 모두 밥 먹었습니다.");
		}
		if (!lion.isMeal() && !tiger.isMeal()) { // 둘 다 밥 안먹은 경우 메시지 출력 후 모두 밥을 준다 
			System.out.println("호랑이 사자 모두 밥 안먹었습니다.");
			lion.setMeal(true);
			tiger.setMeal(true);
		} else {
			if (!lion.isMeal()) { // 사자만 안먹은 경우 메시지 출력 후 밥 준다
				System.out.println("사자는 밥 안먹었습니다.");
				lion.setMeal(true);
			}
			if (!tiger.isMeal()) { // 호랑이만 안먹은 경우 메시지 출력 후 밥 준다
				System.out.println("호랑이는 밥 안먹었습니다.");
				tiger.setMeal(true);
			}
		}
	}

	public static void main(String[] args) {

		Lion_1052 lion = new Lion_1052(false);
		Tiger_1052 tiger = new Tiger_1052(false);

		System.out.println("사육사가 첫 번째로 확인합니다.");
		Trainer_1052.haveMeals(lion, tiger);

		System.out.println("\n사육사가 두 번째로 확인합니다. ");
		Trainer_1052.haveMeals(lion, tiger);
	}
}
