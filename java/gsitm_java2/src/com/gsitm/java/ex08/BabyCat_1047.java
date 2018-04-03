package com.gsitm.java.ex08;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : BabyCat_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 4. 3. 
 * @작성자            : 송현석
 * @프로그램 설명                : 새끼고양이 클래스. 어미고양이의 필드와 메소드를 상속받고, weep메소드를 재정의한다.
 */
public class BabyCat_1047 extends MomCat_1047{

	@Override
	public void weep() {//부모의 weep()메소드를 재정의 한다.
		System.out.println("음메....");
	}
}
