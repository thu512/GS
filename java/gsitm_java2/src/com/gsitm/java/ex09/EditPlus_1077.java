package com.gsitm.java.ex09;

/** 
* @과목명              : GS ITM 인턴사원 자바교육
* @FileName            : EditPlus_1077.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자              : 허빛찬샘
* @프로그램 설명       : 추상메소드를 상속받은 EditPlus 클래스. additionalFunc()이 무조건 사용되어야 한다.
*/
public class EditPlus_1077 extends Notepad_1077 {
	@Override
	public void additionalFunc() {
		System.out.println("FTP 및 빌드 기능");
	}//부가기능 추상메소드 오버라이드

	public static void main(String[] args) {
		EditPlus_1077 EditPlus = new EditPlus_1077();
		EditPlus.additionalFunc();	//자식클래스 에서 재정의된 additionalFunc() 사용
		EditPlus.read();	//부모클래스에서 정의된 일반 메소드 사용.
	}//main
}//class
