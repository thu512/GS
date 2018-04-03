package com.gsitm.java.ex08;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : BabyCat_1033.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 4. 3. 
 * @작성자            : 김윤지
 * @프로그램 설명                : 아기고양이 클래스 - 엄마고양이 클래스를 상속받음. cry()메소드 오버라이딩함. 메인 위치.
 */
public class BabyCat_1033 extends MommyCat_1033 {
	
	@Override
	public void cry() {
		System.out.println("음메");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MommyCat_1033 mom = new MommyCat_1033();
		BabyCat_1033 baby = new BabyCat_1033();
		mom.cry();
		baby.cry();
	}

}