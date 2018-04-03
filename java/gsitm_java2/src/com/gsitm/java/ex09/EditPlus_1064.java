package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : EditPlus_1064.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 장진영
* @프로그램 설명           : 추상클래스의 구현 및 실행
*/
public class EditPlus_1064 extends Memo_1064 {
	@Override
	public void addFunc() {
		System.out.println("FTP 및 빌드 기능");
	}

	public static void main(String[] args) {
		EditPlus_1064 editPlus = new EditPlus_1064();
		editPlus.addFunc();
		editPlus.write("헬로");
		System.out.println(editPlus.read());
	}

}
