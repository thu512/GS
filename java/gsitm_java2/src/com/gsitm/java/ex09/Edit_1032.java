package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : Edit_1032.java
* @Project             : gsitm_java2
* @Date                : 2018. 4. 3.
* @작성자                : 김수진
* @프로그램 설명           : 에디트클래스는 부가기능 메소드 재정의하는 클래스
*/
public class Edit_1032 extends Memo_1032{

	@Override
	public void addFunc() {  //추상메소드 재정의
		// TODO Auto-generated method stub
		System.out.println("FTP 및 빌드 기능");
	}
	
	public static void main(String[] args) {
		Edit_1032 ed = new Edit_1032();  //자식클래스 객체 생성
		ed.addFunc();
	}
}
