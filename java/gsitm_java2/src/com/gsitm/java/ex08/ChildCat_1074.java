package com.gsitm.java.ex08;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: ChildCat_1074.java 
* @Project			: gsitm_java2 
* @Date				: 2018. 4. 3. 
* @작성자				: 최규호
* @프로그램 설명		: 자식 고양이를 나타내는 클래스
*/
public class ChildCat_1074 extends MomCat_1074 {

	public ChildCat_1074(String color, boolean arm, boolean leg, boolean shoulder) {
		super(color, arm, leg, shoulder);
		
	}
	
	@Override
	public void cry() {
		System.out.println("음메");
	}

	public static void main(String[] args) {
		
		MomCat_1074 momCat = new MomCat_1074("Gold", true, true, true);
		ChildCat_1074 childCat = new ChildCat_1074("Black", true, true, true);
		momCat.cry();
		childCat.cry();
	}

}
