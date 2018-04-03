package com.gsitm.java.ex09;

/**
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : EditPlus_1059.java
* @Project             : gsitm_java2
* @Date                : 2018. 4. 3.
* @작성자              : 이종건
* @프로그램 설명       : 추상클래스 실습
*/
public class EditPlus_1059 extends NotePad_1059 {
	
	// 추상 메소드 재정의
	@Override
	public void moreFunction() {
		System.out.println("FTP 및 빌드 기능");
	}
	
	public static void main(String[] args) {
		EditPlus_1059 editPlus = new EditPlus_1059();
		
		editPlus.moreFunction();
	}

}
