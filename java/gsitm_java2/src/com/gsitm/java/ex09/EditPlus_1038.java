package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : EditPlus_1038.java 
* @Project             : gsitm_java2 
* @Package             : com.gsitm.java.ex09
* @Date                : 2018. 4. 3. 오후 1:42:19
* @작성자                : it1038 Hyosang Kim
* @프로그램 설명           : 
*추상클래스_사번인 메모장 클래스를 생성하고
메모장 클래스는 일반메소드인 읽기, 쓰기를 갖는다.
메모장 클래스는 추상메소드인 부가기능 메소드를 갖는다.

자식클래스인 에디트플러스_사번은 부가기능 메소드를 재정의하여, "FTP 및 빌드 기능"을 표준출력으로 표현한다.
*/
public class EditPlus_1038 extends Memo_1038 {
	
	@Override
	public void subFunction() {
		System.out.println("FTP 및 빌드 기능");
	}
	public static void main(String[] args) {
		Memo_1038 memo = null;
		memo = new EditPlus_1038();
		memo.write();
		memo.read();
		memo.subFunction();
	}
}
