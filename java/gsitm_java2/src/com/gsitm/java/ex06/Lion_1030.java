package com.gsitm.java.ex06;

/** 
* @과목명                	: GS ITM 인턴사원 자바교육
* @FileName           	: Lion_1030.java 
* @Project             	: gsitm_java2 
* @Date                	: 2018. 3. 30. 
* @작성자                	: 김동범
* @프로그램 설명			: 사자 클래스. 사자는 임의로 false 값을 넣음
*/
public class Lion_1030 {
	private static boolean food = false;

	public static boolean isFood() {
		return food;
	}
	public void setFood(boolean b) {
		this.food = b;
	}

}
