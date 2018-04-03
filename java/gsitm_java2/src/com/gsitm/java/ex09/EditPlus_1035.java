package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : EditPlus_1035.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 김주승
* @프로그램 설명           : 추상 클래스 상속 및 추상메소드 오버라이딩
*/
public class EditPlus_1035 extends Text_1035 {
	//추상 메소드 오버라이딩
	@Override
	public void subFunc() {
		System.out.println("FTP 및 빌드 기능");
	}
	
	//메인 실행
	public static void main(String[] args) {
		EditPlus_1035 editPlus = new EditPlus_1035();
		//상속받은 일반 메소드 실행
		editPlus.read();
		editPlus.write();
		
		//오버라이딩 시킨 추상메소드 실행
		editPlus.subFunc();
	}
}
