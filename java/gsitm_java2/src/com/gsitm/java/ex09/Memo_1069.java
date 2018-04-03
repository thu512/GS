/**
 * 
 */
package com.gsitm.java.ex09;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: memo_1069.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 4. 3. 
* @작성자					: 조현우
* @프로그램 설명			: 메모장 클래스를 통한 일반메소드, 추상메소드 기능 구현 실습
*/
public abstract class Memo_1069 {
	
	// 읽기 메서드
	public void read() {
		System.out.println("읽기");
	}
	// 쓰기 메서드
	public void write() {
		System.out.println("쓰기");
	}
	// 부가 기능 추상 메서드
	public abstract void subFunction();
}
