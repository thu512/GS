/**
 * 
 */
package com.gsitm.java.ex09;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName			: EditPlus_1044.java
* @Project			: gsitm_java2
* @Date				: 2018. 4. 3. 
* @작성자				: 성동원
* @프로그램 설명		: 자식클래스 구현
*/
public class EditPlus_1044 extends Memo_1044{

	/*
	 * 부가 기능 재정의
	 * 부모에게서 추상메서드를 꼭 구현해야만한다.
	 * */
	@Override
	public void addFunction() {
		System.out.println("FTP 및 빌드 기능");
	}
	
}
