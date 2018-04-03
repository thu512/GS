package com.gsitm.java.ex08;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName         : BabyCat_1065.java 
* @Project          : gsitm_java2 
* @Date           	: 2018. 4. 3. 
* @작성자           	: 정광수
* @프로그램 설명       : 자식고양이
*/
public class BabyCat_1065 extends MomCat1065 {

	
	public BabyCat_1065(String furColor, String arm, String leg, String shoulder) {
		super(furColor,arm, leg, shoulder);
	}

	/**
	 * 메소드재정의
	 */
	@Override
	public void cry() {
		System.out.println("음매 음매");
	}

	@Override
	public String toString() {
		return "BabyCat_1065 [furColor=" + this.getFurColor() + ", arm=" + arm + ", leg=" + leg + ", shoulder=" + shoulder + "]";
	}

	
}
