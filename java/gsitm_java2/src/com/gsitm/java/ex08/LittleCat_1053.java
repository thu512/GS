package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : LittleCat_1053.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 은종현
* @프로그램 설명           : 상속 실습 (little cat class)
*/
public class LittleCat_1053 extends Cat_1053 {

	@Override
	public void howl() {
		System.out.println("음매");
	}

	public static void main(String[] args) {
		Cat_1053 momCat = new Cat_1053();
		LittleCat_1053 littleCat = new LittleCat_1053();

		momCat.howl();
		littleCat.howl();
	}

}
