package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : babyCat_1036.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 김준혁
* @프로그램 설명         : 상속받는 아기고양이 구현  + 메인
*/
public class BabyCat_1036 extends MotherCat_1036{
	
	public BabyCat_1036() {
	}

	@Override
	public void cry() {
		System.out.println("음메");
	}
	
	public static void main(String[] args) {
		MotherCat_1036 mother = new MotherCat_1036();
		BabyCat_1036 baby = new BabyCat_1036();
		
		System.out.println("이쁜 엄마고양이가 우는소리입니다.");
		mother.cry();
		System.out.println("깜직한 아기고양이가 우는소리입니다.");
		baby.cry();
	}
}






