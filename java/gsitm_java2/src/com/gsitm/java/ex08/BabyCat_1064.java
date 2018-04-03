package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : BabyCat_1064.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 장진영
* @프로그램 설명            : 어미고양이 클래스를 상속받고 cry() 재정의
*/
public class BabyCat_1064 extends MomCat_1064 {
	@Override
	public void cry() {
		System.out.println("음메");
		super.cry();
	}
	
	public static void main(String[] args) {
		BabyCat_1064 baby = new BabyCat_1064();
		baby.cry();
	}
}
