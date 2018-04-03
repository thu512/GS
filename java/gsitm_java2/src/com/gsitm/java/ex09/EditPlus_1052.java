package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Edit_1052.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 박보미
* @프로그램 설명           : 추상 클래스  구현 
*/
public class EditPlus_1052 extends Memo_1052 {

	@Override
	public void additionFunction() {
		System.out.println("FTP 및 빌드 기능");
	}

	public static void main(String[] args) {
		EditPlus_1052 edit = new EditPlus_1052();

		edit.additionFunction();
	}

}
