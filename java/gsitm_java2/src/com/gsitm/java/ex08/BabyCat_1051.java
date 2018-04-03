package com.gsitm.java.ex08;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : BabyCat_1051.java
 * @Project         : gsitm_java2
 * @Date            : 2018. 4. 3.
 * @작성자            : 위재원
 * @프로그램 설명      		: 자식 클래스로, 엄마고양이 클래스를 상속받고 있다.
 */
public class BabyCat_1051 extends MotherCat_1051{

	public static void main(String[] args) {
		BabyCat_1051 baby = new BabyCat_1051();
		
		baby.crying();
	}
	
	@Override
	public void crying() {
		System.out.println("음메");
	}

}
