/**
 * 
 */
package com.gsitm.java.ex09;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: EditPlus_1069.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 4. 3. 
* @작성자					: 조현우
* @프로그램 설명			: 부모 클래스인 memo 클레스에서 부가기능 메소드를 재정의하여 FTP 및 빌드 기능을 표준출력으로 표현
*/
public class EditPlus_1069 extends Memo_1069{
	
	// memo클레스의 추상메소드를 오버라이딩을 통한 재정의 하는 메서드
	@Override
	public void subFunction() {
		System.out.println("FTP 및 빌드기능");
	}
	public static void main(String[] args) {
		// memo 타입의 edit 클레스 객체 정의
		Memo_1069 edit = new EditPlus_1069();
		edit.read();
		edit.write();
		edit.subFunction();
	}

}
