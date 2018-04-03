package com.gsitm.java.ex06;

/**
 *    @과목명                : GS ITM 인턴사원 자바교육  @FileName            :
 * Manager_1030.java   @Project             : gsitm_java2   @Date               
 * : 2018. 3. 30.   @작성자                : 김동범  @프로그램 설명 : 사육자 클래스. 사육사 클래스에서
 * 호랑이, 사자의 상태 확인
 */
public class Manager_1030 {
	Tiger_1030 tiger = new Tiger_1030();
	Lion_1030 lion = new Lion_1030();

	void tigerCheck() {
		System.out.println("호랑이가 현재 밥을 먹었는 지 : " + tiger.isFood());
		if (!tiger.isFood())
			tiger.setFood(true);
		System.out.println("호랑이의 최종 상태 : " + tiger.isFood());
	}

	void lionCheck() {
		System.out.println("사자가 현재 밥을 먹었는 지 : " + lion.isFood());
		if (!lion.isFood())
			lion.setFood(true);
		System.out.println("사자의 최종 상태 : " + lion.isFood());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager_1030 ck = new Manager_1030();
		ck.tigerCheck();
		ck.lionCheck();
	}

}
