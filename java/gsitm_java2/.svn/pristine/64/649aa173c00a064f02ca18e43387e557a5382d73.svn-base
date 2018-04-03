package com.gsitm.java.ex08;

/** 
* @과목명                	: GS ITM 인턴사원 자바교육
* @FileName           	: BabyCat_1030.java 
* @Project             	: gsitm_java2 
* @Date                	: 2018. 4. 3. 
* @작성자                	: 김동범
* @프로그램 설명			: 새끼고양이
*/
public class BabyCat_1030 extends MotherCat_1030 {
	@Override
	public void cry() {
		System.out.println("음메");
	}
	
	public static void main(String[] args) {
		MotherCat_1030 mc = new MotherCat_1030();
		BabyCat_1030 bc = new BabyCat_1030();
		
		System.out.println(mc.arm);
		System.out.println(mc.leg);
		System.out.println(mc.shoulder);
//		System.out.println(mc.hairColor);		=> 외부 클래스이기 때문에 부를 수 없다.
//		mc.steal();
		mc.cry();
		System.out.println(mc.getHairColor());	// getter로 불러옴
		
		System.out.println(bc.arm);
		System.out.println(bc.leg);
		System.out.println(bc.shoulder);
//		System.out.println(bc.hairColor);
//		bc.steal();								=> 상위 클래스의 private이기 때문에 안된다.
		bc.cry();
		System.out.println(bc.getHairColor());	// getter는 public 메소드이기때문에 불러올 수 있다.
	}
}
