package com.gsitm.java.ex09;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : Editplus_1033.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 4. 3. 
 * @작성자            : 김윤지
 * @프로그램 설명                : 추상메소드의 오버라이딩을 실습해봄.
 */
public class Editplus_1033 extends Notepad_1033 {
	
	@Override
	public void advanced() {
		System.out.println("FTP 및 빌드 기능 구현함");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Editplus_1033 example = new Editplus_1033();
		example.read();
		example.write();
		example.advanced();
	}

}
