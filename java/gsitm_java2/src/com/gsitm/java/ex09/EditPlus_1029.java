package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : EditPlus_1029.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 고하윤
* @프로그램 설명           : 부가기능 메소드 재정의
*/
public class EditPlus_1029 extends Notepad_1029{

	@Override
	public void addOns() {
		System.out.println("FTP 및 빌드 기능");
	}
	
	public static void main(String[] args) {
		EditPlus_1029 editplus = new EditPlus_1029();
		
		editplus.read();
		editplus.write();
		editplus.addOns();
	}
}
