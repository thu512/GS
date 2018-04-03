package com.gsitm.java.ex06;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : ScannerUpper_1033.java 
 * @Project         : gsitm_java 
 * @Date            : 2018. 3. 28. 
 * @작성자            : 김윤지
 * @프로그램 설명                : 사자 객체
 */
public class Lion_1033 {

	private static boolean isFed = false; //밥을 먹지 않은 상태로 초기화
	
	public void check() { //상태를 체크하는 메소드
		if(isFed == true) {
			System.out.println("사자는 배부름");
		}
		else {
			System.out.println("사자는 배고픔");
		}
	}
	
	public boolean getStatus() {
		return isFed;
	}

	public void setStatus(boolean isFed) {
		this.isFed = isFed;
	}
}
