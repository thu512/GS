package com.gsitm.java.ex06;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : lion_1038.java 
* @Project             : gsitm_java2 
* @Package             : com.gsitm.java.ex06
* @Date                : 2018. 3. 30. 오후 4:10:16
* @작성자                : it1038 Hyosang Kim
* @프로그램 설명           : 
*/
public class lion_1038 {
	private static boolean eat = false;
	public static boolean check() {
		if (eat) {
			System.out.println("사자 밥먹음");
		} else {
			System.out.println("사자 굶음");
		}
		return eat;
	}
	/**
	 * @return the eat
	 */
//	public static boolean isEat() {
//		return eat;
//	}
	/**
	 * @param eat the eat to set
	 */
	public static void setEat(boolean eat) {
		lion_1038.eat = eat;
	}
	
}
