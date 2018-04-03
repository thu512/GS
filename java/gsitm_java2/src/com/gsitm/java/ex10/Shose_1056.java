package com.gsitm.java.ex10;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: Shose_1056.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 4. 3. 
* @작성자					: 이상훈
* @프로그램 설명			: 중첩 인터페이스 신발
*/
public interface Shose_1056 {
	int SHOSE_SIZE = 260;
	default void putOnShose() {
		System.out.println("신발을 신는다.");
	}
	void throwShose();
}
