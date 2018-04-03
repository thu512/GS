package com.gsitm.java.ex09;

/** 
*	 @과목명                : GS ITM 인턴사원 자바교육
*	 @FileName            : EditPlus_1071.java 
*	 @Project             : gsitm_java2 
*	 @Date                : 2018. 4. 3. 
*	 @작성자                : 진민영
* 	 @프로그램 설명           : 추상클래스 사용법 익히기(메모장 클래스와 에디트 플러스 클래스 만들기)
*/
public class EditPlus_1071 extends Notepad_1071{
	@Override
	public void add() {
		System.out.println("FTP 및 빌드 기능");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EditPlus_1071 edit = new EditPlus_1071();
		edit.add();
		edit.read();
		edit.write();
	}

}
