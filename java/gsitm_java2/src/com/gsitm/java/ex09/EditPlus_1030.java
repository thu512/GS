package com.gsitm.java.ex09;

/** 
* @과목명                	: GS ITM 인턴사원 자바교육
* @FileName           	: EditPlus_1030.java 
* @Project             	: gsitm_java2 
* @Date                	: 2018. 4. 3. 
* @작성자                	: 김동범
* @프로그램 설명			: 에디트 플러스, addOns 재정의, main에서 모든 메소드 호출하기
*/
public class EditPlus_1030 extends Notepad_1030 {
	@Override
	public void addOns() {
		System.out.println("FTP 및 빌드 기능");
	}
	
	public static void main(String[] args) {
		EditPlus_1030 ep = new EditPlus_1030();
		ep.readNote();
		ep.writeNote();
		ep.addOns();
	}
}
