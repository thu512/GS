package com.gsitm.java.ex10;

/** 
* @과목명				: GS ITM 인턴사원 자바교육
* @FileName         : Cloth_1065.java 
* @Project          : gsitm_java2 
* @Date           	: 2018. 4. 3. 
* @작성자           	: 정광수
* @프로그램 설명       : 옷 인터페이스
*/
public interface Cloth_1065 {
	public static final String CLOTH_SIZE="XL";
	/**
	 * @description 옷을 입다 Static Type
	 */
	public static void dressUp() {
		System.out.println(CLOTH_SIZE+"크기 옷을 입다");
	}
	public abstract void dressTear();
	
}
