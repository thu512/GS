package com.gsitm.java.ex10;

/** 
* @과목명                : GS ITM 인턴사원 자바교육
* @FileName            : cloth_1046.java 
* @Project             : gsitm_java2 
* @Date                : 2018. 4. 3. 
* @작성자                : 손혜성
* @프로그램 설명           : 인터페이스의 다중상속(옷)
*/
public interface cloth_1046 {
	String size = "XL";
	
	static void wearClothes() {
		System.out.println("옷을 입다.");
	}
	public abstract void tear();
}
