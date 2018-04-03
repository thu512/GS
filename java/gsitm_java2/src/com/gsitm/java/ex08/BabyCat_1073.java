package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : BabyCat_1073.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 채유진
* @프로그램 설명           : 부모클래스 상속 실습
*/
public class BabyCat_1073 extends MomCat_1073{
	@Override
	public void crying() {
		System.out.println("음메");
		super.crying();
	}
	public static void main(String[] args) {
		BabyCat_1073 babyCat = new BabyCat_1073();
		babyCat.crying(); 
	}
}
