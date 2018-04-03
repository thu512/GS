package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Keeper_1037.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 3. 30. 
* @작성자                : 김진우
* @프로그램 설명          : 사육사 
*/
public class Keeper_1037 {
	
	/**
	 * 
	 * @param lion
	 * @param tiger
	 * @return 사자와 호랑이의 밥 먹었는지 여부 확인
	 */
	public boolean checkFeeding(Lion_1037 lion, Tiger_1037 tiger) {
		boolean check = Lion_1037.hungry && Tiger_1037.hungry;
		System.out.println("사자와 호랑이의 밥 먹었는지 여부 : " + check);
		return check;
	}
	
	/**
	 * 
	 * @param lion
	 * @param tiger
	 * 사자와 호랑이에게 밥을 줌
	 */
	public void feed(Lion_1037 lion, Tiger_1037 tiger) {
		lion.hungry = true;
		tiger.hungry = true;
	}
	
	public static void main(String[] args) {
		
		Keeper_1037 keeper = new Keeper_1037();
		Lion_1037 lion = new Lion_1037();
		Tiger_1037 tiger = new Tiger_1037();
		
		if (!keeper.checkFeeding(lion, tiger)) {
			keeper.feed(lion, tiger);
			keeper.checkFeeding(lion, tiger);
		}
	}
}
