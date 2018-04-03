package com.gsitm.java.ex08;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: babyCat_1050.java 
* @Project				: gsitm_java 
* @Date					: 2018. 4. 3. 
* @작성자					: 우연찬
* @프로그램 설명			: 새끼 고양이 클래스
*/
public class babyCat_1050 extends momCat_1050{

	
	public babyCat_1050(String arm, String leg, String shoulder) {
		super(arm,leg,shoulder);
	}
	public  babyCat_1050() {
		super();
	}
	@Override
	public void cry() {
		System.out.println("아기 고양이가 음메");
	}
	public static void main(String[] args) {
		momCat_1050 m = new momCat_1050();
		babyCat_1050 b = new babyCat_1050("팔이 짧다","다리가짧다","어께가 좁다");
		m.cry();
		b.cry();
	}
}
