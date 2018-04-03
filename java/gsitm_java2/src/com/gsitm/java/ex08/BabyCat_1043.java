package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : BabyCat_1043.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 백기반
* @프로그램 설명           : 오버라이드 실습
*/
public class BabyCat_1043 extends MomCat_1043 {
	
	@Override
	public String cry(String a) {
		super.cry("냐옹");
		return a;
	}
	
	public static void main(String[] args) {
		BabyCat_1043 baby = new BabyCat_1043();
		System.out.println(baby.cry("음메"));
	}

}
