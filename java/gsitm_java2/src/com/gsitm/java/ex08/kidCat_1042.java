package com.gsitm.java.ex08;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : kidCat_1042.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 박소현
* @프로그램 설명           : 새끼 고양이 클래스 정의
*/
public class kidCat_1042 extends momCat_1042 {
	
	public kidCat_1042(String hand, String leg, String sholder) {
		// TODO Auto-generated constructor stub
		super(hand, leg, sholder);
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("음메");
	}

	private void stolen() {
		System.out.println("살금살금");
	}
}
