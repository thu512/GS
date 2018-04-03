package com.gsitm.java.ex08;

/** 
* @과목명					: GS ITM 인턴사원 자바교육
* @FileName				: momCat_1050.java 
* @Project				: gsitm_java 
* @Date					: 2018. 4. 3. 
* @작성자					: 우연찬
* @프로그램 설명			: 어미 고양이 클래스
*/
public class momCat_1050 {
	private String fur = "white";
	public String arm="";
	public String leg="";
	public String shoulder="";
	
	public  momCat_1050(String arm, String leg, String shoulder) {
		this.arm=arm;
		this.leg=leg;
		this.shoulder=shoulder;
	}
	
	
	public momCat_1050() {}


	public void cry(){
		System.out.println("엄마 고양이가 냐옹");
	}
	
	private void steal() {
		System.out.println("훔쳤습니다.");
	}
}
