package com.gsitm.java.ex09;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: NotePad_1056.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 4. 3. 
* @작성자					: 이상훈
* @프로그램 설명			: 추상메서드와 관련된 메모장 프로그램
*/
public abstract class NotePad_1056 {
	private String memo;

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	abstract String addOtherModule();
	
}
