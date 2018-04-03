package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : EditPlus_1066.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 정진
* @프로그램 설명           : 에디트 플러스(Notepad_1066 상속)
*/
public class EditPlus_1066 extends Notepad_1066 {

	@Override
	public void additionalMethod() {
		System.out.println("FTP 및 빌드 기능");
	}

	public static void main(String[] args) {
		Notepad_1066 notepad_1066 = new EditPlus_1066();
		notepad_1066.read();
		notepad_1066.write();
		notepad_1066.additionalMethod();
	}

}
