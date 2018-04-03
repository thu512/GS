package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Trainer_1053.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 은종현
* @프로그램 설명           : [호랑이, 사자 밥먹는거 check 예제]사육사 클래스
*/
public class Trainer_1053 {

	private static boolean isEat;

	public static boolean isEat() {
		return isEat;
	}

	public static void setEat(boolean isEat) {
		Trainer_1053.isEat = isEat;
	}

	public void feedTiger(Tiger_1053 tiger) {
		System.out.println("I feed tiger");
		tiger.setEat(true);
	}

	public void feedLion(Lion_1053 lion) {
		System.out.println("I feed lion");
		lion.setEat(true);
	}

	public static void main(String[] args) {
		Trainer_1053 trainer = new Trainer_1053();
		Tiger_1053 tiger = new Tiger_1053();
		Lion_1053 lion = new Lion_1053();

		boolean tigerIsEat = false;
		boolean lionIsEat = false;

		tiger.setEat(tigerIsEat);
		lion.setEat(lionIsEat);

		if (!tigerIsEat) {
			trainer.feedTiger(tiger);
		}
		if (!lionIsEat) {
			trainer.feedLion(lion);
		}

	}

}
