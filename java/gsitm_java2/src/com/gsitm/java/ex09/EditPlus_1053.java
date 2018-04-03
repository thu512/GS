package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : EditPlus_1053.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 은종현
* @프로그램 설명           : 추상클래스 실습 (EditPlus Class)
*/
public class EditPlus_1053 extends Memopad_1053 {

	public static void main(String[] args) {
		EditPlus_1053 editPlus = new EditPlus_1053();
		editPlus.additionalFuntion();
		editPlus.read();
		editPlus.write();
	}

	@Override
	public void additionalFuntion() {
		System.out.println("부가기능");
	}

}
