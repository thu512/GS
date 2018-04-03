package com.gsitm.java.ex06;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : trainer_1077.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자              : 허빛찬샘
* @프로그램 설명       : 사육사가 사자와 호랑이의 밥을 먹었는지 체크하는 클래스.
*/
public class trainer_1077 {
	lion_1077 lion = new lion_1077();
	tiger_1077 tiger = new tiger_1077();

	public static void main(String[] args) {
		trainer_1077 trainer = new trainer_1077();
		trainer.check();
		trainer.check();
	}
	public void check() {
		if(lion.feed) {
			System.out.println(lion.feed + " 사자가 밥을 먹었습니다.");
		}else {
			System.out.println(lion.feed + " 사자가 밥을 안먹었습니다.");
			lion.feed = true;
		}
		if(tiger.feed) {
			System.out.println(tiger.feed + " 호랑이가 밥을 먹었습니다.");
		}else {
			System.out.println(tiger.feed + " 호랑이가 밥을 안먹었습니다.");
			tiger.feed = true;
		}
		
	}
}
