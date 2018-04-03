package com.gsitm.java.ex08;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: BabyCat_1056.java 
* @Project				: gsitm_java2 
* @Date					: 2018. 4. 3. 
* @작성자					: 이상훈
* @프로그램 설명			: 상속과 오버라이딩 관련해서 새끼고양이 객체 만들기
*/
public class BabyCat_1056 extends MamaCat_1056{
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("음메");
	}
	
	public static void main(String[] args) {
		MamaCat_1056 mamaCat = new MamaCat_1056();
		mamaCat.cry();
		
		BabyCat_1056 babyCat = new BabyCat_1056();
		babyCat.cry();
	}
}
