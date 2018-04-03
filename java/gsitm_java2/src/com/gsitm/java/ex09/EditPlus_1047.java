package com.gsitm.java.ex09;

/** 
 * @과목명            : GS ITM 인턴사원 자바교육
 * @FileName        : EditPlus_1047.java 
 * @Project         : gsitm_java2 
 * @Date            : 2018. 4. 3. 
 * @작성자            : 송현석
 * @프로그램 설명                : 추상 클래스를 상속하는 클래스. 추상 메소드인 addOnFeature를 재정의한다.
 */
public class EditPlus_1047 extends MemoNote_1047{

	@Override
	public void addOnFeature() {
		// TODO Auto-generated method stub
		System.out.println("FTP 및 빌드 기능");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EditPlus_1047 memo = new EditPlus_1047();
		memo.addOnFeature();
	}

}
