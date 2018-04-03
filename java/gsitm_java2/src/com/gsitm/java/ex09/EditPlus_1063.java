package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : EditPlus_1063.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 유희수
* @프로그램 설명           : 메모장 추상클래스 실습예제
*/
public class EditPlus_1063 extends Memo_1063{

	@Override
	public void edition() {
		System.out.println("FTP 및 빌드 기능입니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EditPlus_1063 ep = new EditPlus_1063();
		ep.edition();
		
	}
	
	
}
