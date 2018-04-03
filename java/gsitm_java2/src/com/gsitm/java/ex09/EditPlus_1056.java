package com.gsitm.java.ex09;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: EditPlus_1056.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 4. 3. 
* @작성자					: 이상훈
* @프로그램 설명			: 추상메서드와 관련된 에디터플러스 만들기
*/
public class EditPlus_1056 extends NotePad_1056 {
	@Override
	String addOtherModule() {
		// TODO Auto-generated method stub
		return "FTP 및 빌드 기능";
	}
	
	public static void main(String[] args) {
		EditPlus_1056 ep = new EditPlus_1056();
		ep.setMemo("이것은 메모장 입니다.");
		System.out.println(ep.getMemo());
		System.out.println(ep.addOtherModule());
	}
	
}
