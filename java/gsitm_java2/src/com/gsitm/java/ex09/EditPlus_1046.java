package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : EditPlus_1046.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 손혜성
* @프로그램 설명           : 추상 클래스 상속(자식 클래스)
*/
public class EditPlus_1046 extends Notepad_1046 {

	@Override
	public void additionalFuntion() {
		// TODO Auto-generated method stub
		System.out.println("에디트 플러스에는 FTP 및 빌드 기능이 있습니다.");
	}
	
	public static void main(String[] args) {
		EditPlus_1046 editor = new EditPlus_1046();
		
		editor.write();
		editor.read();
		editor.additionalFuntion();
	}
}
