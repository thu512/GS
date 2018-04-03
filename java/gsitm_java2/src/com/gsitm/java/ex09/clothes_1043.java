package com.gsitm.java.ex09;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : clothes_1043.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 백기반
* @프로그램 설명           : 다중 인스턴스
*/
public interface clothes_1043 {
	
	public String SIZE = "XL";
	
	static String wearClothes(boolean c){
		if(c == true) {
			return "신었어";
		}
		else {
			return "안신었어";
		}
		
	}
	
	void ripClothes();
}
