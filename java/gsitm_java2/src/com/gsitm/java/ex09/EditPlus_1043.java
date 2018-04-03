package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : EditPlus_1043.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 백기반
* @프로그램 설명           : 추상클래스 실습
*/
public class EditPlus_1043 extends Memo_1043 {
	
	@Override
	
	public String addplus() {
		
		return "추가적인 기능";
	}
		
	
	
	
	
	public static void main(String[] args) {
		EditPlus_1043 ed = new EditPlus_1043();
		System.out.println(ed.addplus());
	}
}
